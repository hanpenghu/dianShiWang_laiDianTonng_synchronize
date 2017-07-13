package com.aiBanShi.DianShiNet.service;
import com.aiBanShi.DianShiNet.dto.*;
import com.aiBanShi.DianShiNet.dao.mapperJava1.HionAgentinfoMapper;
import com.aiBanShi.DianShiNet.dao.mapperJava1.HionDuty2015Mapper;
import com.aiBanShi.DianShiNet.utils.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Properties;

/**
 * Created by hanhan on 2017-07-12.
 */
@Component("chuanJianGongYongXiaShu")
public class ChuanJianGongYongXiaShu {
    @Autowired
    HionDuty2015Mapper hionDuty2015Mapper;
    @Autowired
    HionAgentinfoMapper hionAgentinfoMapper;
    public void f(){
        //注意,要删除该管理员,必须在前台才能删除干净,千万不要在数据库删除
        //要在数据库删除就要在2个表(duty2015和hionAgentinfo)都删除
        try {
            if(ifExsit()){
                //如果存在,就不再继续下面的程序
                return;
            }
            HionAgentinfo ha=new HionAgentinfo();
            //下面3行不再用了是因为在new的时候自动赋值了
//            ha.setStaffid("9999");//这个和下面的pwd用于Uc3登录
//            ha.setStaffname("Public");
//            ha.setStaffpwd("123");
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
            //设置权限
            insertQuanXian();
        } catch (Exception e) {e.printStackTrace();}
    }

    public boolean ifExsit(){
        try {
            String path = this.getClass().getResource("/").getPath();
            Properties p=new Properties();
            FileReader fileReader = new FileReader(new File(path + "dataSource.properties"));
            p.load(fileReader);
            HionAgentinfoExample hae=new HionAgentinfoExample();
            hae.createCriteria().andStaffidEqualTo(p.getProperty("gongGongZhangHaoDengLuOfLaiDianTong"));
            long l = hionAgentinfoMapper.countByExample(hae);
            fileReader.close();
            if(l>0){
                return true;
            }else {return false;}
        } catch (Exception e) {e.printStackTrace();}
        return false;
    }

    public void insertQuanXian(){
        try {
            HionDuty2015 hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("显示范围");
            hionDuty2015.setQxvalue("自己及下属");
            hionDuty2015.setOrdercol(29510);
            hionDuty2015Mapper.insert(hionDuty2015);

            HionDuty2015Example hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            List<HionDuty2015> hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            FiveStrAndFiveInt fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("--增加");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29520);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("--修改");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29530);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("--删除");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29540);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("--导入");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29550);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("--导出");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29560);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("--转移归属");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29570);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("--转移类别");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29580);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("--添加类别");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29590);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("--修改类别");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29600);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("--删除类别");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29610);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("--自定义标题");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29620);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("--自定义列");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29630);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("客户资料");
            hionDuty2015.setQx2("--保存列宽");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29640);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("通话记录");
            hionDuty2015.setQx2("显示范围");
            hionDuty2015.setQxvalue("自己及下属");
            hionDuty2015.setOrdercol(29650);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("通话记录");
            hionDuty2015.setQx2("--播放");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29660);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("通话记录");
            hionDuty2015.setQx2("--删除");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29670);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("通话记录");
            hionDuty2015.setQx2("--另存");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29680);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("通话记录");
            hionDuty2015.setQx2("--导出");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29690);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("通话记录");
            hionDuty2015.setQx2("--自定义列");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29700);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("员工管理");
            hionDuty2015.setQx2("显示范围");
            hionDuty2015.setQxvalue("自己及下属");
            hionDuty2015.setOrdercol(29710);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("员工管理");
            hionDuty2015.setQx2("--增加");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29720);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("员工管理");
            hionDuty2015.setQx2("--修改");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29730);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("员工管理");
            hionDuty2015.setQx2("--删除");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29740);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("员工管理");
            hionDuty2015.setQx2("--导入");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29750);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("员工管理");
            hionDuty2015.setQx2("--导出");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29760);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("员工管理");
            hionDuty2015.setQx2("--添加部门");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29770);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("员工管理");
            hionDuty2015.setQx2("--修改部门");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29780);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("员工管理");
            hionDuty2015.setQx2("--删除部门");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29790);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("员工管理");
            hionDuty2015.setQx2("个人简历");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29800);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("员工管理");
            hionDuty2015.setQx2("下属成员");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29810);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("员工管理");
            hionDuty2015.setQx2("权限设置");
            hionDuty2015.setQxvalue("NO");
            hionDuty2015.setOrdercol(29820);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("短信记录");
            hionDuty2015.setQx2("显示范围");
            hionDuty2015.setQxvalue("自己及下属");
            hionDuty2015.setOrdercol(29830);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("短信记录");
            hionDuty2015.setQx2("--增加");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29840);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("短信记录");
            hionDuty2015.setQx2("--修改");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29850);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("短信记录");
            hionDuty2015.setQx2("--删除");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29860);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("短信记录");
            hionDuty2015.setQx2("--发送");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29870);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("统计报表");
            hionDuty2015.setQx2("是否显示");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29880);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("统计报表");
            hionDuty2015.setQx2("--导出");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29890);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("系统设置");
            hionDuty2015.setQx2("是否显示");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29900);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("系统设置");
            hionDuty2015.setQx2("--保存设置");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29910);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("系统设置");
            hionDuty2015.setQx2("电话设置");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29920);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("系统设置");
            hionDuty2015.setQx2("录音留言设置");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29930);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("系统设置");
            hionDuty2015.setQx2("铃音设置");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29940);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("系统设置");
            hionDuty2015.setQx2("短信网关");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29950);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("系统设置");
            hionDuty2015.setQx2("个人设置");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29960);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("其他功能");
            hionDuty2015.setQx2("闭音");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29970);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("其他功能");
            hionDuty2015.setQx2("保留");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29980);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("其他功能");
            hionDuty2015.setQx2("转拨");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(29990);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("其他功能");
            hionDuty2015.setQx2("能否退出软件");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(30000);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);

            hionDuty2015=new HionDuty2015();
            
            hionDuty2015.setQx1("其他功能");
            hionDuty2015.setQx2("显示电话号码");
            hionDuty2015.setQxvalue("Y");
            hionDuty2015.setOrdercol(30010);
            hionDuty2015Mapper.insert(hionDuty2015);

            hionDuty2015Example=new HionDuty2015Example();
            hionDuty2015Example.createCriteria().andOrdercolEqualTo(hionDuty2015.getOrdercol());
            hionDuty2015s = hionDuty2015Mapper.selectByExample(hionDuty2015Example);
            fsfi=new FiveStrAndFiveInt();
            fsfi.setK1(hionDuty2015.getOrdercol());
            fsfi.setK2(hionDuty2015s.get(0).getRecid()*10);
            hionDuty2015Mapper.updateOrdercol(fsfi);


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
