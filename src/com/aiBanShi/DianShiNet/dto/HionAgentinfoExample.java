package com.aiBanShi.DianShiNet.dto;

import java.util.ArrayList;
import java.util.List;

public class HionAgentinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HionAgentinfoExample() {
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

        public Criteria andStaffidIsNull() {
            addCriterion("StaffID is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("StaffID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(String value) {
            addCriterion("StaffID =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(String value) {
            addCriterion("StaffID <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(String value) {
            addCriterion("StaffID >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(String value) {
            addCriterion("StaffID >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(String value) {
            addCriterion("StaffID <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(String value) {
            addCriterion("StaffID <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLike(String value) {
            addCriterion("StaffID like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotLike(String value) {
            addCriterion("StaffID not like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<String> values) {
            addCriterion("StaffID in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<String> values) {
            addCriterion("StaffID not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(String value1, String value2) {
            addCriterion("StaffID between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(String value1, String value2) {
            addCriterion("StaffID not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNull() {
            addCriterion("StaffName is null");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNotNull() {
            addCriterion("StaffName is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnameEqualTo(String value) {
            addCriterion("StaffName =", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotEqualTo(String value) {
            addCriterion("StaffName <>", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThan(String value) {
            addCriterion("StaffName >", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("StaffName >=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThan(String value) {
            addCriterion("StaffName <", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThanOrEqualTo(String value) {
            addCriterion("StaffName <=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLike(String value) {
            addCriterion("StaffName like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotLike(String value) {
            addCriterion("StaffName not like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameIn(List<String> values) {
            addCriterion("StaffName in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotIn(List<String> values) {
            addCriterion("StaffName not in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameBetween(String value1, String value2) {
            addCriterion("StaffName between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotBetween(String value1, String value2) {
            addCriterion("StaffName not between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffpwdIsNull() {
            addCriterion("StaffPwd is null");
            return (Criteria) this;
        }

        public Criteria andStaffpwdIsNotNull() {
            addCriterion("StaffPwd is not null");
            return (Criteria) this;
        }

        public Criteria andStaffpwdEqualTo(String value) {
            addCriterion("StaffPwd =", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdNotEqualTo(String value) {
            addCriterion("StaffPwd <>", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdGreaterThan(String value) {
            addCriterion("StaffPwd >", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdGreaterThanOrEqualTo(String value) {
            addCriterion("StaffPwd >=", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdLessThan(String value) {
            addCriterion("StaffPwd <", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdLessThanOrEqualTo(String value) {
            addCriterion("StaffPwd <=", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdLike(String value) {
            addCriterion("StaffPwd like", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdNotLike(String value) {
            addCriterion("StaffPwd not like", value, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdIn(List<String> values) {
            addCriterion("StaffPwd in", values, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdNotIn(List<String> values) {
            addCriterion("StaffPwd not in", values, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdBetween(String value1, String value2) {
            addCriterion("StaffPwd between", value1, value2, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andStaffpwdNotBetween(String value1, String value2) {
            addCriterion("StaffPwd not between", value1, value2, "staffpwd");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DepartMent is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DepartMent is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DepartMent =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DepartMent <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DepartMent >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DepartMent >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DepartMent <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DepartMent <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DepartMent like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DepartMent not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DepartMent in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DepartMent not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DepartMent between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DepartMent not between", value1, value2, "department");
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

        public Criteria andGradeIsNull() {
            addCriterion("Grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("Grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("Grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("Grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("Grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andIfloginIsNull() {
            addCriterion("ifLogin is null");
            return (Criteria) this;
        }

        public Criteria andIfloginIsNotNull() {
            addCriterion("ifLogin is not null");
            return (Criteria) this;
        }

        public Criteria andIfloginEqualTo(Integer value) {
            addCriterion("ifLogin =", value, "iflogin");
            return (Criteria) this;
        }

        public Criteria andIfloginNotEqualTo(Integer value) {
            addCriterion("ifLogin <>", value, "iflogin");
            return (Criteria) this;
        }

        public Criteria andIfloginGreaterThan(Integer value) {
            addCriterion("ifLogin >", value, "iflogin");
            return (Criteria) this;
        }

        public Criteria andIfloginGreaterThanOrEqualTo(Integer value) {
            addCriterion("ifLogin >=", value, "iflogin");
            return (Criteria) this;
        }

        public Criteria andIfloginLessThan(Integer value) {
            addCriterion("ifLogin <", value, "iflogin");
            return (Criteria) this;
        }

        public Criteria andIfloginLessThanOrEqualTo(Integer value) {
            addCriterion("ifLogin <=", value, "iflogin");
            return (Criteria) this;
        }

        public Criteria andIfloginIn(List<Integer> values) {
            addCriterion("ifLogin in", values, "iflogin");
            return (Criteria) this;
        }

        public Criteria andIfloginNotIn(List<Integer> values) {
            addCriterion("ifLogin not in", values, "iflogin");
            return (Criteria) this;
        }

        public Criteria andIfloginBetween(Integer value1, Integer value2) {
            addCriterion("ifLogin between", value1, value2, "iflogin");
            return (Criteria) this;
        }

        public Criteria andIfloginNotBetween(Integer value1, Integer value2) {
            addCriterion("ifLogin not between", value1, value2, "iflogin");
            return (Criteria) this;
        }

        public Criteria andLoginstationIsNull() {
            addCriterion("LoginStation is null");
            return (Criteria) this;
        }

        public Criteria andLoginstationIsNotNull() {
            addCriterion("LoginStation is not null");
            return (Criteria) this;
        }

        public Criteria andLoginstationEqualTo(String value) {
            addCriterion("LoginStation =", value, "loginstation");
            return (Criteria) this;
        }

        public Criteria andLoginstationNotEqualTo(String value) {
            addCriterion("LoginStation <>", value, "loginstation");
            return (Criteria) this;
        }

        public Criteria andLoginstationGreaterThan(String value) {
            addCriterion("LoginStation >", value, "loginstation");
            return (Criteria) this;
        }

        public Criteria andLoginstationGreaterThanOrEqualTo(String value) {
            addCriterion("LoginStation >=", value, "loginstation");
            return (Criteria) this;
        }

        public Criteria andLoginstationLessThan(String value) {
            addCriterion("LoginStation <", value, "loginstation");
            return (Criteria) this;
        }

        public Criteria andLoginstationLessThanOrEqualTo(String value) {
            addCriterion("LoginStation <=", value, "loginstation");
            return (Criteria) this;
        }

        public Criteria andLoginstationLike(String value) {
            addCriterion("LoginStation like", value, "loginstation");
            return (Criteria) this;
        }

        public Criteria andLoginstationNotLike(String value) {
            addCriterion("LoginStation not like", value, "loginstation");
            return (Criteria) this;
        }

        public Criteria andLoginstationIn(List<String> values) {
            addCriterion("LoginStation in", values, "loginstation");
            return (Criteria) this;
        }

        public Criteria andLoginstationNotIn(List<String> values) {
            addCriterion("LoginStation not in", values, "loginstation");
            return (Criteria) this;
        }

        public Criteria andLoginstationBetween(String value1, String value2) {
            addCriterion("LoginStation between", value1, value2, "loginstation");
            return (Criteria) this;
        }

        public Criteria andLoginstationNotBetween(String value1, String value2) {
            addCriterion("LoginStation not between", value1, value2, "loginstation");
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

        public Criteria andLogmodeIsNull() {
            addCriterion("LogMode is null");
            return (Criteria) this;
        }

        public Criteria andLogmodeIsNotNull() {
            addCriterion("LogMode is not null");
            return (Criteria) this;
        }

        public Criteria andLogmodeEqualTo(String value) {
            addCriterion("LogMode =", value, "logmode");
            return (Criteria) this;
        }

        public Criteria andLogmodeNotEqualTo(String value) {
            addCriterion("LogMode <>", value, "logmode");
            return (Criteria) this;
        }

        public Criteria andLogmodeGreaterThan(String value) {
            addCriterion("LogMode >", value, "logmode");
            return (Criteria) this;
        }

        public Criteria andLogmodeGreaterThanOrEqualTo(String value) {
            addCriterion("LogMode >=", value, "logmode");
            return (Criteria) this;
        }

        public Criteria andLogmodeLessThan(String value) {
            addCriterion("LogMode <", value, "logmode");
            return (Criteria) this;
        }

        public Criteria andLogmodeLessThanOrEqualTo(String value) {
            addCriterion("LogMode <=", value, "logmode");
            return (Criteria) this;
        }

        public Criteria andLogmodeLike(String value) {
            addCriterion("LogMode like", value, "logmode");
            return (Criteria) this;
        }

        public Criteria andLogmodeNotLike(String value) {
            addCriterion("LogMode not like", value, "logmode");
            return (Criteria) this;
        }

        public Criteria andLogmodeIn(List<String> values) {
            addCriterion("LogMode in", values, "logmode");
            return (Criteria) this;
        }

        public Criteria andLogmodeNotIn(List<String> values) {
            addCriterion("LogMode not in", values, "logmode");
            return (Criteria) this;
        }

        public Criteria andLogmodeBetween(String value1, String value2) {
            addCriterion("LogMode between", value1, value2, "logmode");
            return (Criteria) this;
        }

        public Criteria andLogmodeNotBetween(String value1, String value2) {
            addCriterion("LogMode not between", value1, value2, "logmode");
            return (Criteria) this;
        }

        public Criteria andZwpjIsNull() {
            addCriterion("ZWPJ is null");
            return (Criteria) this;
        }

        public Criteria andZwpjIsNotNull() {
            addCriterion("ZWPJ is not null");
            return (Criteria) this;
        }

        public Criteria andZwpjEqualTo(String value) {
            addCriterion("ZWPJ =", value, "zwpj");
            return (Criteria) this;
        }

        public Criteria andZwpjNotEqualTo(String value) {
            addCriterion("ZWPJ <>", value, "zwpj");
            return (Criteria) this;
        }

        public Criteria andZwpjGreaterThan(String value) {
            addCriterion("ZWPJ >", value, "zwpj");
            return (Criteria) this;
        }

        public Criteria andZwpjGreaterThanOrEqualTo(String value) {
            addCriterion("ZWPJ >=", value, "zwpj");
            return (Criteria) this;
        }

        public Criteria andZwpjLessThan(String value) {
            addCriterion("ZWPJ <", value, "zwpj");
            return (Criteria) this;
        }

        public Criteria andZwpjLessThanOrEqualTo(String value) {
            addCriterion("ZWPJ <=", value, "zwpj");
            return (Criteria) this;
        }

        public Criteria andZwpjLike(String value) {
            addCriterion("ZWPJ like", value, "zwpj");
            return (Criteria) this;
        }

        public Criteria andZwpjNotLike(String value) {
            addCriterion("ZWPJ not like", value, "zwpj");
            return (Criteria) this;
        }

        public Criteria andZwpjIn(List<String> values) {
            addCriterion("ZWPJ in", values, "zwpj");
            return (Criteria) this;
        }

        public Criteria andZwpjNotIn(List<String> values) {
            addCriterion("ZWPJ not in", values, "zwpj");
            return (Criteria) this;
        }

        public Criteria andZwpjBetween(String value1, String value2) {
            addCriterion("ZWPJ between", value1, value2, "zwpj");
            return (Criteria) this;
        }

        public Criteria andZwpjNotBetween(String value1, String value2) {
            addCriterion("ZWPJ not between", value1, value2, "zwpj");
            return (Criteria) this;
        }

        public Criteria andGzjyIsNull() {
            addCriterion("GZJY is null");
            return (Criteria) this;
        }

        public Criteria andGzjyIsNotNull() {
            addCriterion("GZJY is not null");
            return (Criteria) this;
        }

        public Criteria andGzjyEqualTo(String value) {
            addCriterion("GZJY =", value, "gzjy");
            return (Criteria) this;
        }

        public Criteria andGzjyNotEqualTo(String value) {
            addCriterion("GZJY <>", value, "gzjy");
            return (Criteria) this;
        }

        public Criteria andGzjyGreaterThan(String value) {
            addCriterion("GZJY >", value, "gzjy");
            return (Criteria) this;
        }

        public Criteria andGzjyGreaterThanOrEqualTo(String value) {
            addCriterion("GZJY >=", value, "gzjy");
            return (Criteria) this;
        }

        public Criteria andGzjyLessThan(String value) {
            addCriterion("GZJY <", value, "gzjy");
            return (Criteria) this;
        }

        public Criteria andGzjyLessThanOrEqualTo(String value) {
            addCriterion("GZJY <=", value, "gzjy");
            return (Criteria) this;
        }

        public Criteria andGzjyLike(String value) {
            addCriterion("GZJY like", value, "gzjy");
            return (Criteria) this;
        }

        public Criteria andGzjyNotLike(String value) {
            addCriterion("GZJY not like", value, "gzjy");
            return (Criteria) this;
        }

        public Criteria andGzjyIn(List<String> values) {
            addCriterion("GZJY in", values, "gzjy");
            return (Criteria) this;
        }

        public Criteria andGzjyNotIn(List<String> values) {
            addCriterion("GZJY not in", values, "gzjy");
            return (Criteria) this;
        }

        public Criteria andGzjyBetween(String value1, String value2) {
            addCriterion("GZJY between", value1, value2, "gzjy");
            return (Criteria) this;
        }

        public Criteria andGzjyNotBetween(String value1, String value2) {
            addCriterion("GZJY not between", value1, value2, "gzjy");
            return (Criteria) this;
        }

        public Criteria andJyjlIsNull() {
            addCriterion("JYJL is null");
            return (Criteria) this;
        }

        public Criteria andJyjlIsNotNull() {
            addCriterion("JYJL is not null");
            return (Criteria) this;
        }

        public Criteria andJyjlEqualTo(String value) {
            addCriterion("JYJL =", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlNotEqualTo(String value) {
            addCriterion("JYJL <>", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlGreaterThan(String value) {
            addCriterion("JYJL >", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlGreaterThanOrEqualTo(String value) {
            addCriterion("JYJL >=", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlLessThan(String value) {
            addCriterion("JYJL <", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlLessThanOrEqualTo(String value) {
            addCriterion("JYJL <=", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlLike(String value) {
            addCriterion("JYJL like", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlNotLike(String value) {
            addCriterion("JYJL not like", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlIn(List<String> values) {
            addCriterion("JYJL in", values, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlNotIn(List<String> values) {
            addCriterion("JYJL not in", values, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlBetween(String value1, String value2) {
            addCriterion("JYJL between", value1, value2, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlNotBetween(String value1, String value2) {
            addCriterion("JYJL not between", value1, value2, "jyjl");
            return (Criteria) this;
        }

        public Criteria andIscheckedIsNull() {
            addCriterion("ISChecked is null");
            return (Criteria) this;
        }

        public Criteria andIscheckedIsNotNull() {
            addCriterion("ISChecked is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckedEqualTo(Boolean value) {
            addCriterion("ISChecked =", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotEqualTo(Boolean value) {
            addCriterion("ISChecked <>", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedGreaterThan(Boolean value) {
            addCriterion("ISChecked >", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ISChecked >=", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLessThan(Boolean value) {
            addCriterion("ISChecked <", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLessThanOrEqualTo(Boolean value) {
            addCriterion("ISChecked <=", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedIn(List<Boolean> values) {
            addCriterion("ISChecked in", values, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotIn(List<Boolean> values) {
            addCriterion("ISChecked not in", values, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedBetween(Boolean value1, Boolean value2) {
            addCriterion("ISChecked between", value1, value2, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ISChecked not between", value1, value2, "ischecked");
            return (Criteria) this;
        }

        public Criteria andYgztIsNull() {
            addCriterion("YGZT is null");
            return (Criteria) this;
        }

        public Criteria andYgztIsNotNull() {
            addCriterion("YGZT is not null");
            return (Criteria) this;
        }

        public Criteria andYgztEqualTo(String value) {
            addCriterion("YGZT =", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztNotEqualTo(String value) {
            addCriterion("YGZT <>", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztGreaterThan(String value) {
            addCriterion("YGZT >", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztGreaterThanOrEqualTo(String value) {
            addCriterion("YGZT >=", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztLessThan(String value) {
            addCriterion("YGZT <", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztLessThanOrEqualTo(String value) {
            addCriterion("YGZT <=", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztLike(String value) {
            addCriterion("YGZT like", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztNotLike(String value) {
            addCriterion("YGZT not like", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztIn(List<String> values) {
            addCriterion("YGZT in", values, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztNotIn(List<String> values) {
            addCriterion("YGZT not in", values, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztBetween(String value1, String value2) {
            addCriterion("YGZT between", value1, value2, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztNotBetween(String value1, String value2) {
            addCriterion("YGZT not between", value1, value2, "ygzt");
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