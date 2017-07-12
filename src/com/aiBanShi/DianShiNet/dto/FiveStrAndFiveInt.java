package com.aiBanShi.DianShiNet.dto;

/**
 * Created by Administrator on 2017-07-12.
 */
public class FiveStrAndFiveInt {
    private String str1;
    private String str2;
    private String str3;
    private String str4;
    private String str5;
    private Integer k1;
    private Integer k2;
    private Integer k3;
    private Integer k4;
    private Integer k5;

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    public String getStr4() {
        return str4;
    }

    public void setStr4(String str4) {
        this.str4 = str4;
    }

    public String getStr5() {
        return str5;
    }

    public void setStr5(String str5) {
        this.str5 = str5;
    }

    public Integer getK1() {
        return k1;
    }

    public void setK1(Integer k1) {
        this.k1 = k1;
    }

    public Integer getK2() {
        return k2;
    }

    public void setK2(Integer k2) {
        this.k2 = k2;
    }

    public Integer getK3() {
        return k3;
    }

    public void setK3(Integer k3) {
        this.k3 = k3;
    }

    public Integer getK4() {
        return k4;
    }

    public void setK4(Integer k4) {
        this.k4 = k4;
    }

    public Integer getK5() {
        return k5;
    }

    public void setK5(Integer k5) {
        this.k5 = k5;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.aiBanShi.DianShiNet.dto.FiveStrAndFiveInt{");
        sb.append("str1='").append(str1).append('\'');
        sb.append(", str2='").append(str2).append('\'');
        sb.append(", str3='").append(str3).append('\'');
        sb.append(", str4='").append(str4).append('\'');
        sb.append(", str5='").append(str5).append('\'');
        sb.append(", k1=").append(k1);
        sb.append(", k2=").append(k2);
        sb.append(", k3=").append(k3);
        sb.append(", k4=").append(k4);
        sb.append(", k5=").append(k5);
        sb.append('}');
        return sb.toString();
    }
}
