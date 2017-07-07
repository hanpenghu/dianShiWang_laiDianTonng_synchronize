package com.aiBanShi.DianShiNet.dto;

/**
 * Created by Administrator on 2017-07-06.
 */
public class OneNvarchar {
    private String khbh;

    public String getKhbh() {
        return khbh;
    }

    public void setKhbh(String khbh) {
        this.khbh = khbh;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.aiBanShi.DianShiNet.dto.OneNvarchar{");
        sb.append("khbh='").append(khbh).append('\'');
        sb.append('}');
        return sb.toString();
    }





}
