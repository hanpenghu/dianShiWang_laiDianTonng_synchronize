package com.aiBanShi.DianShiNet.service.laiDianTongToDianShi;

import com.aiBanShi.DianShiNet.dao.mapperJava1.HionContactMapper;
import com.aiBanShi.DianShiNet.dao.mapperJava1.HionCustomerMapper;
import com.aiBanShi.DianShiNet.dao.mapperJava2.AspnetMembersMapper;
import com.aiBanShi.DianShiNet.dto.*;
import com.aiBanShi.DianShiNet.utils.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 韩寒 on 2017-07-05.
 * 来电通同步到点识网
 */
@Component
public class L2D {
    @Autowired
    AspnetMembersMapper aspnetMembersMapper;
    @Autowired
    HionContactMapper hionContactMapper;
    @Autowired
    HionCustomerMapper hionCustomerMapper;

//1.微商城 2.触屏版 3.APP  4.支付宝服务窗//客户来源
    @Scheduled(cron = "#{configProperties['syncTimeOfL2D']}")
    public void L2d(){

        try {
            System.out.println();
            System.out.println();
            Date date1 = new Date();
            System.out.println("来电通同步到点识网该次开始时间"+date1);
            //拿到所有的KHBH
            List<OneNvarchar> oneNvarchars = hionCustomerMapper.selectAllNotNullKhbh();

            List<OneNvarchar> oneNvarchars1 = aspnetMembersMapper.selectAllUserName();
            //循环所有KHBH
            for (OneNvarchar on:oneNvarchars){
                try {
                    //得到当前客户编号
                    String khbh=on.getKhbh();

                    HionCustomerExample hionCustomerExample=new HionCustomerExample();
                    hionCustomerExample.createCriteria().andKhbhEqualTo(khbh);
                    List<HionCustomer> hionCustomers = hionCustomerMapper.selectByExample(hionCustomerExample);
                    HionCustomer hionCustomer = hionCustomers.get(0);


                    HionContactExample hionContactExample=new HionContactExample();
                    hionContactExample.createCriteria().andKhbhEqualTo(khbh);
                    List<HionContact> hionContacts = hionContactMapper.selectByExample(hionContactExample);
                    HionContact hionContact = hionContacts.get(0);
                    String mobilenum = hionContact.getMobile();

                    AspnetMembers aspnetMembers=new AspnetMembers();
                    //先判断点识网的数据库有没有这个客户编号khbh
                    long khbhNum=0;
                    if(mobilenum==null||"".equals(mobilenum)){//此时用khbh用作为点识网的客户
                        aspnetMembers.setUsername(hionCustomer.getKhbh().trim());
                        for(OneNvarchar var:oneNvarchars1){//循环海商里面的所有会员名字
                            String username = var.getKhbh();
                            if(username.contains("@")){
                                username=username.replace("@","");
                            }
                            if(username.contains(".")){
                                username=username.replace(".","");
                            }
                            if(khbh!=null){
                                if(khbh.equals(username)){
                                    khbhNum++;
                                    //由于海商和点识网2边的username和khbh不完全相同,所以要从新付值一遍
                                    aspnetMembers.setUsername(username);
                                    break;//找到一样的就打断循环不再比较
                                }
                            }
                        }
                    }else{
                        aspnetMembers.setUsername(mobilenum);
                        for(OneNvarchar var:oneNvarchars1){//循环海商里面的所有会员名字
                            String username = var.getKhbh();

                            if(mobilenum!=null){
                                if(mobilenum.equals(username)){
                                    khbhNum++;
                                    //由于海商和点识网2边的username和khbh不完全相同,所以要从新付值一遍
                                    aspnetMembers.setUsername(username);
                                    break;//找到一样的就打断循环不再比较
                                }
                            }
                        }
                    }





                    String firstcalltime = hionCustomer.getFirstcalltime();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Date date=null;
                    try {date = sdf.parse(firstcalltime);} catch (ParseException e) {e.printStackTrace();}
                    aspnetMembers.setCreatedate(date);
                    aspnetMembers.setRealname(hionContact.getContact());
                    aspnetMembers.setCellphone(hionContact.getMobile());
                    aspnetMembers.setAddress(hionContact.getContactaddr());
                    aspnetMembers.setQq(hionContact.getQq());
                    aspnetMembers.setEmail(hionContact.getEmail());
                    //自我约定,9999来自于来电通
                    aspnetMembers.setRegisteredsource(9999);

//如果在点识网有这个数据,就更新并跳过该次,进行下次循环
                    if(khbhNum==0){
                        //没有就插入
                        aspnetMembersMapper.insert(aspnetMembers);
                        continue;//结束该次循环
                    }

                    //有了就更新
                    //更新真实姓名
                    if(aspnetMembers.getRealname()!=null){
                        if(!"".equals(aspnetMembers.getRealname())){
                           if(!"联系人姓名".equals(aspnetMembers.getRealname())){
                               if(!"noWrite".equals(aspnetMembers.getRealname())){
                                   aspnetMembersMapper.updateRealname(aspnetMembers);
                               }
                           }
                        }
                    }

                    if(aspnetMembers.getCellphone()!=null){
                        if(!"".equals(aspnetMembers.getCellphone())){
                            if(!"手机".equals(aspnetMembers.getCellphone())){
                                if(!"noWrite".equals(aspnetMembers.getCellphone())){
                                    aspnetMembersMapper.updateCellphone(aspnetMembers);
                                }
                            }
                        }
                    }
                    if(aspnetMembers.getAddress()!=null){
                        if(!"".equals(aspnetMembers.getAddress())){
                            if(!"地址".equals(aspnetMembers.getAddress())){
                                if(!"noWrite".equals(aspnetMembers.getAddress())){
                                    aspnetMembersMapper.updateAddr(aspnetMembers);
                                }
                            }
                        }
                    }

                    if(aspnetMembers.getQq()!=null){
                        if(!"".equals(aspnetMembers.getQq())){
                            if(!"QQ".equals(aspnetMembers.getQq())){
                                if(!"noWrite".equals(aspnetMembers.getQq())){
                                    aspnetMembersMapper.updateQq(aspnetMembers);
                                }
                            }
                        }
                    }

                    if(aspnetMembers.getEmail()!=null){
                        if(!"".equals(aspnetMembers.getEmail())){
                            if(!"Email".equals(aspnetMembers.getEmail())){
                                if(!"noWrite".equals(aspnetMembers.getEmail())){
                                    aspnetMembersMapper.updateEmail(aspnetMembers);
                                }
                            }
                        }
                    }


                } catch (Exception e) {e.printStackTrace();}

            }
            Date date2 = new Date();
            System.out.println("来电通同步到点识网该次结束时间"+date2);
            System.out.println("!!!!!!来电通同步到点识网该次耗时"+((date2.getTime()-date1.getTime())/1000)+"秒,合计"+((date2.getTime()-date1.getTime())/1000/60)+"分钟!!!!!!!!!!!!!");
            System.out.println();
            System.out.println();
        } catch (Exception e) {e.printStackTrace();}

    }








    public static void main(String[]args){
        String []configs={"classpath*:applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        System.out.println(ctx+"---------------------");
        L2D bean = SpringUtil.getBean(L2D.class);
        bean.L2d();
    }




}
