package com.aiBanShi.DianShiNet.dto;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class HionDuty2015 {
    private Integer recid;

    private String staffname;
    public HionDuty2015() {
        try {
            String path = this.getClass().getResource("/").getPath();
            Properties p=new Properties();
            FileReader fileReader = new FileReader(new File(path + "dataSource.properties"));
            p.load(fileReader);
            this.staffname=p.getProperty("gongGongZhangHaoNameOfLaiDianTong");
            fileReader.close();
        } catch (Exception e) {e.printStackTrace();}

    }

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