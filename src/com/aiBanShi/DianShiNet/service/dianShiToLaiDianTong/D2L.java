package com.aiBanShi.DianShiNet.service.dianShiToLaiDianTong;

import com.aiBanShi.DianShiNet.dao.mapperJava1.HionContactMapper;
import com.aiBanShi.DianShiNet.dao.mapperJava1.HionCustomerMapper;
import com.aiBanShi.DianShiNet.dao.mapperJava2.AspnetMembersMapper;
import com.aiBanShi.DianShiNet.dto.*;
import com.aiBanShi.DianShiNet.utils.NotEmpty;
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
public class D2L {
    @Autowired
    AspnetMembersMapper aspnetMembersMapper;
    @Autowired
    HionContactMapper hionContactMapper;
    @Autowired
    HionCustomerMapper hionCustomerMapper;

//1.微商城 2.触屏版 3.APP  4.支付宝服务窗//客户来源
    @Scheduled(cron = "#{configProperties['syncTimeOfD2L']}")
    public void d2L(){

        try {
            System.out.println();
            System.out.println();
            Date date1 = new Date();
            System.out.println("点识网同步到来电通该次开始时间"+date1);
            //拿到所有的主键,进行循环
            List<Integer> allUserId = aspnetMembersMapper.selectAllUserId();
            //如果allUserId是空的,就不再执行下面的
            if(!NotEmpty.notEmpty(allUserId)){
                return;
            }

            for(Integer id:allUserId){
                try {
                    AspnetMembers aspnetMembers = aspnetMembersMapper.selectByPrimaryKey(id);
                    String username = aspnetMembers.getUsername();
                    Date createdate = aspnetMembers.getCreatedate();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String firstcalltime = sdf.format(createdate);
                    //1.微商城 2.触屏版 3.APP  4.服务窗
                    Integer registeredsource = aspnetMembers.getRegisteredsource();
                    //该用户下过的订单数量
                    Integer ordernumber = aspnetMembers.getOrdernumber();
                    //得到userId,该id可以在订单表中查到所有购买的订单
                    Integer userid = aspnetMembers.getUserid();
                    //得到该用户最近购买的前10件产品名字
                    List<OrderInfo> orderInfos = aspnetMembersMapper.selectInfoFromOrderTabByUserId(userid);


                    HionContactExample hionContactExample=new HionContactExample();
                    hionContactExample.createCriteria().andKhbhEqualTo(username.trim());
                    long count1 = hionContactMapper.countByExample(hionContactExample);

                    HionCustomerExample hionCustomerExample=new HionCustomerExample();
                    hionCustomerExample.createCriteria().andKhbhEqualTo(username.trim());
                    long count2 = hionCustomerMapper.countByExample(hionCustomerExample);


                    HionContact hionContact=new HionContact();
                    HionCustomer hionCustomer=new HionCustomer();
                    hionContact.setKhbh(username);
                    hionCustomer.setKhbh(username);
                    hionCustomer.setFirstcalltime(firstcalltime);
                    hionContact.setContact(aspnetMembers.getRealname());
                    hionContact.setMobile(aspnetMembers.getCellphone());
                    hionContact.setContactaddr(aspnetMembers.getAddress());
                    hionContact.setQq(aspnetMembers.getQq());
                    hionContact.setEmail(aspnetMembers.getEmail());
                    String zhuCeLaiYuan="未知注册来源!!";
                    ////1.微商城 2.触屏版 3.APP  4.服务窗
                    if(registeredsource==1){
                        zhuCeLaiYuan="微商城";
                    }else if(registeredsource==2){
                        zhuCeLaiYuan="触屏版";
                    }else if(registeredsource==3){
                        zhuCeLaiYuan="APP";
                    }else if(registeredsource==4){
                        zhuCeLaiYuan="服务窗";
                    }else{
                        zhuCeLaiYuan="来电通!";
                    }
                    hionCustomer.setZdy1("注册来源: "+zhuCeLaiYuan+"!!!!");


                    String productNames="";
                    for(OrderInfo orderInfo:orderInfos){
                        productNames+=(orderInfo.getProductName()+"；");
                    }
                    hionCustomer.setZdy2("该用户最近购买的前"+orderInfos.size()+"件商品："+productNames);



                    //如果2个里面都没有,就插入(该次插入后用continue是不再更新的意思),有的话更新
                    if(count1==0&&count2==0){
                        hionContactMapper.insert(hionContact);
                        hionCustomerMapper.insert(hionCustomer);
                        continue;
                    }


                    hionContactMapper.updateByExample(hionContact,hionContactExample);
                    hionCustomerMapper.updateByExample(hionCustomer,hionCustomerExample);

                } catch (Exception e) {e.printStackTrace();}
            }





            Date date2 = new Date();
            System.out.println("点识网同步到来电通该次结束时间"+date2);
            System.out.println("!!!!!!点识网同步到来电通该次耗时"+((date2.getTime()-date1.getTime())/1000)+"秒,合计"+((date2.getTime()-date1.getTime())/1000/60)+"分钟!!!!!!!!!!!!!");
            System.out.println();
            System.out.println();
        } catch (Exception e) {e.printStackTrace();}

    }








    public static void main(String[]args){
        String []configs={"classpath*:applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        System.out.println(ctx+"---------------------");
        D2L bean = SpringUtil.getBean(D2L.class);
        bean.d2L();
    }




}
