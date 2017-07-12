package com.aiBanShi.DianShiNet.utils;

import java.io.File;

/**
 * Created by Administrator on 2017-07-05.
 */
public class FenYe {
    private Integer dangQianYe=null;
    private Integer meiYeXianShiShu=50;
    private Integer zongYeShu=null;
    private Integer zongJiLuShu=null;
    public Integer getDangQianYe() {
        return dangQianYe;
    }
    public void setDangQianYe(Integer dangQianYe) {
        this.dangQianYe = dangQianYe;
    }
    public Integer getMeiYeXianShiShu() {
        return meiYeXianShiShu;
    }
    public void setMeiYeXianShiShu(Integer meiYeXianShiShu) {
        this.meiYeXianShiShu = meiYeXianShiShu;
    }
    public Integer getZongYeShu() {
        return zongYeShu;
    }

    public void setZongYeShu() {
        if(this.zongJiLuShu%this.meiYeXianShiShu==0){
            this.zongYeShu=this.zongJiLuShu/this.meiYeXianShiShu;
        }else{
            this.zongYeShu=this.zongJiLuShu/this.meiYeXianShiShu+1;
        }
    }

    public Integer getZongJiLuShu() {
        return zongJiLuShu;
    }
    public void setZongJiLuShu(Integer zongJiLuShu) {
        this.zongJiLuShu = zongJiLuShu;
    }
    @Override
    public String toString() {
        return "FenYe [dangQianYe=" + dangQianYe + ", meiYeXianShiShu=" + meiYeXianShiShu + ", zongYeShu=" + zongYeShu
                + ", zongJiLuShu=" + zongJiLuShu + "]";
    }

}

