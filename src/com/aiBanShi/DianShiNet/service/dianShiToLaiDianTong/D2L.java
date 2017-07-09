package com.aiBanShi.DianShiNet.service.dianShiToLaiDianTong;

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
public class D2L {
    @Autowired
    AspnetMembersMapper aspnetMembersMapper;
    @Autowired
    HionContactMapper hionContactMapper;
    @Autowired
    HionCustomerMapper hionCustomerMapper;

//1.微商城 2.触屏版 3.APP  4.支付宝服务窗//客户来源
    @Scheduled(cron = "#{configProperties['syncTimeOfD2L']}")
    public void L2d(){

        try {
            System.out.println();
            System.out.println();
            Date date1 = new Date();
            System.out.println("来电通同步到点识网该次开始时间"+date1);
            //拿到所有的KHBH





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
        D2L bean = SpringUtil.getBean(D2L.class);
        bean.L2d();
    }




}
