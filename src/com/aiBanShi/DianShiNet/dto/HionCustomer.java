package com.aiBanShi.DianShiNet.dto;

public class HionCustomer {
    private Integer recid;

    private String khbh;

    private String companyname;

    private String companyaddr;

    private String remarks;

    private String vip;

    private String contactortype;

    private String intention;

    private String area;

    private String workerid;

    private String workername;

    private String firstcalltime;

    private String zdy1;

    private String zdy2;

    private String zdy3;

    private String lastcontacttime;

    private String zdy4;

    private String zdy5;

    private String zdy6;

    private String zdy7;

    private Integer calltype;

    private String zdy8;

    private String zdy9;

    private String zdy10;

    private String zdy11;

    private String lastcallresult;

    private byte[] xp;

    public Integer getRecid() {
        return recid;
    }

    public void setRecid(Integer recid) {
        this.recid = recid;
    }

    public String getKhbh() {
        return khbh;
    }

    public void setKhbh(String khbh) {
        this.khbh = khbh == null ? null : khbh.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanyaddr() {
        return companyaddr;
    }

    public void setCompanyaddr(String companyaddr) {
        this.companyaddr = companyaddr == null ? null : companyaddr.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip == null ? null : vip.trim();
    }

    public String getContactortype() {
        return contactortype;
    }

    public void setContactortype(String contactortype) {
        this.contactortype = contactortype == null ? null : contactortype.trim();
    }

    public String getIntention() {
        return intention;
    }

    public void setIntention(String intention) {
        this.intention = intention == null ? null : intention.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getWorkerid() {
        return workerid;
    }

    public void setWorkerid(String workerid) {
        this.workerid = workerid == null ? null : workerid.trim();
    }

    public String getWorkername() {
        return workername;
    }

    public void setWorkername(String workername) {
        this.workername = workername == null ? null : workername.trim();
    }

    public String getFirstcalltime() {
        return firstcalltime;
    }

    public void setFirstcalltime(String firstcalltime) {
        this.firstcalltime = firstcalltime == null ? null : firstcalltime.trim();
    }

    public String getZdy1() {
        return zdy1;
    }

    public void setZdy1(String zdy1) {
        this.zdy1 = zdy1 == null ? null : zdy1.trim();
    }

    public String getZdy2() {
        return zdy2;
    }

    public void setZdy2(String zdy2) {
        this.zdy2 = zdy2 == null ? null : zdy2.trim();
    }

    public String getZdy3() {
        return zdy3;
    }

    public void setZdy3(String zdy3) {
        this.zdy3 = zdy3 == null ? null : zdy3.trim();
    }

    public String getLastcontacttime() {
        return lastcontacttime;
    }

    public void setLastcontacttime(String lastcontacttime) {
        this.lastcontacttime = lastcontacttime == null ? null : lastcontacttime.trim();
    }

    public String getZdy4() {
        return zdy4;
    }

    public void setZdy4(String zdy4) {
        this.zdy4 = zdy4 == null ? null : zdy4.trim();
    }

    public String getZdy5() {
        return zdy5;
    }

    public void setZdy5(String zdy5) {
        this.zdy5 = zdy5 == null ? null : zdy5.trim();
    }

    public String getZdy6() {
        return zdy6;
    }

    public void setZdy6(String zdy6) {
        this.zdy6 = zdy6 == null ? null : zdy6.trim();
    }

    public String getZdy7() {
        return zdy7;
    }

    public void setZdy7(String zdy7) {
        this.zdy7 = zdy7 == null ? null : zdy7.trim();
    }

    public Integer getCalltype() {
        return calltype;
    }

    public void setCalltype(Integer calltype) {
        this.calltype = calltype;
    }

    public String getZdy8() {
        return zdy8;
    }

    public void setZdy8(String zdy8) {
        this.zdy8 = zdy8 == null ? null : zdy8.trim();
    }

    public String getZdy9() {
        return zdy9;
    }

    public void setZdy9(String zdy9) {
        this.zdy9 = zdy9 == null ? null : zdy9.trim();
    }

    public String getZdy10() {
        return zdy10;
    }

    public void setZdy10(String zdy10) {
        this.zdy10 = zdy10 == null ? null : zdy10.trim();
    }

    public String getZdy11() {
        return zdy11;
    }

    public void setZdy11(String zdy11) {
        this.zdy11 = zdy11 == null ? null : zdy11.trim();
    }

    public String getLastcallresult() {
        return lastcallresult;
    }

    public void setLastcallresult(String lastcallresult) {
        this.lastcallresult = lastcallresult == null ? null : lastcallresult.trim();
    }

    public byte[] getXp() {
        return xp;
    }

    public void setXp(byte[] xp) {
        this.xp = xp;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.aiBanShi.DianShiNet.dto.HionCustomer{");
        sb.append("recid=").append(recid);
        sb.append(", khbh='").append(khbh).append('\'');
        sb.append(", companyname='").append(companyname).append('\'');
        sb.append(", companyaddr='").append(companyaddr).append('\'');
        sb.append(", remarks='").append(remarks).append('\'');
        sb.append(", vip='").append(vip).append('\'');
        sb.append(", contactortype='").append(contactortype).append('\'');
        sb.append(", intention='").append(intention).append('\'');
        sb.append(", area='").append(area).append('\'');
        sb.append(", workerid='").append(workerid).append('\'');
        sb.append(", workername='").append(workername).append('\'');
        sb.append(", firstcalltime='").append(firstcalltime).append('\'');
        sb.append(", zdy1='").append(zdy1).append('\'');
        sb.append(", zdy2='").append(zdy2).append('\'');
        sb.append(", zdy3='").append(zdy3).append('\'');
        sb.append(", lastcontacttime='").append(lastcontacttime).append('\'');
        sb.append(", zdy4='").append(zdy4).append('\'');
        sb.append(", zdy5='").append(zdy5).append('\'');
        sb.append(", zdy6='").append(zdy6).append('\'');
        sb.append(", zdy7='").append(zdy7).append('\'');
        sb.append(", calltype=").append(calltype);
        sb.append(", zdy8='").append(zdy8).append('\'');
        sb.append(", zdy9='").append(zdy9).append('\'');
        sb.append(", zdy10='").append(zdy10).append('\'');
        sb.append(", zdy11='").append(zdy11).append('\'');
        sb.append(", lastcallresult='").append(lastcallresult).append('\'');
        sb.append(", xp=");
        if (xp == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < xp.length; ++i)
                sb.append(i == 0 ? "" : ", ").append(xp[i]);
            sb.append(']');
        }
        sb.append('}');
        return sb.toString();
    }
}