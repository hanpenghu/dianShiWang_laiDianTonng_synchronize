package com.aiBanShi.DianShiNet.service.laiDianTongToDianShi;

import com.aiBanShi.DianShiNet.dao.mapperJava1.HionContactMapper;
import com.aiBanShi.DianShiNet.dao.mapperJava1.HionCustomerMapper;
import com.aiBanShi.DianShiNet.dao.mapperJava2.AspnetMembersMapper;
import com.aiBanShi.DianShiNet.dto.*;
import com.aiBanShi.DianShiNet.utils.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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


    public void L2d(){
        
        //拿到所有的KHBH
        List<OneNvarchar> oneNvarchars = hionCustomerMapper.selectAllNotNullKhbh();
        //循环所有KHBH
        for (OneNvarchar on:oneNvarchars){
            String khbh=on.getKhbh();
            HionCustomerExample hionCustomerExample=new HionCustomerExample();
            hionCustomerExample.createCriteria().andKhbhEqualTo(khbh);
            List<HionCustomer> hionCustomers = hionCustomerMapper.selectByExample(hionCustomerExample);
            HionCustomer hionCustomer = hionCustomers.get(0);


            HionContactExample hionContactExample=new HionContactExample();
            hionContactExample.createCriteria().andKhbhEqualTo(khbh);
            List<HionContact> hionContacts = hionContactMapper.selectByExample(hionContactExample);
            HionContact hionContact = hionContacts.get(0);

            AspnetMembers aspnetMembers=new AspnetMembers();
            aspnetMembers.setUsername(hionCustomer.getKhbh());

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



            aspnetMembersMapper.insert(aspnetMembers);

        }


    }








    public static void main(String[]args){
        String []configs={"classpath*:applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        System.out.println(ctx+"---------------------");
        L2D bean = SpringUtil.getBean(L2D.class);
        bean.L2d();
    }




}
