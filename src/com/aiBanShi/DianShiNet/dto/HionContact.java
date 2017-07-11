package com.aiBanShi.DianShiNet.dto;

public class HionContact {
    private Integer recid;

    private String khbh;

    private String contact="联系人姓名";

    private String duty;

    private String mobile="手机";

    private String officephone="固定电话";

    private String ext="分机";

    private String homephone="家庭电话";

    private String otherphone="其它号码";

    private String fax="传真";

    private String contactaddr;

    private String qq;

    private String email;

    private String msn;

    private String remarks;

    private Boolean defaultlxr=true;

    private String zdy12="自定义12";

    private String zdy13="自定义13";

    private String zdy14="自定义14";

    private String zdy15="自定义15";

    private String remarks1;

    private Boolean defaultlxr1;

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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
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

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone == null ? null : homephone.trim();
    }

    public String getOtherphone() {
        return otherphone;
    }

    public void setOtherphone(String otherphone) {
        this.otherphone = otherphone == null ? null : otherphone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getContactaddr() {
        return contactaddr;
    }

    public void setContactaddr(String contactaddr) {
        this.contactaddr = contactaddr == null ? null : contactaddr.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn == null ? null : msn.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Boolean getDefaultlxr() {
        return defaultlxr;
    }

    public void setDefaultlxr(Boolean defaultlxr) {
        this.defaultlxr = defaultlxr;
    }

    public String getZdy12() {
        return zdy12;
    }

    public void setZdy12(String zdy12) {
        this.zdy12 = zdy12 == null ? null : zdy12.trim();
    }

    public String getZdy13() {
        return zdy13;
    }

    public void setZdy13(String zdy13) {
        this.zdy13 = zdy13 == null ? null : zdy13.trim();
    }

    public String getZdy14() {
        return zdy14;
    }

    public void setZdy14(String zdy14) {
        this.zdy14 = zdy14 == null ? null : zdy14.trim();
    }

    public String getZdy15() {
        return zdy15;
    }

    public void setZdy15(String zdy15) {
        this.zdy15 = zdy15 == null ? null : zdy15.trim();
    }

    public String getRemarks1() {
        return remarks1;
    }

    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    public Boolean getDefaultlxr1() {
        return defaultlxr1;
    }

    public void setDefaultlxr1(Boolean defaultlxr1) {
        this.defaultlxr1 = defaultlxr1;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.aiBanShi.DianShiNet.dto.HionContact{");
        sb.append("recid=").append(recid);
        sb.append(", khbh='").append(khbh).append('\'');
        sb.append(", contact='").append(contact).append('\'');
        sb.append(", duty='").append(duty).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", officephone='").append(officephone).append('\'');
        sb.append(", ext='").append(ext).append('\'');
        sb.append(", homephone='").append(homephone).append('\'');
        sb.append(", otherphone='").append(otherphone).append('\'');
        sb.append(", fax='").append(fax).append('\'');
        sb.append(", contactaddr='").append(contactaddr).append('\'');
        sb.append(", qq='").append(qq).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", msn='").append(msn).append('\'');
        sb.append(", remarks='").append(remarks).append('\'');
        sb.append(", defaultlxr=").append(defaultlxr);
        sb.append(", zdy12='").append(zdy12).append('\'');
        sb.append(", zdy13='").append(zdy13).append('\'');
        sb.append(", zdy14='").append(zdy14).append('\'');
        sb.append(", zdy15='").append(zdy15).append('\'');
        sb.append(", remarks1='").append(remarks1).append('\'');
        sb.append(", defaultlxr1=").append(defaultlxr1);
        sb.append('}');
        return sb.toString();
    }
}