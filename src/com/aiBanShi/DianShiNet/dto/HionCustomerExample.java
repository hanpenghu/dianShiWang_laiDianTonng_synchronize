package com.aiBanShi.DianShiNet.dto;

import java.util.ArrayList;
import java.util.List;

public class HionCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HionCustomerExample() {
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

        public Criteria andCompanynameIsNull() {
            addCriterion("CompanyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("CompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("CompanyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("CompanyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("CompanyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("CompanyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("CompanyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("CompanyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("CompanyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("CompanyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("CompanyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("CompanyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("CompanyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrIsNull() {
            addCriterion("CompanyAddr is null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrIsNotNull() {
            addCriterion("CompanyAddr is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrEqualTo(String value) {
            addCriterion("CompanyAddr =", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotEqualTo(String value) {
            addCriterion("CompanyAddr <>", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrGreaterThan(String value) {
            addCriterion("CompanyAddr >", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyAddr >=", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrLessThan(String value) {
            addCriterion("CompanyAddr <", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrLessThanOrEqualTo(String value) {
            addCriterion("CompanyAddr <=", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrLike(String value) {
            addCriterion("CompanyAddr like", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotLike(String value) {
            addCriterion("CompanyAddr not like", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrIn(List<String> values) {
            addCriterion("CompanyAddr in", values, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotIn(List<String> values) {
            addCriterion("CompanyAddr not in", values, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrBetween(String value1, String value2) {
            addCriterion("CompanyAddr between", value1, value2, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotBetween(String value1, String value2) {
            addCriterion("CompanyAddr not between", value1, value2, "companyaddr");
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

        public Criteria andVipIsNull() {
            addCriterion("VIP is null");
            return (Criteria) this;
        }

        public Criteria andVipIsNotNull() {
            addCriterion("VIP is not null");
            return (Criteria) this;
        }

        public Criteria andVipEqualTo(String value) {
            addCriterion("VIP =", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotEqualTo(String value) {
            addCriterion("VIP <>", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThan(String value) {
            addCriterion("VIP >", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThanOrEqualTo(String value) {
            addCriterion("VIP >=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThan(String value) {
            addCriterion("VIP <", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThanOrEqualTo(String value) {
            addCriterion("VIP <=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLike(String value) {
            addCriterion("VIP like", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotLike(String value) {
            addCriterion("VIP not like", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipIn(List<String> values) {
            addCriterion("VIP in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotIn(List<String> values) {
            addCriterion("VIP not in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipBetween(String value1, String value2) {
            addCriterion("VIP between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotBetween(String value1, String value2) {
            addCriterion("VIP not between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andContactortypeIsNull() {
            addCriterion("ContactorType is null");
            return (Criteria) this;
        }

        public Criteria andContactortypeIsNotNull() {
            addCriterion("ContactorType is not null");
            return (Criteria) this;
        }

        public Criteria andContactortypeEqualTo(String value) {
            addCriterion("ContactorType =", value, "contactortype");
            return (Criteria) this;
        }

        public Criteria andContactortypeNotEqualTo(String value) {
            addCriterion("ContactorType <>", value, "contactortype");
            return (Criteria) this;
        }

        public Criteria andContactortypeGreaterThan(String value) {
            addCriterion("ContactorType >", value, "contactortype");
            return (Criteria) this;
        }

        public Criteria andContactortypeGreaterThanOrEqualTo(String value) {
            addCriterion("ContactorType >=", value, "contactortype");
            return (Criteria) this;
        }

        public Criteria andContactortypeLessThan(String value) {
            addCriterion("ContactorType <", value, "contactortype");
            return (Criteria) this;
        }

        public Criteria andContactortypeLessThanOrEqualTo(String value) {
            addCriterion("ContactorType <=", value, "contactortype");
            return (Criteria) this;
        }

        public Criteria andContactortypeLike(String value) {
            addCriterion("ContactorType like", value, "contactortype");
            return (Criteria) this;
        }

        public Criteria andContactortypeNotLike(String value) {
            addCriterion("ContactorType not like", value, "contactortype");
            return (Criteria) this;
        }

        public Criteria andContactortypeIn(List<String> values) {
            addCriterion("ContactorType in", values, "contactortype");
            return (Criteria) this;
        }

        public Criteria andContactortypeNotIn(List<String> values) {
            addCriterion("ContactorType not in", values, "contactortype");
            return (Criteria) this;
        }

        public Criteria andContactortypeBetween(String value1, String value2) {
            addCriterion("ContactorType between", value1, value2, "contactortype");
            return (Criteria) this;
        }

        public Criteria andContactortypeNotBetween(String value1, String value2) {
            addCriterion("ContactorType not between", value1, value2, "contactortype");
            return (Criteria) this;
        }

        public Criteria andIntentionIsNull() {
            addCriterion("Intention is null");
            return (Criteria) this;
        }

        public Criteria andIntentionIsNotNull() {
            addCriterion("Intention is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionEqualTo(String value) {
            addCriterion("Intention =", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionNotEqualTo(String value) {
            addCriterion("Intention <>", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionGreaterThan(String value) {
            addCriterion("Intention >", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionGreaterThanOrEqualTo(String value) {
            addCriterion("Intention >=", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionLessThan(String value) {
            addCriterion("Intention <", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionLessThanOrEqualTo(String value) {
            addCriterion("Intention <=", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionLike(String value) {
            addCriterion("Intention like", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionNotLike(String value) {
            addCriterion("Intention not like", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionIn(List<String> values) {
            addCriterion("Intention in", values, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionNotIn(List<String> values) {
            addCriterion("Intention not in", values, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionBetween(String value1, String value2) {
            addCriterion("Intention between", value1, value2, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionNotBetween(String value1, String value2) {
            addCriterion("Intention not between", value1, value2, "intention");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("Area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("Area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("Area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("Area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("Area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("Area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("Area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("Area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("Area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("Area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("Area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("Area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("Area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("Area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andWorkeridIsNull() {
            addCriterion("Workerid is null");
            return (Criteria) this;
        }

        public Criteria andWorkeridIsNotNull() {
            addCriterion("Workerid is not null");
            return (Criteria) this;
        }

        public Criteria andWorkeridEqualTo(String value) {
            addCriterion("Workerid =", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotEqualTo(String value) {
            addCriterion("Workerid <>", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThan(String value) {
            addCriterion("Workerid >", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThanOrEqualTo(String value) {
            addCriterion("Workerid >=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThan(String value) {
            addCriterion("Workerid <", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThanOrEqualTo(String value) {
            addCriterion("Workerid <=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLike(String value) {
            addCriterion("Workerid like", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotLike(String value) {
            addCriterion("Workerid not like", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridIn(List<String> values) {
            addCriterion("Workerid in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotIn(List<String> values) {
            addCriterion("Workerid not in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridBetween(String value1, String value2) {
            addCriterion("Workerid between", value1, value2, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotBetween(String value1, String value2) {
            addCriterion("Workerid not between", value1, value2, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkernameIsNull() {
            addCriterion("WorkerName is null");
            return (Criteria) this;
        }

        public Criteria andWorkernameIsNotNull() {
            addCriterion("WorkerName is not null");
            return (Criteria) this;
        }

        public Criteria andWorkernameEqualTo(String value) {
            addCriterion("WorkerName =", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotEqualTo(String value) {
            addCriterion("WorkerName <>", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThan(String value) {
            addCriterion("WorkerName >", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThanOrEqualTo(String value) {
            addCriterion("WorkerName >=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThan(String value) {
            addCriterion("WorkerName <", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThanOrEqualTo(String value) {
            addCriterion("WorkerName <=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLike(String value) {
            addCriterion("WorkerName like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotLike(String value) {
            addCriterion("WorkerName not like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameIn(List<String> values) {
            addCriterion("WorkerName in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotIn(List<String> values) {
            addCriterion("WorkerName not in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameBetween(String value1, String value2) {
            addCriterion("WorkerName between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotBetween(String value1, String value2) {
            addCriterion("WorkerName not between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeIsNull() {
            addCriterion("FirstCallTime is null");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeIsNotNull() {
            addCriterion("FirstCallTime is not null");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeEqualTo(String value) {
            addCriterion("FirstCallTime =", value, "firstcalltime");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeNotEqualTo(String value) {
            addCriterion("FirstCallTime <>", value, "firstcalltime");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeGreaterThan(String value) {
            addCriterion("FirstCallTime >", value, "firstcalltime");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeGreaterThanOrEqualTo(String value) {
            addCriterion("FirstCallTime >=", value, "firstcalltime");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeLessThan(String value) {
            addCriterion("FirstCallTime <", value, "firstcalltime");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeLessThanOrEqualTo(String value) {
            addCriterion("FirstCallTime <=", value, "firstcalltime");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeLike(String value) {
            addCriterion("FirstCallTime like", value, "firstcalltime");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeNotLike(String value) {
            addCriterion("FirstCallTime not like", value, "firstcalltime");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeIn(List<String> values) {
            addCriterion("FirstCallTime in", values, "firstcalltime");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeNotIn(List<String> values) {
            addCriterion("FirstCallTime not in", values, "firstcalltime");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeBetween(String value1, String value2) {
            addCriterion("FirstCallTime between", value1, value2, "firstcalltime");
            return (Criteria) this;
        }

        public Criteria andFirstcalltimeNotBetween(String value1, String value2) {
            addCriterion("FirstCallTime not between", value1, value2, "firstcalltime");
            return (Criteria) this;
        }

        public Criteria andZdy1IsNull() {
            addCriterion("ZDY1 is null");
            return (Criteria) this;
        }

        public Criteria andZdy1IsNotNull() {
            addCriterion("ZDY1 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy1EqualTo(String value) {
            addCriterion("ZDY1 =", value, "zdy1");
            return (Criteria) this;
        }

        public Criteria andZdy1NotEqualTo(String value) {
            addCriterion("ZDY1 <>", value, "zdy1");
            return (Criteria) this;
        }

        public Criteria andZdy1GreaterThan(String value) {
            addCriterion("ZDY1 >", value, "zdy1");
            return (Criteria) this;
        }

        public Criteria andZdy1GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY1 >=", value, "zdy1");
            return (Criteria) this;
        }

        public Criteria andZdy1LessThan(String value) {
            addCriterion("ZDY1 <", value, "zdy1");
            return (Criteria) this;
        }

        public Criteria andZdy1LessThanOrEqualTo(String value) {
            addCriterion("ZDY1 <=", value, "zdy1");
            return (Criteria) this;
        }

        public Criteria andZdy1Like(String value) {
            addCriterion("ZDY1 like", value, "zdy1");
            return (Criteria) this;
        }

        public Criteria andZdy1NotLike(String value) {
            addCriterion("ZDY1 not like", value, "zdy1");
            return (Criteria) this;
        }

        public Criteria andZdy1In(List<String> values) {
            addCriterion("ZDY1 in", values, "zdy1");
            return (Criteria) this;
        }

        public Criteria andZdy1NotIn(List<String> values) {
            addCriterion("ZDY1 not in", values, "zdy1");
            return (Criteria) this;
        }

        public Criteria andZdy1Between(String value1, String value2) {
            addCriterion("ZDY1 between", value1, value2, "zdy1");
            return (Criteria) this;
        }

        public Criteria andZdy1NotBetween(String value1, String value2) {
            addCriterion("ZDY1 not between", value1, value2, "zdy1");
            return (Criteria) this;
        }

        public Criteria andZdy2IsNull() {
            addCriterion("ZDY2 is null");
            return (Criteria) this;
        }

        public Criteria andZdy2IsNotNull() {
            addCriterion("ZDY2 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy2EqualTo(String value) {
            addCriterion("ZDY2 =", value, "zdy2");
            return (Criteria) this;
        }

        public Criteria andZdy2NotEqualTo(String value) {
            addCriterion("ZDY2 <>", value, "zdy2");
            return (Criteria) this;
        }

        public Criteria andZdy2GreaterThan(String value) {
            addCriterion("ZDY2 >", value, "zdy2");
            return (Criteria) this;
        }

        public Criteria andZdy2GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY2 >=", value, "zdy2");
            return (Criteria) this;
        }

        public Criteria andZdy2LessThan(String value) {
            addCriterion("ZDY2 <", value, "zdy2");
            return (Criteria) this;
        }

        public Criteria andZdy2LessThanOrEqualTo(String value) {
            addCriterion("ZDY2 <=", value, "zdy2");
            return (Criteria) this;
        }

        public Criteria andZdy2Like(String value) {
            addCriterion("ZDY2 like", value, "zdy2");
            return (Criteria) this;
        }

        public Criteria andZdy2NotLike(String value) {
            addCriterion("ZDY2 not like", value, "zdy2");
            return (Criteria) this;
        }

        public Criteria andZdy2In(List<String> values) {
            addCriterion("ZDY2 in", values, "zdy2");
            return (Criteria) this;
        }

        public Criteria andZdy2NotIn(List<String> values) {
            addCriterion("ZDY2 not in", values, "zdy2");
            return (Criteria) this;
        }

        public Criteria andZdy2Between(String value1, String value2) {
            addCriterion("ZDY2 between", value1, value2, "zdy2");
            return (Criteria) this;
        }

        public Criteria andZdy2NotBetween(String value1, String value2) {
            addCriterion("ZDY2 not between", value1, value2, "zdy2");
            return (Criteria) this;
        }

        public Criteria andZdy3IsNull() {
            addCriterion("ZDY3 is null");
            return (Criteria) this;
        }

        public Criteria andZdy3IsNotNull() {
            addCriterion("ZDY3 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy3EqualTo(String value) {
            addCriterion("ZDY3 =", value, "zdy3");
            return (Criteria) this;
        }

        public Criteria andZdy3NotEqualTo(String value) {
            addCriterion("ZDY3 <>", value, "zdy3");
            return (Criteria) this;
        }

        public Criteria andZdy3GreaterThan(String value) {
            addCriterion("ZDY3 >", value, "zdy3");
            return (Criteria) this;
        }

        public Criteria andZdy3GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY3 >=", value, "zdy3");
            return (Criteria) this;
        }

        public Criteria andZdy3LessThan(String value) {
            addCriterion("ZDY3 <", value, "zdy3");
            return (Criteria) this;
        }

        public Criteria andZdy3LessThanOrEqualTo(String value) {
            addCriterion("ZDY3 <=", value, "zdy3");
            return (Criteria) this;
        }

        public Criteria andZdy3Like(String value) {
            addCriterion("ZDY3 like", value, "zdy3");
            return (Criteria) this;
        }

        public Criteria andZdy3NotLike(String value) {
            addCriterion("ZDY3 not like", value, "zdy3");
            return (Criteria) this;
        }

        public Criteria andZdy3In(List<String> values) {
            addCriterion("ZDY3 in", values, "zdy3");
            return (Criteria) this;
        }

        public Criteria andZdy3NotIn(List<String> values) {
            addCriterion("ZDY3 not in", values, "zdy3");
            return (Criteria) this;
        }

        public Criteria andZdy3Between(String value1, String value2) {
            addCriterion("ZDY3 between", value1, value2, "zdy3");
            return (Criteria) this;
        }

        public Criteria andZdy3NotBetween(String value1, String value2) {
            addCriterion("ZDY3 not between", value1, value2, "zdy3");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeIsNull() {
            addCriterion("LastContactTime is null");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeIsNotNull() {
            addCriterion("LastContactTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeEqualTo(String value) {
            addCriterion("LastContactTime =", value, "lastcontacttime");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeNotEqualTo(String value) {
            addCriterion("LastContactTime <>", value, "lastcontacttime");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeGreaterThan(String value) {
            addCriterion("LastContactTime >", value, "lastcontacttime");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeGreaterThanOrEqualTo(String value) {
            addCriterion("LastContactTime >=", value, "lastcontacttime");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeLessThan(String value) {
            addCriterion("LastContactTime <", value, "lastcontacttime");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeLessThanOrEqualTo(String value) {
            addCriterion("LastContactTime <=", value, "lastcontacttime");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeLike(String value) {
            addCriterion("LastContactTime like", value, "lastcontacttime");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeNotLike(String value) {
            addCriterion("LastContactTime not like", value, "lastcontacttime");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeIn(List<String> values) {
            addCriterion("LastContactTime in", values, "lastcontacttime");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeNotIn(List<String> values) {
            addCriterion("LastContactTime not in", values, "lastcontacttime");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeBetween(String value1, String value2) {
            addCriterion("LastContactTime between", value1, value2, "lastcontacttime");
            return (Criteria) this;
        }

        public Criteria andLastcontacttimeNotBetween(String value1, String value2) {
            addCriterion("LastContactTime not between", value1, value2, "lastcontacttime");
            return (Criteria) this;
        }

        public Criteria andZdy4IsNull() {
            addCriterion("ZDY4 is null");
            return (Criteria) this;
        }

        public Criteria andZdy4IsNotNull() {
            addCriterion("ZDY4 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy4EqualTo(String value) {
            addCriterion("ZDY4 =", value, "zdy4");
            return (Criteria) this;
        }

        public Criteria andZdy4NotEqualTo(String value) {
            addCriterion("ZDY4 <>", value, "zdy4");
            return (Criteria) this;
        }

        public Criteria andZdy4GreaterThan(String value) {
            addCriterion("ZDY4 >", value, "zdy4");
            return (Criteria) this;
        }

        public Criteria andZdy4GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY4 >=", value, "zdy4");
            return (Criteria) this;
        }

        public Criteria andZdy4LessThan(String value) {
            addCriterion("ZDY4 <", value, "zdy4");
            return (Criteria) this;
        }

        public Criteria andZdy4LessThanOrEqualTo(String value) {
            addCriterion("ZDY4 <=", value, "zdy4");
            return (Criteria) this;
        }

        public Criteria andZdy4Like(String value) {
            addCriterion("ZDY4 like", value, "zdy4");
            return (Criteria) this;
        }

        public Criteria andZdy4NotLike(String value) {
            addCriterion("ZDY4 not like", value, "zdy4");
            return (Criteria) this;
        }

        public Criteria andZdy4In(List<String> values) {
            addCriterion("ZDY4 in", values, "zdy4");
            return (Criteria) this;
        }

        public Criteria andZdy4NotIn(List<String> values) {
            addCriterion("ZDY4 not in", values, "zdy4");
            return (Criteria) this;
        }

        public Criteria andZdy4Between(String value1, String value2) {
            addCriterion("ZDY4 between", value1, value2, "zdy4");
            return (Criteria) this;
        }

        public Criteria andZdy4NotBetween(String value1, String value2) {
            addCriterion("ZDY4 not between", value1, value2, "zdy4");
            return (Criteria) this;
        }

        public Criteria andZdy5IsNull() {
            addCriterion("ZDY5 is null");
            return (Criteria) this;
        }

        public Criteria andZdy5IsNotNull() {
            addCriterion("ZDY5 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy5EqualTo(String value) {
            addCriterion("ZDY5 =", value, "zdy5");
            return (Criteria) this;
        }

        public Criteria andZdy5NotEqualTo(String value) {
            addCriterion("ZDY5 <>", value, "zdy5");
            return (Criteria) this;
        }

        public Criteria andZdy5GreaterThan(String value) {
            addCriterion("ZDY5 >", value, "zdy5");
            return (Criteria) this;
        }

        public Criteria andZdy5GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY5 >=", value, "zdy5");
            return (Criteria) this;
        }

        public Criteria andZdy5LessThan(String value) {
            addCriterion("ZDY5 <", value, "zdy5");
            return (Criteria) this;
        }

        public Criteria andZdy5LessThanOrEqualTo(String value) {
            addCriterion("ZDY5 <=", value, "zdy5");
            return (Criteria) this;
        }

        public Criteria andZdy5Like(String value) {
            addCriterion("ZDY5 like", value, "zdy5");
            return (Criteria) this;
        }

        public Criteria andZdy5NotLike(String value) {
            addCriterion("ZDY5 not like", value, "zdy5");
            return (Criteria) this;
        }

        public Criteria andZdy5In(List<String> values) {
            addCriterion("ZDY5 in", values, "zdy5");
            return (Criteria) this;
        }

        public Criteria andZdy5NotIn(List<String> values) {
            addCriterion("ZDY5 not in", values, "zdy5");
            return (Criteria) this;
        }

        public Criteria andZdy5Between(String value1, String value2) {
            addCriterion("ZDY5 between", value1, value2, "zdy5");
            return (Criteria) this;
        }

        public Criteria andZdy5NotBetween(String value1, String value2) {
            addCriterion("ZDY5 not between", value1, value2, "zdy5");
            return (Criteria) this;
        }

        public Criteria andZdy6IsNull() {
            addCriterion("ZDY6 is null");
            return (Criteria) this;
        }

        public Criteria andZdy6IsNotNull() {
            addCriterion("ZDY6 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy6EqualTo(String value) {
            addCriterion("ZDY6 =", value, "zdy6");
            return (Criteria) this;
        }

        public Criteria andZdy6NotEqualTo(String value) {
            addCriterion("ZDY6 <>", value, "zdy6");
            return (Criteria) this;
        }

        public Criteria andZdy6GreaterThan(String value) {
            addCriterion("ZDY6 >", value, "zdy6");
            return (Criteria) this;
        }

        public Criteria andZdy6GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY6 >=", value, "zdy6");
            return (Criteria) this;
        }

        public Criteria andZdy6LessThan(String value) {
            addCriterion("ZDY6 <", value, "zdy6");
            return (Criteria) this;
        }

        public Criteria andZdy6LessThanOrEqualTo(String value) {
            addCriterion("ZDY6 <=", value, "zdy6");
            return (Criteria) this;
        }

        public Criteria andZdy6Like(String value) {
            addCriterion("ZDY6 like", value, "zdy6");
            return (Criteria) this;
        }

        public Criteria andZdy6NotLike(String value) {
            addCriterion("ZDY6 not like", value, "zdy6");
            return (Criteria) this;
        }

        public Criteria andZdy6In(List<String> values) {
            addCriterion("ZDY6 in", values, "zdy6");
            return (Criteria) this;
        }

        public Criteria andZdy6NotIn(List<String> values) {
            addCriterion("ZDY6 not in", values, "zdy6");
            return (Criteria) this;
        }

        public Criteria andZdy6Between(String value1, String value2) {
            addCriterion("ZDY6 between", value1, value2, "zdy6");
            return (Criteria) this;
        }

        public Criteria andZdy6NotBetween(String value1, String value2) {
            addCriterion("ZDY6 not between", value1, value2, "zdy6");
            return (Criteria) this;
        }

        public Criteria andZdy7IsNull() {
            addCriterion("ZDY7 is null");
            return (Criteria) this;
        }

        public Criteria andZdy7IsNotNull() {
            addCriterion("ZDY7 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy7EqualTo(String value) {
            addCriterion("ZDY7 =", value, "zdy7");
            return (Criteria) this;
        }

        public Criteria andZdy7NotEqualTo(String value) {
            addCriterion("ZDY7 <>", value, "zdy7");
            return (Criteria) this;
        }

        public Criteria andZdy7GreaterThan(String value) {
            addCriterion("ZDY7 >", value, "zdy7");
            return (Criteria) this;
        }

        public Criteria andZdy7GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY7 >=", value, "zdy7");
            return (Criteria) this;
        }

        public Criteria andZdy7LessThan(String value) {
            addCriterion("ZDY7 <", value, "zdy7");
            return (Criteria) this;
        }

        public Criteria andZdy7LessThanOrEqualTo(String value) {
            addCriterion("ZDY7 <=", value, "zdy7");
            return (Criteria) this;
        }

        public Criteria andZdy7Like(String value) {
            addCriterion("ZDY7 like", value, "zdy7");
            return (Criteria) this;
        }

        public Criteria andZdy7NotLike(String value) {
            addCriterion("ZDY7 not like", value, "zdy7");
            return (Criteria) this;
        }

        public Criteria andZdy7In(List<String> values) {
            addCriterion("ZDY7 in", values, "zdy7");
            return (Criteria) this;
        }

        public Criteria andZdy7NotIn(List<String> values) {
            addCriterion("ZDY7 not in", values, "zdy7");
            return (Criteria) this;
        }

        public Criteria andZdy7Between(String value1, String value2) {
            addCriterion("ZDY7 between", value1, value2, "zdy7");
            return (Criteria) this;
        }

        public Criteria andZdy7NotBetween(String value1, String value2) {
            addCriterion("ZDY7 not between", value1, value2, "zdy7");
            return (Criteria) this;
        }

        public Criteria andCalltypeIsNull() {
            addCriterion("CallType is null");
            return (Criteria) this;
        }

        public Criteria andCalltypeIsNotNull() {
            addCriterion("CallType is not null");
            return (Criteria) this;
        }

        public Criteria andCalltypeEqualTo(Integer value) {
            addCriterion("CallType =", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotEqualTo(Integer value) {
            addCriterion("CallType <>", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeGreaterThan(Integer value) {
            addCriterion("CallType >", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CallType >=", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeLessThan(Integer value) {
            addCriterion("CallType <", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeLessThanOrEqualTo(Integer value) {
            addCriterion("CallType <=", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeIn(List<Integer> values) {
            addCriterion("CallType in", values, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotIn(List<Integer> values) {
            addCriterion("CallType not in", values, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeBetween(Integer value1, Integer value2) {
            addCriterion("CallType between", value1, value2, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CallType not between", value1, value2, "calltype");
            return (Criteria) this;
        }

        public Criteria andZdy8IsNull() {
            addCriterion("ZDY8 is null");
            return (Criteria) this;
        }

        public Criteria andZdy8IsNotNull() {
            addCriterion("ZDY8 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy8EqualTo(String value) {
            addCriterion("ZDY8 =", value, "zdy8");
            return (Criteria) this;
        }

        public Criteria andZdy8NotEqualTo(String value) {
            addCriterion("ZDY8 <>", value, "zdy8");
            return (Criteria) this;
        }

        public Criteria andZdy8GreaterThan(String value) {
            addCriterion("ZDY8 >", value, "zdy8");
            return (Criteria) this;
        }

        public Criteria andZdy8GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY8 >=", value, "zdy8");
            return (Criteria) this;
        }

        public Criteria andZdy8LessThan(String value) {
            addCriterion("ZDY8 <", value, "zdy8");
            return (Criteria) this;
        }

        public Criteria andZdy8LessThanOrEqualTo(String value) {
            addCriterion("ZDY8 <=", value, "zdy8");
            return (Criteria) this;
        }

        public Criteria andZdy8Like(String value) {
            addCriterion("ZDY8 like", value, "zdy8");
            return (Criteria) this;
        }

        public Criteria andZdy8NotLike(String value) {
            addCriterion("ZDY8 not like", value, "zdy8");
            return (Criteria) this;
        }

        public Criteria andZdy8In(List<String> values) {
            addCriterion("ZDY8 in", values, "zdy8");
            return (Criteria) this;
        }

        public Criteria andZdy8NotIn(List<String> values) {
            addCriterion("ZDY8 not in", values, "zdy8");
            return (Criteria) this;
        }

        public Criteria andZdy8Between(String value1, String value2) {
            addCriterion("ZDY8 between", value1, value2, "zdy8");
            return (Criteria) this;
        }

        public Criteria andZdy8NotBetween(String value1, String value2) {
            addCriterion("ZDY8 not between", value1, value2, "zdy8");
            return (Criteria) this;
        }

        public Criteria andZdy9IsNull() {
            addCriterion("ZDY9 is null");
            return (Criteria) this;
        }

        public Criteria andZdy9IsNotNull() {
            addCriterion("ZDY9 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy9EqualTo(String value) {
            addCriterion("ZDY9 =", value, "zdy9");
            return (Criteria) this;
        }

        public Criteria andZdy9NotEqualTo(String value) {
            addCriterion("ZDY9 <>", value, "zdy9");
            return (Criteria) this;
        }

        public Criteria andZdy9GreaterThan(String value) {
            addCriterion("ZDY9 >", value, "zdy9");
            return (Criteria) this;
        }

        public Criteria andZdy9GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY9 >=", value, "zdy9");
            return (Criteria) this;
        }

        public Criteria andZdy9LessThan(String value) {
            addCriterion("ZDY9 <", value, "zdy9");
            return (Criteria) this;
        }

        public Criteria andZdy9LessThanOrEqualTo(String value) {
            addCriterion("ZDY9 <=", value, "zdy9");
            return (Criteria) this;
        }

        public Criteria andZdy9Like(String value) {
            addCriterion("ZDY9 like", value, "zdy9");
            return (Criteria) this;
        }

        public Criteria andZdy9NotLike(String value) {
            addCriterion("ZDY9 not like", value, "zdy9");
            return (Criteria) this;
        }

        public Criteria andZdy9In(List<String> values) {
            addCriterion("ZDY9 in", values, "zdy9");
            return (Criteria) this;
        }

        public Criteria andZdy9NotIn(List<String> values) {
            addCriterion("ZDY9 not in", values, "zdy9");
            return (Criteria) this;
        }

        public Criteria andZdy9Between(String value1, String value2) {
            addCriterion("ZDY9 between", value1, value2, "zdy9");
            return (Criteria) this;
        }

        public Criteria andZdy9NotBetween(String value1, String value2) {
            addCriterion("ZDY9 not between", value1, value2, "zdy9");
            return (Criteria) this;
        }

        public Criteria andZdy10IsNull() {
            addCriterion("ZDY10 is null");
            return (Criteria) this;
        }

        public Criteria andZdy10IsNotNull() {
            addCriterion("ZDY10 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy10EqualTo(String value) {
            addCriterion("ZDY10 =", value, "zdy10");
            return (Criteria) this;
        }

        public Criteria andZdy10NotEqualTo(String value) {
            addCriterion("ZDY10 <>", value, "zdy10");
            return (Criteria) this;
        }

        public Criteria andZdy10GreaterThan(String value) {
            addCriterion("ZDY10 >", value, "zdy10");
            return (Criteria) this;
        }

        public Criteria andZdy10GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY10 >=", value, "zdy10");
            return (Criteria) this;
        }

        public Criteria andZdy10LessThan(String value) {
            addCriterion("ZDY10 <", value, "zdy10");
            return (Criteria) this;
        }

        public Criteria andZdy10LessThanOrEqualTo(String value) {
            addCriterion("ZDY10 <=", value, "zdy10");
            return (Criteria) this;
        }

        public Criteria andZdy10Like(String value) {
            addCriterion("ZDY10 like", value, "zdy10");
            return (Criteria) this;
        }

        public Criteria andZdy10NotLike(String value) {
            addCriterion("ZDY10 not like", value, "zdy10");
            return (Criteria) this;
        }

        public Criteria andZdy10In(List<String> values) {
            addCriterion("ZDY10 in", values, "zdy10");
            return (Criteria) this;
        }

        public Criteria andZdy10NotIn(List<String> values) {
            addCriterion("ZDY10 not in", values, "zdy10");
            return (Criteria) this;
        }

        public Criteria andZdy10Between(String value1, String value2) {
            addCriterion("ZDY10 between", value1, value2, "zdy10");
            return (Criteria) this;
        }

        public Criteria andZdy10NotBetween(String value1, String value2) {
            addCriterion("ZDY10 not between", value1, value2, "zdy10");
            return (Criteria) this;
        }

        public Criteria andZdy11IsNull() {
            addCriterion("ZDY11 is null");
            return (Criteria) this;
        }

        public Criteria andZdy11IsNotNull() {
            addCriterion("ZDY11 is not null");
            return (Criteria) this;
        }

        public Criteria andZdy11EqualTo(String value) {
            addCriterion("ZDY11 =", value, "zdy11");
            return (Criteria) this;
        }

        public Criteria andZdy11NotEqualTo(String value) {
            addCriterion("ZDY11 <>", value, "zdy11");
            return (Criteria) this;
        }

        public Criteria andZdy11GreaterThan(String value) {
            addCriterion("ZDY11 >", value, "zdy11");
            return (Criteria) this;
        }

        public Criteria andZdy11GreaterThanOrEqualTo(String value) {
            addCriterion("ZDY11 >=", value, "zdy11");
            return (Criteria) this;
        }

        public Criteria andZdy11LessThan(String value) {
            addCriterion("ZDY11 <", value, "zdy11");
            return (Criteria) this;
        }

        public Criteria andZdy11LessThanOrEqualTo(String value) {
            addCriterion("ZDY11 <=", value, "zdy11");
            return (Criteria) this;
        }

        public Criteria andZdy11Like(String value) {
            addCriterion("ZDY11 like", value, "zdy11");
            return (Criteria) this;
        }

        public Criteria andZdy11NotLike(String value) {
            addCriterion("ZDY11 not like", value, "zdy11");
            return (Criteria) this;
        }

        public Criteria andZdy11In(List<String> values) {
            addCriterion("ZDY11 in", values, "zdy11");
            return (Criteria) this;
        }

        public Criteria andZdy11NotIn(List<String> values) {
            addCriterion("ZDY11 not in", values, "zdy11");
            return (Criteria) this;
        }

        public Criteria andZdy11Between(String value1, String value2) {
            addCriterion("ZDY11 between", value1, value2, "zdy11");
            return (Criteria) this;
        }

        public Criteria andZdy11NotBetween(String value1, String value2) {
            addCriterion("ZDY11 not between", value1, value2, "zdy11");
            return (Criteria) this;
        }

        public Criteria andLastcallresultIsNull() {
            addCriterion("LastCallResult is null");
            return (Criteria) this;
        }

        public Criteria andLastcallresultIsNotNull() {
            addCriterion("LastCallResult is not null");
            return (Criteria) this;
        }

        public Criteria andLastcallresultEqualTo(String value) {
            addCriterion("LastCallResult =", value, "lastcallresult");
            return (Criteria) this;
        }

        public Criteria andLastcallresultNotEqualTo(String value) {
            addCriterion("LastCallResult <>", value, "lastcallresult");
            return (Criteria) this;
        }

        public Criteria andLastcallresultGreaterThan(String value) {
            addCriterion("LastCallResult >", value, "lastcallresult");
            return (Criteria) this;
        }

        public Criteria andLastcallresultGreaterThanOrEqualTo(String value) {
            addCriterion("LastCallResult >=", value, "lastcallresult");
            return (Criteria) this;
        }

        public Criteria andLastcallresultLessThan(String value) {
            addCriterion("LastCallResult <", value, "lastcallresult");
            return (Criteria) this;
        }

        public Criteria andLastcallresultLessThanOrEqualTo(String value) {
            addCriterion("LastCallResult <=", value, "lastcallresult");
            return (Criteria) this;
        }

        public Criteria andLastcallresultLike(String value) {
            addCriterion("LastCallResult like", value, "lastcallresult");
            return (Criteria) this;
        }

        public Criteria andLastcallresultNotLike(String value) {
            addCriterion("LastCallResult not like", value, "lastcallresult");
            return (Criteria) this;
        }

        public Criteria andLastcallresultIn(List<String> values) {
            addCriterion("LastCallResult in", values, "lastcallresult");
            return (Criteria) this;
        }

        public Criteria andLastcallresultNotIn(List<String> values) {
            addCriterion("LastCallResult not in", values, "lastcallresult");
            return (Criteria) this;
        }

        public Criteria andLastcallresultBetween(String value1, String value2) {
            addCriterion("LastCallResult between", value1, value2, "lastcallresult");
            return (Criteria) this;
        }

        public Criteria andLastcallresultNotBetween(String value1, String value2) {
            addCriterion("LastCallResult not between", value1, value2, "lastcallresult");
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