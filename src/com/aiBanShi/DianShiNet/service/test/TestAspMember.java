package com.aiBanShi.DianShiNet.service.test;

import com.aiBanShi.DianShiNet.dao.mapperJava2.AspnetMembersMapper;
import com.aiBanShi.DianShiNet.dto.AspnetMembers;
import com.aiBanShi.DianShiNet.dto.AspnetMembersExample;
import com.aiBanShi.DianShiNet.utils.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017-07-05.
 */
/*@Component
public class TestAspMember {
   @Autowired
    AspnetMembersMapper aspnetMembersMapper;

    public void f(){
        AspnetMembersExample ame =new AspnetMembersExample();
        ame.createCriteria().andUseridIsNotNull();
        List<AspnetMembers> aspnetMembers = aspnetMembersMapper.selectByExample(ame);
        System.out.println(aspnetMembers);


    }

    public static void main(String[]args){
        String []configs={"classpath*:applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        System.out.println(ctx+"---------------------");
        TestAspMember bean = SpringUtil.getBean(TestAspMember.class);
        bean.f();

    }
}*/
