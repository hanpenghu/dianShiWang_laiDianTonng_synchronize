package com.aiBanShi.DianShiNet.dto;

import java.util.ArrayList;
import java.util.List;

public class HionContactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HionContactExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRecidIsNull() {
            addCriterion("Recid is null");
            return (Criteria) this;
        }

        public Criteria andRecidIsNotNull() {
            addCriterion("Recid is not null");
            return (Criteria) this;
        }

        public Criteria andRecidEqualTo(Integer value) {
            addCriterion("Recid =", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidNotEqualTo(Integer value) {
            addCriterion("Recid <>", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidGreaterThan(Integer value) {
            addCriterion("Recid >", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Recid >=", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidLessThan(Integer value) {
            addCriterion("Recid <", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidLessThanOrEqualTo(Integer value) {
            addCriterion("Recid <=", value, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidIn(List<Integer> values) {
            addCriterion("Recid in", values, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidNotIn(List<Integer> values) {
            addCriterion("Recid not in", values, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidBetween(Integer value1, Integer value2) {
            addCriterion("Recid between", value1, value2, "recid");
            return (Criteria) this;
        }

        public Criteria andRecidNotBetween(Integer value1, Integer value2) {
            addCriterion("Recid not between", value1, value2, "recid");
            return (Criteria) this;
        }

        public Criteria andKhbhIsNull() {
            addCriterion("KHBH is null");
            return (Criteria) this;
        }

        public Criteria andKhbhIsNotNull() {
            addCriterion("KHBH is not null");
            return (Criteria) this;
        }

        public Criteria andKhbhEqualTo(String value) {
            addCriterion("KHBH =", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhNotEqualTo(String value) {
            addCriterion("KHBH <>", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhGreaterThan(String value) {
            addCriterion("KHBH >", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhGreaterThanOrEqualTo(String value) {
            addCriterion("KHBH >=", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhLessThan(String value) {
            addCriterion("KHBH <", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhLessThanOrEqualTo(String value) {
            addCriterion("KHBH <=", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhLike(String value) {
            addCriterion("KHBH like", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhNotLike(String value) {
            addCriterion("KHBH not like", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhIn(List<String> values) {
            addCriterion("KHBH in", values, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhNotIn(List<String> values) {
            addCriterion("KHBH not in", values, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhBetween(String value1, String value2) {
            addCriterion("KHBH between", value1, value2, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhNotBetween(String value1, String value2) {
            addCriterion("KHBH not between", value1, value2, "khbh");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("Contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("Contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("Contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("Contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("Contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("Contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("Contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("Contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("Contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("Contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("Contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("Contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("Contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("Contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("Duty is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("Duty is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(String value) {
            addCriterion("Duty =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(String value) {
            addCriterion("Duty <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(String value) {
            addCriterion("Duty >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(String value) {
            addCriterion("Duty >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(String value) {
            addCriterion("Duty <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(String value) {
            addCriterion("Duty <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLike(String value) {
            addCriterion("Duty like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotLike(String value) {
            addCriterion("Duty not like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<String> values) {
            addCriterion("Duty in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<String> values) {
            addCriterion("Duty not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(String value1, String value2) {
            addCriterion("Duty between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(String value1, String value2) {
            addCriterion("Duty not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("Mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("Mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("Mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("Mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("Mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("Mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("Mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("Mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("Mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIsNull() {
            addCriterion("OfficePhone is null");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIsNotNull() {
            addCriterion("OfficePhone is not null");
            return (Criteria) this;
        }

        public Criteria andOfficephoneEqualTo(String value) {
            addCriterion("OfficePhone =", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotEqualTo(String value) {
            addCriterion("OfficePhone <>", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneGreaterThan(String value) {
            addCriterion("OfficePhone >", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneGreaterThanOrEqualTo(String value) {
            addCriterion("OfficePhone >=", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLessThan(String value) {
            addCriterion("OfficePhone <", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLessThanOrEqualTo(String value) {
            addCriterion("OfficePhone <=", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLike(String value) {
            addCriterion("OfficePhone like", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotLike(String value) {
            addCriterion("OfficePhone not like", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIn(List<String> values) {
            addCriterion("OfficePhone in", values, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotIn(List<String> values) {
            addCriterion("OfficePhone not in", values, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneBetween(String value1, String value2) {
            addCriterion("OfficePhone between", value1, value2, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotBetween(String value1, String value2) {
            addCriterion("OfficePhone not between", value1, value2, "officephone");
            return (Criteria) this;
        }

        public Criteria andExtIsNull() {
            addCriterion("Ext is null");
            return (Criteria) this;
        }

        public Criteria andExtIsNotNull() {
            addCriterion("Ext is not null");
            return (Criteria) this;
        }

        public Criteria andExtEqualTo(String value) {
            addCriterion("Ext =", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotEqualTo(String value) {
            addCriterion("Ext <>", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThan(String value) {
            addCriterion("Ext >", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThanOrEqualTo(String value) {
            addCriterion("Ext >=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThan(String value) {
            addCriterion("Ext <", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThanOrEqualTo(String value) {
            addCriterion("Ext <=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLike(String value) {
            addCriterion("Ext like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotLike(String value) {
            addCriterion("Ext not like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtIn(List<String> values) {
            addCriterion("Ext in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotIn(List<String> values) {
            addCriterion("Ext not in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtBetween(String value1, String value2) {
            addCriterion("Ext between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotBetween(String value1, String value2) {
            addCriterion("Ext not between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andHomephoneIsNull() {
            addCriterion("HomePhone is null");
            return (Criteria) this;
        }

        public Criteria andHomephoneIsNotNull() {
            addCriterion("HomePhone is not null");
            return (Criteria) this;
        }

        public Criteria andHomephoneEqualTo(String value) {
            addCriterion("HomePhone =", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneNotEqualTo(String value) {
            addCriterion("HomePhone <>", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneGreaterThan(String value) {
            addCriterion("HomePhone >", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneGreaterThanOrEqualTo(String value) {
            addCriterion("HomePhone >=", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneLessThan(String value) {
            addCriterion("HomePhone <", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneLessThanOrEqualTo(String value) {
            addCriterion("HomePhone <=", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneLike(String value) {
            addCriterion("HomePhone like", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneNotLike(String value) {
            addCriterion("HomePhone not like", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneIn(List<String> values) {
            addCriterion("HomePhone in", values, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneNotIn(List<String> values) {
            addCriterion("HomePhone not in", values, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneBetween(String value1, String value2) {
            addCriterion("HomePhone between", value1, value2, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneNotBetween(String value1, String value2) {
            addCriterion("HomePhone not between", value1, value2, "homephone");
            return (Criteria) this;
        }

        public Criteria andOtherphoneIsNull() {
            addCriterion("OtherPhone is null");
            return (Criteria) this;
        }

        public Criteria andOtherphoneIsNotNull() {
            addCriterion("OtherPhone is not null");
            return (Criteria) this;
        }

        public Criteria andOtherphoneEqualTo(String value) {
            addCriterion("OtherPhone =", value, "otherphone");
            return (Criteria) this;
        }

        public Criteria andOtherphoneNotEqualTo(String value) {
            addCriterion("OtherPhone <>", value, "otherphone");
            return (Criteria) this;
        }

        public Criteria andOtherphoneGreaterThan(String value) {
            addCriterion("OtherPhone >", value, "otherphone");
            return (Criteria) this;
        }

        public Criteria andOtherphoneGreaterThanOrEqualTo(String value) {
            addCriterion("OtherPhone >=", value, "otherphone");
            return (Criteria) this;
        }

        public Criteria andOtherphoneLessThan(String value) {
            addCriterion("OtherPhone <", value, "otherphone");
            return (Criteria) this;
        }

        public Criteria andOtherphoneLessThanOrEqualTo(String value) {
            addCriterion("OtherPhone <=", value, "otherphone");
            return (Criteria) this;
        }

        public Criteria andOtherphoneLike(String value) {
            addCriterion("OtherPhone like", value, "otherphone");
            return (Criteria) this;
        }

        public Criteria andOtherphoneNotLike(String value) {
            addCriterion("OtherPhone not like", value, "otherphone");
            return (Criteria) this;
        }

        public Criteria andOtherphoneIn(List<String> values) {
            addCriterion("OtherPhone in", values, "otherphone");
            return (Criteria) this;
        }

        public Criteria andOtherphoneNotIn(List<String> values) {
            addCriterion("OtherPhone not in", values, "otherphone");
            return (Criteria) this;
        }

        public Criteria andOtherphoneBetween(String value1, String value2) {
            addCriterion("OtherPhone between", value1, value2, "otherphone");
            return (Criteria) this;
        }

        public Criteria andOtherphoneNotBetween(String value1, String value2) {
            addCriterion("OtherPhone not between", value1, value2, "otherphone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("Fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("Fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("Fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("Fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("Fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("Fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("Fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("Fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("Fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("Fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("Fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("Fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("Fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("Fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andContactaddrIsNull() {
            addCriterion("ContactAddr is null");
            return (Criteria) this;
        }

        public Criteria andContactaddrIsNotNull() {
            addCriterion("ContactAddr is not null");
            return (Criteria) this;
        }

        public Criteria andContactaddrEqualTo(String value) {
            addCriterion("ContactAddr =", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrNotEqualTo(String value) {
            addCriterion("ContactAddr <>", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrGreaterThan(String value) {
            addCriterion("ContactAddr >", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrGreaterThanOrEqualTo(String value) {
            addCriterion("ContactAddr >=", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrLessThan(String value) {
            addCriterion("ContactAddr <", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrLessThanOrEqualTo(String value) {
            addCriterion("ContactAddr <=", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrLike(String value) {
            addCriterion("ContactAddr like", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrNotLike(String value) {
            addCriterion("ContactAddr not like", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrIn(List<String> values) {
            addCriterion("ContactAddr in", values, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrNotIn(List<String> values) {
            addCriterion("ContactAddr not in", values, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrBetween(String value1, String value2) {
            addCriterion("ContactAddr between", value1, value2, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrNotBetween(String value1, String value2) {
            addCriterion("ContactAddr not between", value1, value2, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMsnIsNull() {
            addCriterion("MSN is null");
            return (Criteria) this;
        }

        public Criteria andMsnIsNotNull() {
            addCriterion("MSN is not null");
            return (Criteria) this;
        }

        public Criteria andMsnEqualTo(String value) {
            addCriterion("MSN =", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotEqualTo(String value) {
            addCriterion("MSN <>", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThan(String value) {
            addCriterion("MSN >", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThanOrEqualTo(String value) {
            addCriterion("MSN >=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThan(String value) {
            addCriterion("MSN <", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThanOrEqualTo(String value) {
            addCriterion("MSN <=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLike(String value) {
            addCriterion("MSN like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotLike(String value) {
            addCriterion("MSN not like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnIn(List<String> values) {
            addCriterion("MSN in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotIn(List<String> values) {
            addCriterion("MSN not in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnBetween(String value1, String value2) {
            addCriterion("MSN between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotBetween(String value1, String value2) {
            addCriterion("MSN not between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("Remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("Remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("Remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("Remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("Remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("Remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("Remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("Remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("Remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("Remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("Remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("Remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("Remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDefaultlxrIsNull() {
            addCriterion("DefaultLXR is null");
            return (Criteria) this;
        }

        public Criteria andDefaultlxrIsNotNull() {
            addCriterion("DefaultLXR is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultlxrEqualTo(Boolean value) {
            addCriterion("DefaultLXR =", value, "defaultlxr");
            return (Criteria) this;
        }

        public Criteria andDefaultlxrNotEqualTo(Boolean value) {
            addCriterion("DefaultLXR <>", value, "defaultlxr");
            return (Criteria) this;
        }

        public Criteria andDefaultlxrGreaterThan(Boolean value) {
            addCriterion("DefaultLXR >", value, "defaultlxr");
            return (Criteria) this;
        }

        public Criteria andDefaultlxrGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DefaultLXR >=", value, "defaultlxr");
            return (Criteria) this;
        }

        public Criteria andDefaultlxrLessThan(Boolean value) {
            addCriterion("DefaultLXR <", value, "defaultlxr");
            return (Criteria) this;
        }

        public Criteria andDefaultlxrLessThanOrEqualTo(Boolean value) {
            addCriterion("DefaultLXR <=", value, "defaultlxr");
            return (Criteria) this;
        }

        public Criteria andDefaultlxrIn(List<Boolean> values) {
            addCriterion("DefaultLXR in", values, "defaultlxr");
            return (Criteria) this;
        }

        public Criteria andDefaultlxrNotIn(List<Boolean> values) {
            addCriterion("DefaultLXR not in", values, "defaultlxr");
            return (Criteria) this;
        }

        public Criteria andDefaultlxrBetween(Boolean value1, Boolean value2) {
            addCriterion("DefaultLXR between", value1, value2, "defaultlxr");
            return (Criteria) this;
        }

        public Criteria andDefaultlxrNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DefaultLXR not between", value1, value2, "defaultlxr");
            return (Criteria) this;
        }

        public Criteria andZdy12IsNull() {
            addCriterion("ZDY12 is null");
            return (Criteria) this;
        }

        public Criteria andZdy12IsNotNull() {
            addCriterion("ZDY12 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy12EqualTo(String value) {
            addCriterion("ZDY12 =", value, "zdy12");
            return (Criteria) this;
        }

        public Criteria andZdy12NotEqualTo(String value) {
            addCriterion("ZDY12 <>", value, "zdy12");
            return (Criteria) this;
        }

        public Criteria andZdy12GreaterThan(String value) {
            addCriterion("ZDY12 >", value, "zdy12");
            return (Criteria) this;
        }

        public Criteria andZdy12GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY12 >=", value, "zdy12");
            return (Criteria) this;
        }

        public Criteria andZdy12LessThan(String value) {
            addCriterion("ZDY12 <", value, "zdy12");
            return (Criteria) this;
        }

        public Criteria andZdy12LessThanOrEqualTo(String value) {
            addCriterion("ZDY12 <=", value, "zdy12");
            return (Criteria) this;
        }

        public Criteria andZdy12Like(String value) {
            addCriterion("ZDY12 like", value, "zdy12");
            return (Criteria) this;
        }

        public Criteria andZdy12NotLike(String value) {
            addCriterion("ZDY12 not like", value, "zdy12");
            return (Criteria) this;
        }

        public Criteria andZdy12In(List<String> values) {
            addCriterion("ZDY12 in", values, "zdy12");
            return (Criteria) this;
        }

        public Criteria andZdy12NotIn(List<String> values) {
            addCriterion("ZDY12 not in", values, "zdy12");
            return (Criteria) this;
        }

        public Criteria andZdy12Between(String value1, String value2) {
            addCriterion("ZDY12 between", value1, value2, "zdy12");
            return (Criteria) this;
        }

        public Criteria andZdy12NotBetween(String value1, String value2) {
            addCriterion("ZDY12 not between", value1, value2, "zdy12");
            return (Criteria) this;
        }

        public Criteria andZdy13IsNull() {
            addCriterion("ZDY13 is null");
            return (Criteria) this;
        }

        public Criteria andZdy13IsNotNull() {
            addCriterion("ZDY13 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy13EqualTo(String value) {
            addCriterion("ZDY13 =", value, "zdy13");
            return (Criteria) this;
        }

        public Criteria andZdy13NotEqualTo(String value) {
            addCriterion("ZDY13 <>", value, "zdy13");
            return (Criteria) this;
        }

        public Criteria andZdy13GreaterThan(String value) {
            addCriterion("ZDY13 >", value, "zdy13");
            return (Criteria) this;
        }

        public Criteria andZdy13GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY13 >=", value, "zdy13");
            return (Criteria) this;
        }

        public Criteria andZdy13LessThan(String value) {
            addCriterion("ZDY13 <", value, "zdy13");
            return (Criteria) this;
        }

        public Criteria andZdy13LessThanOrEqualTo(String value) {
            addCriterion("ZDY13 <=", value, "zdy13");
            return (Criteria) this;
        }

        public Criteria andZdy13Like(String value) {
            addCriterion("ZDY13 like", value, "zdy13");
            return (Criteria) this;
        }

        public Criteria andZdy13NotLike(String value) {
            addCriterion("ZDY13 not like", value, "zdy13");
            return (Criteria) this;
        }

        public Criteria andZdy13In(List<String> values) {
            addCriterion("ZDY13 in", values, "zdy13");
            return (Criteria) this;
        }

        public Criteria andZdy13NotIn(List<String> values) {
            addCriterion("ZDY13 not in", values, "zdy13");
            return (Criteria) this;
        }

        public Criteria andZdy13Between(String value1, String value2) {
            addCriterion("ZDY13 between", value1, value2, "zdy13");
            return (Criteria) this;
        }

        public Criteria andZdy13NotBetween(String value1, String value2) {
            addCriterion("ZDY13 not between", value1, value2, "zdy13");
            return (Criteria) this;
        }

        public Criteria andZdy14IsNull() {
            addCriterion("ZDY14 is null");
            return (Criteria) this;
        }

        public Criteria andZdy14IsNotNull() {
            addCriterion("ZDY14 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy14EqualTo(String value) {
            addCriterion("ZDY14 =", value, "zdy14");
            return (Criteria) this;
        }

        public Criteria andZdy14NotEqualTo(String value) {
            addCriterion("ZDY14 <>", value, "zdy14");
            return (Criteria) this;
        }

        public Criteria andZdy14GreaterThan(String value) {
            addCriterion("ZDY14 >", value, "zdy14");
            return (Criteria) this;
        }

        public Criteria andZdy14GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY14 >=", value, "zdy14");
            return (Criteria) this;
        }

        public Criteria andZdy14LessThan(String value) {
            addCriterion("ZDY14 <", value, "zdy14");
            return (Criteria) this;
        }

        public Criteria andZdy14LessThanOrEqualTo(String value) {
            addCriterion("ZDY14 <=", value, "zdy14");
            return (Criteria) this;
        }

        public Criteria andZdy14Like(String value) {
            addCriterion("ZDY14 like", value, "zdy14");
            return (Criteria) this;
        }

        public Criteria andZdy14NotLike(String value) {
            addCriterion("ZDY14 not like", value, "zdy14");
            return (Criteria) this;
        }

        public Criteria andZdy14In(List<String> values) {
            addCriterion("ZDY14 in", values, "zdy14");
            return (Criteria) this;
        }

        public Criteria andZdy14NotIn(List<String> values) {
            addCriterion("ZDY14 not in", values, "zdy14");
            return (Criteria) this;
        }

        public Criteria andZdy14Between(String value1, String value2) {
            addCriterion("ZDY14 between", value1, value2, "zdy14");
            return (Criteria) this;
        }

        public Criteria andZdy14NotBetween(String value1, String value2) {
            addCriterion("ZDY14 not between", value1, value2, "zdy14");
            return (Criteria) this;
        }

        public Criteria andZdy15IsNull() {
            addCriterion("ZDY15 is null");
            return (Criteria) this;
        }

        public Criteria andZdy15IsNotNull() {
            addCriterion("ZDY15 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy15EqualTo(String value) {
            addCriterion("ZDY15 =", value, "zdy15");
            return (Criteria) this;
        }

        public Criteria andZdy15NotEqualTo(String value) {
            addCriterion("ZDY15 <>", value, "zdy15");
            return (Criteria) this;
        }

        public Criteria andZdy15GreaterThan(String value) {
            addCriterion("ZDY15 >", value, "zdy15");
            return (Criteria) this;
        }

        public Criteria andZdy15GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY15 >=", value, "zdy15");
            return (Criteria) this;
        }

        public Criteria andZdy15LessThan(String value) {
            addCriterion("ZDY15 <", value, "zdy15");
            return (Criteria) this;
        }

        public Criteria andZdy15LessThanOrEqualTo(String value) {
            addCriterion("ZDY15 <=", value, "zdy15");
            return (Criteria) this;
        }

        public Criteria andZdy15Like(String value) {
            addCriterion("ZDY15 like", value, "zdy15");
            return (Criteria) this;
        }

        public Criteria andZdy15NotLike(String value) {
            addCriterion("ZDY15 not like", value, "zdy15");
            return (Criteria) this;
        }

        public Criteria andZdy15In(List<String> values) {
            addCriterion("ZDY15 in", values, "zdy15");
            return (Criteria) this;
        }

        public Criteria andZdy15NotIn(List<String> values) {
            addCriterion("ZDY15 not in", values, "zdy15");
            return (Criteria) this;
        }

        public Criteria andZdy15Between(String value1, String value2) {
            addCriterion("ZDY15 between", value1, value2, "zdy15");
            return (Criteria) this;
        }

        public Criteria andZdy15NotBetween(String value1, String value2) {
            addCriterion("ZDY15 not between", value1, value2, "zdy15");
            return (Criteria) this;
        }

        public Criteria andRemarks1IsNull() {
            addCriterion("Remarks1 is null");
            return (Criteria) this;
        }

        public Criteria andRemarks1IsNotNull() {
            addCriterion("Remarks1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemarks1EqualTo(String value) {
            addCriterion("Remarks1 =", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotEqualTo(String value) {
            addCriterion("Remarks1 <>", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1GreaterThan(String value) {
            addCriterion("Remarks1 >", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1GreaterThanOrEqualTo(String value) {
            addCriterion("Remarks1 >=", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1LessThan(String value) {
            addCriterion("Remarks1 <", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1LessThanOrEqualTo(String value) {
            addCriterion("Remarks1 <=", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1Like(String value) {
            addCriterion("Remarks1 like", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotLike(String value) {
            addCriterion("Remarks1 not like", value, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1In(List<String> values) {
            addCriterion("Remarks1 in", values, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotIn(List<String> values) {
            addCriterion("Remarks1 not in", values, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1Between(String value1, String value2) {
            addCriterion("Remarks1 between", value1, value2, "remarks1");
            return (Criteria) this;
        }

        public Criteria andRemarks1NotBetween(String value1, String value2) {
            addCriterion("Remarks1 not between", value1, value2, "remarks1");
            return (Criteria) this;
        }

        public Criteria andDefaultlxr1IsNull() {
            addCriterion("DefaultLXR1 is null");
            return (Criteria) this;
        }

        public Criteria andDefaultlxr1IsNotNull() {
            addCriterion("DefaultLXR1 is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultlxr1EqualTo(Boolean value) {
            addCriterion("DefaultLXR1 =", value, "defaultlxr1");
            return (Criteria) this;
        }

        public Criteria andDefaultlxr1NotEqualTo(Boolean value) {
            addCriterion("DefaultLXR1 <>", value, "defaultlxr1");
            return (Criteria) this;
        }

        public Criteria andDefaultlxr1GreaterThan(Boolean value) {
            addCriterion("DefaultLXR1 >", value, "defaultlxr1");
            return (Criteria) this;
        }

        public Criteria andDefaultlxr1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("DefaultLXR1 >=", value, "defaultlxr1");
            return (Criteria) this;
        }

        public Criteria andDefaultlxr1LessThan(Boolean value) {
            addCriterion("DefaultLXR1 <", value, "defaultlxr1");
            return (Criteria) this;
        }

        public Criteria andDefaultlxr1LessThanOrEqualTo(Boolean value) {
            addCriterion("DefaultLXR1 <=", value, "defaultlxr1");
            return (Criteria) this;
        }

        public Criteria andDefaultlxr1In(List<Boolean> values) {
            addCriterion("DefaultLXR1 in", values, "defaultlxr1");
            return (Criteria) this;
        }

        public Criteria andDefaultlxr1NotIn(List<Boolean> values) {
            addCriterion("DefaultLXR1 not in", values, "defaultlxr1");
            return (Criteria) this;
        }

        public Criteria andDefaultlxr1Between(Boolean value1, Boolean value2) {
            addCriterion("DefaultLXR1 between", value1, value2, "defaultlxr1");
            return (Criteria) this;
        }

        public Criteria andDefaultlxr1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("DefaultLXR1 not between", value1, value2, "defaultlxr1");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}