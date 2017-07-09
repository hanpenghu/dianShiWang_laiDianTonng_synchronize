package com.aiBanShi.DianShiNet.dto;

import com.aiBanShi.DianShiNet.utilsOfHanHan.MD5Utils;

import java.math.BigDecimal;
import java.util.Date;

public class AspnetMembers {
    private Integer userid;
//上级推广员
    private Integer referraluserid=0;
//会员等级id
    private Integer gradeid=1;
//用户名
    private String username="systemDefault";
//密码默认是123456,下面是加盐后在数据库显示的密码
    private String password="Sbdt0qvW11dS0lrZss3IKyfpFEU=";

    private String passwordsalt="GEDYJAVVKNNRPDSIVBKAHNDMULNQBPEWQNSRGBOLBKPIAXGSVBLXJXLSBRDXNEUVJRABKABTMYZXYUMWEUVADHNTCAQPXRYWPUYIWFHUZSKKYNUHEGTTJTSCEHYKKMWV";

    private String passwordquestion;

    private String passwordanswer;
//创建时间
    private Date createdate=new Date();

    private String email="systemDefault";

    private String realname="systemDefault";

    private String identitycard;

    private String picture;

    private Integer gender=0;

    private Date birthdate;
//是否开启预付款
    private Boolean isopenbalance=true;

    private String tradepassword;

    private String tradepasswordsalt;

    private Integer ordernumber=0;
//支出金额
    private BigDecimal expenditure=new BigDecimal(0);
//积分
    private Integer points=0;
//预付款余额
    private BigDecimal balance=new BigDecimal(0);
//预付款提现金额
    private BigDecimal requestbalance=new BigDecimal(0);
//顶级地区ID
    private Integer topregionid=9999;
//地区ID
    private Integer regionid=9999;

    private String address;

    private String cellphone;

    private String qq;

    private String wangwang;

    private String wechat;

    private String sessionid;

    private Date sessionendtime;
//是否已经验证邮箱
    private Boolean emailverification=true;
//是否已经验证手机
    private Boolean cellphoneverification=true;
    //客户来源
////1.微商城 2.触屏版 3.APP  4.支付宝服务窗//
    private Integer registeredsource;

    private Boolean isquicklogin;

    private Boolean islogined;

    private String unionid;

    private Boolean issubscribe;

    private String nickname;

    private String tagids;

    private Boolean issendappcoupons;

    public AspnetMembers() {

    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getReferraluserid() {
        return referraluserid;
    }

    public void setReferraluserid(Integer referraluserid) {
        this.referraluserid = referraluserid;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPasswordsalt() {
        return passwordsalt;
    }

    public void setPasswordsalt(String passwordsalt) {
        this.passwordsalt = passwordsalt == null ? null : passwordsalt.trim();
    }

    public String getPasswordquestion() {
        return passwordquestion;
    }

    public void setPasswordquestion(String passwordquestion) {
        this.passwordquestion = passwordquestion == null ? null : passwordquestion.trim();
    }

    public String getPasswordanswer() {
        return passwordanswer;
    }

    public void setPasswordanswer(String passwordanswer) {
        this.passwordanswer = passwordanswer == null ? null : passwordanswer.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard == null ? null : identitycard.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Boolean getIsopenbalance() {
        return isopenbalance;
    }

    public void setIsopenbalance(Boolean isopenbalance) {
        this.isopenbalance = isopenbalance;
    }

    public String getTradepassword() {
        return tradepassword;
    }

    public void setTradepassword(String tradepassword) {
        this.tradepassword = tradepassword == null ? null : tradepassword.trim();
    }

    public String getTradepasswordsalt() {
        return tradepasswordsalt;
    }

    public void setTradepasswordsalt(String tradepasswordsalt) {
        this.tradepasswordsalt = tradepasswordsalt == null ? null : tradepasswordsalt.trim();
    }

    public Integer getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    public BigDecimal getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(BigDecimal expenditure) {
        this.expenditure = expenditure;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getRequestbalance() {
        return requestbalance;
    }

    public void setRequestbalance(BigDecimal requestbalance) {
        this.requestbalance = requestbalance;
    }

    public Integer getTopregionid() {
        return topregionid;
    }

    public void setTopregionid(Integer topregionid) {
        this.topregionid = topregionid;
    }

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWangwang() {
        return wangwang;
    }

    public void setWangwang(String wangwang) {
        this.wangwang = wangwang == null ? null : wangwang.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
    }

    public Date getSessionendtime() {
        return sessionendtime;
    }

    public void setSessionendtime(Date sessionendtime) {
        this.sessionendtime = sessionendtime;
    }

    public Boolean getEmailverification() {
        return emailverification;
    }

    public void setEmailverification(Boolean emailverification) {
        this.emailverification = emailverification;
    }

    public Boolean getCellphoneverification() {
        return cellphoneverification;
    }

    public void setCellphoneverification(Boolean cellphoneverification) {
        this.cellphoneverification = cellphoneverification;
    }

    public Integer getRegisteredsource() {
        return registeredsource;
    }

    public void setRegisteredsource(Integer registeredsource) {
        this.registeredsource = registeredsource;
    }

    public Boolean getIsquicklogin() {
        return isquicklogin;
    }

    public void setIsquicklogin(Boolean isquicklogin) {
        this.isquicklogin = isquicklogin;
    }

    public Boolean getIslogined() {
        return islogined;
    }

    public void setIslogined(Boolean islogined) {
        this.islogined = islogined;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public Boolean getIssubscribe() {
        return issubscribe;
    }

    public void setIssubscribe(Boolean issubscribe) {
        this.issubscribe = issubscribe;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getTagids() {
        return tagids;
    }

    public void setTagids(String tagids) {
        this.tagids = tagids == null ? null : tagids.trim();
    }

    public Boolean getIssendappcoupons() {
        return issendappcoupons;
    }

    public void setIssendappcoupons(Boolean issendappcoupons) {
        this.issendappcoupons = issendappcoupons;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.aiBanShi.DianShiNet.dto.AspnetMembers{");
        sb.append("userid=").append(userid);
        sb.append(", referraluserid=").append(referraluserid);
        sb.append(", gradeid=").append(gradeid);
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", passwordsalt='").append(passwordsalt).append('\'');
        sb.append(", passwordquestion='").append(passwordquestion).append('\'');
        sb.append(", passwordanswer='").append(passwordanswer).append('\'');
        sb.append(", createdate=").append(createdate);
        sb.append(", email='").append(email).append('\'');
        sb.append(", realname='").append(realname).append('\'');
        sb.append(", identitycard='").append(identitycard).append('\'');
        sb.append(", picture='").append(picture).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", isopenbalance=").append(isopenbalance);
        sb.append(", tradepassword='").append(tradepassword).append('\'');
        sb.append(", tradepasswordsalt='").append(tradepasswordsalt).append('\'');
        sb.append(", ordernumber=").append(ordernumber);
        sb.append(", expenditure=").append(expenditure);
        sb.append(", points=").append(points);
        sb.append(", balance=").append(balance);
        sb.append(", requestbalance=").append(requestbalance);
        sb.append(", topregionid=").append(topregionid);
        sb.append(", regionid=").append(regionid);
        sb.append(", address='").append(address).append('\'');
        sb.append(", cellphone='").append(cellphone).append('\'');
        sb.append(", qq='").append(qq).append('\'');
        sb.append(", wangwang='").append(wangwang).append('\'');
        sb.append(", wechat='").append(wechat).append('\'');
        sb.append(", sessionid='").append(sessionid).append('\'');
        sb.append(", sessionendtime=").append(sessionendtime);
        sb.append(", emailverification=").append(emailverification);
        sb.append(", cellphoneverification=").append(cellphoneverification);
        sb.append(", registeredsource=").append(registeredsource);
        sb.append(", isquicklogin=").append(isquicklogin);
        sb.append(", islogined=").append(islogined);
        sb.append(", unionid='").append(unionid).append('\'');
        sb.append(", issubscribe=").append(issubscribe);
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", tagids='").append(tagids).append('\'');
        sb.append(", issendappcoupons=").append(issendappcoupons);
        sb.append('}');
        return sb.toString();
    }
}