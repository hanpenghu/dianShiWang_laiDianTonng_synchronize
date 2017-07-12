package com.aiBanShi.DianShiNet.dto;

public class HionDuty2015 {
    private Integer recid;

    private String staffname;

    private String qx1;

    private String qx2;

    private String qxvalue;

    private Integer ordercol;

    public Integer getRecid() {
        return recid;
    }

    public void setRecid(Integer recid) {
        this.recid = recid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getQx1() {
        return qx1;
    }

    public void setQx1(String qx1) {
        this.qx1 = qx1 == null ? null : qx1.trim();
    }

    public String getQx2() {
        return qx2;
    }

    public void setQx2(String qx2) {
        this.qx2 = qx2 == null ? null : qx2.trim();
    }

    public String getQxvalue() {
        return qxvalue;
    }

    public void setQxvalue(String qxvalue) {
        this.qxvalue = qxvalue == null ? null : qxvalue.trim();
    }

    public Integer getOrdercol() {
        return ordercol;
    }

    public void setOrdercol(Integer ordercol) {
        this.ordercol = ordercol;
    }
}