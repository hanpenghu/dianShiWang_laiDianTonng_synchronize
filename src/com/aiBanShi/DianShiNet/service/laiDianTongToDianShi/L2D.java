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
 * Created by Administrator on 2017-07-05.
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
            //循环所有KHBH
            for (OneNvarchar on:oneNvarchars){
                try {
                    //得到当前客户编号
                    String khbh=on.getKhbh();
                    //先判断点识网的数据库有没有这个客户编号khbh
                    AspnetMembersExample aspnetMembersExample=new AspnetMembersExample();
                    aspnetMembersExample.createCriteria().andUsernameEqualTo(khbh.trim());
                    long khbhNum = aspnetMembersMapper.countByExample(aspnetMembersExample);
                    //如果在点识网有这个数据,就跳过该次,进行下次循环
                    if(khbhNum>0){
                        continue;
                    }
                    //如果点识网没有这个数据(khbh),就继续插入
                    HionCustomerExample hionCustomerExample=new HionCustomerExample();
                    hionCustomerExample.createCriteria().andKhbhEqualTo(khbh);
                    List<HionCustomer> hionCustomers = hionCustomerMapper.selectByExample(hionCustomerExample);
                    HionCustomer hionCustomer = hionCustomers.get(0);


                    HionContactExample hionContactExample=new HionContactExample();
                    hionContactExample.createCriteria().andKhbhEqualTo(khbh);
                    List<HionContact> hionContacts = hionContactMapper.selectByExample(hionContactExample);
                    HionContact hionContact = hionContacts.get(0);

                    AspnetMembers aspnetMembers=new AspnetMembers();
                    aspnetMembers.setUsername(hionCustomer.getKhbh().trim());

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


                    aspnetMembersMapper.insert(aspnetMembers);
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
