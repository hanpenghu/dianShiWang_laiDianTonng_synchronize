package com.aiBanShi.DianShiNet.service;

import com.aiBanShi.DianShiNet.dao.mapperJava1.HionAgentinfoMapper;
import com.aiBanShi.DianShiNet.dto.HionAgentinfo;
import com.aiBanShi.DianShiNet.dto.HionAgentinfoExample;
import com.aiBanShi.DianShiNet.utils.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by hanhan on 2017-07-12.
 */
@Component("chuanJianGongYongXiaShu")
public class ChuanJianGongYongXiaShu {
    @Autowired
    HionAgentinfoMapper hionAgentinfoMapper;
    public void f(){
        try {
            if(ifExsit()){
                //如果存在,就不再继续下面的程序
                return;
            }
            HionAgentinfo ha=new HionAgentinfo();
            ha.setStaffid("0004");//这个和下面的pwd用于Uc3登录
            ha.setStaffname("公共下属");
            ha.setStaffpwd("123");
            ha.setDepartment("客服");
            ha.setDuty("接话员");
            ha.setGrade("普通用户");
            ha.setIflogin(0);
            ha.setLoginstation("");
            ha.setRemarks("一个普通管理员");
            ha.setExt("");
            ha.setMobile("13641928741");
            ha.setOfficephone("03748830516");
            ha.setLogmode("正常登录");
            ha.setIschecked(false);
            ha.setYgzt("空闲");
            hionAgentinfoMapper.insert(ha);
        } catch (Exception e) {e.printStackTrace();}
    }

    public boolean ifExsit(){
        try {
            HionAgentinfoExample hae=new HionAgentinfoExample();
            hae.createCriteria().andStaffidEqualTo("0004");
            long l = hionAgentinfoMapper.countByExample(hae);
            if(l>0){
                return true;
            }else {return false;}
        } catch (Exception e) {e.printStackTrace();}
        return false;
    }

    public void insertQuanXian(){
        try {


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[]args){
        String []configs={"classpath*:applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        System.out.println(ctx+"---------------------");
        ChuanJianGongYongXiaShu bean = SpringUtil.getBean(ChuanJianGongYongXiaShu.class);
        bean.f();
    }

}
