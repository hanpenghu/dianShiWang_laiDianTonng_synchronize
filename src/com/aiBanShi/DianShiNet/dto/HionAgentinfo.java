package com.aiBanShi.DianShiNet.dto;

public class HionAgentinfo {
    private Integer recid;

    private String staffid;

    private String staffname;

    private String staffpwd;

    private String department;

    private String duty;

    private String grade;

    private Integer iflogin;

    private String loginstation;

    private String remarks;

    private String ext;

    private String mobile;

    private String officephone;

    private String logmode;

    private String zwpj;

    private String gzjy;

    private String jyjl;

    private Boolean ischecked;

    private String ygzt;

    public Integer getRecid() {
        return recid;
    }

    public void setRecid(Integer recid) {
        this.recid = recid;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getStaffpwd() {
        return staffpwd;
    }

    public void setStaffpwd(String staffpwd) {
        this.staffpwd = staffpwd == null ? null : staffpwd.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Integer getIflogin() {
        return iflogin;
    }

    public void setIflogin(Integer iflogin) {
        this.iflogin = iflogin;
    }

    public String getLoginstation() {
        return loginstation;
    }

    public void setLoginstation(String loginstation) {
        this.loginstation = loginstation == null ? null : loginstation.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone == null ? null : officephone.trim();
    }

    public String getLogmode() {
        return logmode;
    }

    public void setLogmode(String logmode) {
        this.logmode = logmode == null ? null : logmode.trim();
    }

    public String getZwpj() {
        return zwpj;
    }

    public void setZwpj(String zwpj) {
        this.zwpj = zwpj == null ? null : zwpj.trim();
    }

    public String getGzjy() {
        return gzjy;
    }

    public void setGzjy(String gzjy) {
        this.gzjy = gzjy == null ? null : gzjy.trim();
    }

    public String getJyjl() {
        return jyjl;
    }

    public void setJyjl(String jyjl) {
        this.jyjl = jyjl == null ? null : jyjl.trim();
    }

    public Boolean getIschecked() {
        return ischecked;
    }

    public void setIschecked(Boolean ischecked) {
        this.ischecked = ischecked;
    }

    public String getYgzt() {
        return ygzt;
    }

    public void setYgzt(String ygzt) {
        this.ygzt = ygzt == null ? null : ygzt.trim();
    }
}