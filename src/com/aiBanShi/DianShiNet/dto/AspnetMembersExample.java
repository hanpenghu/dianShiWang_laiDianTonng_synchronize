package com.aiBanShi.DianShiNet.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AspnetMembersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AspnetMembersExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andReferraluseridIsNull() {
            addCriterion("ReferralUserId is null");
            return (Criteria) this;
        }

        public Criteria andReferraluseridIsNotNull() {
            addCriterion("ReferralUserId is not null");
            return (Criteria) this;
        }

        public Criteria andReferraluseridEqualTo(Integer value) {
            addCriterion("ReferralUserId =", value, "referraluserid");
            return (Criteria) this;
        }

        public Criteria andReferraluseridNotEqualTo(Integer value) {
            addCriterion("ReferralUserId <>", value, "referraluserid");
            return (Criteria) this;
        }

        public Criteria andReferraluseridGreaterThan(Integer value) {
            addCriterion("ReferralUserId >", value, "referraluserid");
            return (Criteria) this;
        }

        public Criteria andReferraluseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReferralUserId >=", value, "referraluserid");
            return (Criteria) this;
        }

        public Criteria andReferraluseridLessThan(Integer value) {
            addCriterion("ReferralUserId <", value, "referraluserid");
            return (Criteria) this;
        }

        public Criteria andReferraluseridLessThanOrEqualTo(Integer value) {
            addCriterion("ReferralUserId <=", value, "referraluserid");
            return (Criteria) this;
        }

        public Criteria andReferraluseridIn(List<Integer> values) {
            addCriterion("ReferralUserId in", values, "referraluserid");
            return (Criteria) this;
        }

        public Criteria andReferraluseridNotIn(List<Integer> values) {
            addCriterion("ReferralUserId not in", values, "referraluserid");
            return (Criteria) this;
        }

        public Criteria andReferraluseridBetween(Integer value1, Integer value2) {
            addCriterion("ReferralUserId between", value1, value2, "referraluserid");
            return (Criteria) this;
        }

        public Criteria andReferraluseridNotBetween(Integer value1, Integer value2) {
            addCriterion("ReferralUserId not between", value1, value2, "referraluserid");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNull() {
            addCriterion("GradeId is null");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNotNull() {
            addCriterion("GradeId is not null");
            return (Criteria) this;
        }

        public Criteria andGradeidEqualTo(Integer value) {
            addCriterion("GradeId =", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotEqualTo(Integer value) {
            addCriterion("GradeId <>", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThan(Integer value) {
            addCriterion("GradeId >", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GradeId >=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThan(Integer value) {
            addCriterion("GradeId <", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThanOrEqualTo(Integer value) {
            addCriterion("GradeId <=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidIn(List<Integer> values) {
            addCriterion("GradeId in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotIn(List<Integer> values) {
            addCriterion("GradeId not in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidBetween(Integer value1, Integer value2) {
            addCriterion("GradeId between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("GradeId not between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltIsNull() {
            addCriterion("PasswordSalt is null");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltIsNotNull() {
            addCriterion("PasswordSalt is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltEqualTo(String value) {
            addCriterion("PasswordSalt =", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltNotEqualTo(String value) {
            addCriterion("PasswordSalt <>", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltGreaterThan(String value) {
            addCriterion("PasswordSalt >", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltGreaterThanOrEqualTo(String value) {
            addCriterion("PasswordSalt >=", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltLessThan(String value) {
            addCriterion("PasswordSalt <", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltLessThanOrEqualTo(String value) {
            addCriterion("PasswordSalt <=", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltLike(String value) {
            addCriterion("PasswordSalt like", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltNotLike(String value) {
            addCriterion("PasswordSalt not like", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltIn(List<String> values) {
            addCriterion("PasswordSalt in", values, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltNotIn(List<String> values) {
            addCriterion("PasswordSalt not in", values, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltBetween(String value1, String value2) {
            addCriterion("PasswordSalt between", value1, value2, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltNotBetween(String value1, String value2) {
            addCriterion("PasswordSalt not between", value1, value2, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionIsNull() {
            addCriterion("PasswordQuestion is null");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionIsNotNull() {
            addCriterion("PasswordQuestion is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionEqualTo(String value) {
            addCriterion("PasswordQuestion =", value, "passwordquestion");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionNotEqualTo(String value) {
            addCriterion("PasswordQuestion <>", value, "passwordquestion");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionGreaterThan(String value) {
            addCriterion("PasswordQuestion >", value, "passwordquestion");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionGreaterThanOrEqualTo(String value) {
            addCriterion("PasswordQuestion >=", value, "passwordquestion");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionLessThan(String value) {
            addCriterion("PasswordQuestion <", value, "passwordquestion");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionLessThanOrEqualTo(String value) {
            addCriterion("PasswordQuestion <=", value, "passwordquestion");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionLike(String value) {
            addCriterion("PasswordQuestion like", value, "passwordquestion");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionNotLike(String value) {
            addCriterion("PasswordQuestion not like", value, "passwordquestion");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionIn(List<String> values) {
            addCriterion("PasswordQuestion in", values, "passwordquestion");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionNotIn(List<String> values) {
            addCriterion("PasswordQuestion not in", values, "passwordquestion");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionBetween(String value1, String value2) {
            addCriterion("PasswordQuestion between", value1, value2, "passwordquestion");
            return (Criteria) this;
        }

        public Criteria andPasswordquestionNotBetween(String value1, String value2) {
            addCriterion("PasswordQuestion not between", value1, value2, "passwordquestion");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerIsNull() {
            addCriterion("PasswordAnswer is null");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerIsNotNull() {
            addCriterion("PasswordAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerEqualTo(String value) {
            addCriterion("PasswordAnswer =", value, "passwordanswer");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerNotEqualTo(String value) {
            addCriterion("PasswordAnswer <>", value, "passwordanswer");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerGreaterThan(String value) {
            addCriterion("PasswordAnswer >", value, "passwordanswer");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerGreaterThanOrEqualTo(String value) {
            addCriterion("PasswordAnswer >=", value, "passwordanswer");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerLessThan(String value) {
            addCriterion("PasswordAnswer <", value, "passwordanswer");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerLessThanOrEqualTo(String value) {
            addCriterion("PasswordAnswer <=", value, "passwordanswer");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerLike(String value) {
            addCriterion("PasswordAnswer like", value, "passwordanswer");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerNotLike(String value) {
            addCriterion("PasswordAnswer not like", value, "passwordanswer");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerIn(List<String> values) {
            addCriterion("PasswordAnswer in", values, "passwordanswer");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerNotIn(List<String> values) {
            addCriterion("PasswordAnswer not in", values, "passwordanswer");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerBetween(String value1, String value2) {
            addCriterion("PasswordAnswer between", value1, value2, "passwordanswer");
            return (Criteria) this;
        }

        public Criteria andPasswordanswerNotBetween(String value1, String value2) {
            addCriterion("PasswordAnswer not between", value1, value2, "passwordanswer");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
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

        public Criteria andRealnameIsNull() {
            addCriterion("RealName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("RealName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("RealName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("RealName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("RealName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("RealName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("RealName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("RealName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("RealName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("RealName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("RealName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("RealName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("RealName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("RealName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andIdentitycardIsNull() {
            addCriterion("IdentityCard is null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardIsNotNull() {
            addCriterion("IdentityCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardEqualTo(String value) {
            addCriterion("IdentityCard =", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotEqualTo(String value) {
            addCriterion("IdentityCard <>", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardGreaterThan(String value) {
            addCriterion("IdentityCard >", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardGreaterThanOrEqualTo(String value) {
            addCriterion("IdentityCard >=", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardLessThan(String value) {
            addCriterion("IdentityCard <", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardLessThanOrEqualTo(String value) {
            addCriterion("IdentityCard <=", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardLike(String value) {
            addCriterion("IdentityCard like", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotLike(String value) {
            addCriterion("IdentityCard not like", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardIn(List<String> values) {
            addCriterion("IdentityCard in", values, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotIn(List<String> values) {
            addCriterion("IdentityCard not in", values, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardBetween(String value1, String value2) {
            addCriterion("IdentityCard between", value1, value2, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotBetween(String value1, String value2) {
            addCriterion("IdentityCard not between", value1, value2, "identitycard");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("Picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("Picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("Picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("Picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("Picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("Picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("Picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("Picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("Picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("Picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("Picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("Picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("Picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("Picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("Gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("BirthDate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("BirthDate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(Date value) {
            addCriterion("BirthDate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(Date value) {
            addCriterion("BirthDate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(Date value) {
            addCriterion("BirthDate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterion("BirthDate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(Date value) {
            addCriterion("BirthDate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(Date value) {
            addCriterion("BirthDate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<Date> values) {
            addCriterion("BirthDate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<Date> values) {
            addCriterion("BirthDate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(Date value1, Date value2) {
            addCriterion("BirthDate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(Date value1, Date value2) {
            addCriterion("BirthDate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andIsopenbalanceIsNull() {
            addCriterion("IsOpenBalance is null");
            return (Criteria) this;
        }

        public Criteria andIsopenbalanceIsNotNull() {
            addCriterion("IsOpenBalance is not null");
            return (Criteria) this;
        }

        public Criteria andIsopenbalanceEqualTo(Boolean value) {
            addCriterion("IsOpenBalance =", value, "isopenbalance");
            return (Criteria) this;
        }

        public Criteria andIsopenbalanceNotEqualTo(Boolean value) {
            addCriterion("IsOpenBalance <>", value, "isopenbalance");
            return (Criteria) this;
        }

        public Criteria andIsopenbalanceGreaterThan(Boolean value) {
            addCriterion("IsOpenBalance >", value, "isopenbalance");
            return (Criteria) this;
        }

        public Criteria andIsopenbalanceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsOpenBalance >=", value, "isopenbalance");
            return (Criteria) this;
        }

        public Criteria andIsopenbalanceLessThan(Boolean value) {
            addCriterion("IsOpenBalance <", value, "isopenbalance");
            return (Criteria) this;
        }

        public Criteria andIsopenbalanceLessThanOrEqualTo(Boolean value) {
            addCriterion("IsOpenBalance <=", value, "isopenbalance");
            return (Criteria) this;
        }

        public Criteria andIsopenbalanceIn(List<Boolean> values) {
            addCriterion("IsOpenBalance in", values, "isopenbalance");
            return (Criteria) this;
        }

        public Criteria andIsopenbalanceNotIn(List<Boolean> values) {
            addCriterion("IsOpenBalance not in", values, "isopenbalance");
            return (Criteria) this;
        }

        public Criteria andIsopenbalanceBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOpenBalance between", value1, value2, "isopenbalance");
            return (Criteria) this;
        }

        public Criteria andIsopenbalanceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOpenBalance not between", value1, value2, "isopenbalance");
            return (Criteria) this;
        }

        public Criteria andTradepasswordIsNull() {
            addCriterion("TradePassword is null");
            return (Criteria) this;
        }

        public Criteria andTradepasswordIsNotNull() {
            addCriterion("TradePassword is not null");
            return (Criteria) this;
        }

        public Criteria andTradepasswordEqualTo(String value) {
            addCriterion("TradePassword =", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordNotEqualTo(String value) {
            addCriterion("TradePassword <>", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordGreaterThan(String value) {
            addCriterion("TradePassword >", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordGreaterThanOrEqualTo(String value) {
            addCriterion("TradePassword >=", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordLessThan(String value) {
            addCriterion("TradePassword <", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordLessThanOrEqualTo(String value) {
            addCriterion("TradePassword <=", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordLike(String value) {
            addCriterion("TradePassword like", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordNotLike(String value) {
            addCriterion("TradePassword not like", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordIn(List<String> values) {
            addCriterion("TradePassword in", values, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordNotIn(List<String> values) {
            addCriterion("TradePassword not in", values, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordBetween(String value1, String value2) {
            addCriterion("TradePassword between", value1, value2, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordNotBetween(String value1, String value2) {
            addCriterion("TradePassword not between", value1, value2, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltIsNull() {
            addCriterion("TradePasswordSalt is null");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltIsNotNull() {
            addCriterion("TradePasswordSalt is not null");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltEqualTo(String value) {
            addCriterion("TradePasswordSalt =", value, "tradepasswordsalt");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltNotEqualTo(String value) {
            addCriterion("TradePasswordSalt <>", value, "tradepasswordsalt");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltGreaterThan(String value) {
            addCriterion("TradePasswordSalt >", value, "tradepasswordsalt");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltGreaterThanOrEqualTo(String value) {
            addCriterion("TradePasswordSalt >=", value, "tradepasswordsalt");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltLessThan(String value) {
            addCriterion("TradePasswordSalt <", value, "tradepasswordsalt");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltLessThanOrEqualTo(String value) {
            addCriterion("TradePasswordSalt <=", value, "tradepasswordsalt");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltLike(String value) {
            addCriterion("TradePasswordSalt like", value, "tradepasswordsalt");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltNotLike(String value) {
            addCriterion("TradePasswordSalt not like", value, "tradepasswordsalt");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltIn(List<String> values) {
            addCriterion("TradePasswordSalt in", values, "tradepasswordsalt");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltNotIn(List<String> values) {
            addCriterion("TradePasswordSalt not in", values, "tradepasswordsalt");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltBetween(String value1, String value2) {
            addCriterion("TradePasswordSalt between", value1, value2, "tradepasswordsalt");
            return (Criteria) this;
        }

        public Criteria andTradepasswordsaltNotBetween(String value1, String value2) {
            addCriterion("TradePasswordSalt not between", value1, value2, "tradepasswordsalt");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNull() {
            addCriterion("OrderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNotNull() {
            addCriterion("OrderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberEqualTo(Integer value) {
            addCriterion("OrderNumber =", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotEqualTo(Integer value) {
            addCriterion("OrderNumber <>", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThan(Integer value) {
            addCriterion("OrderNumber >", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderNumber >=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThan(Integer value) {
            addCriterion("OrderNumber <", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThanOrEqualTo(Integer value) {
            addCriterion("OrderNumber <=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIn(List<Integer> values) {
            addCriterion("OrderNumber in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotIn(List<Integer> values) {
            addCriterion("OrderNumber not in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberBetween(Integer value1, Integer value2) {
            addCriterion("OrderNumber between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderNumber not between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andExpenditureIsNull() {
            addCriterion("Expenditure is null");
            return (Criteria) this;
        }

        public Criteria andExpenditureIsNotNull() {
            addCriterion("Expenditure is not null");
            return (Criteria) this;
        }

        public Criteria andExpenditureEqualTo(BigDecimal value) {
            addCriterion("Expenditure =", value, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureNotEqualTo(BigDecimal value) {
            addCriterion("Expenditure <>", value, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureGreaterThan(BigDecimal value) {
            addCriterion("Expenditure >", value, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Expenditure >=", value, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureLessThan(BigDecimal value) {
            addCriterion("Expenditure <", value, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Expenditure <=", value, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureIn(List<BigDecimal> values) {
            addCriterion("Expenditure in", values, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureNotIn(List<BigDecimal> values) {
            addCriterion("Expenditure not in", values, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Expenditure between", value1, value2, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Expenditure not between", value1, value2, "expenditure");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("Points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("Points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("Points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("Points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("Points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("Points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("Points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("Points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("Points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("Points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("Points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("Points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("Balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("Balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("Balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("Balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("Balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("Balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("Balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("Balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andRequestbalanceIsNull() {
            addCriterion("RequestBalance is null");
            return (Criteria) this;
        }

        public Criteria andRequestbalanceIsNotNull() {
            addCriterion("RequestBalance is not null");
            return (Criteria) this;
        }

        public Criteria andRequestbalanceEqualTo(BigDecimal value) {
            addCriterion("RequestBalance =", value, "requestbalance");
            return (Criteria) this;
        }

        public Criteria andRequestbalanceNotEqualTo(BigDecimal value) {
            addCriterion("RequestBalance <>", value, "requestbalance");
            return (Criteria) this;
        }

        public Criteria andRequestbalanceGreaterThan(BigDecimal value) {
            addCriterion("RequestBalance >", value, "requestbalance");
            return (Criteria) this;
        }

        public Criteria andRequestbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RequestBalance >=", value, "requestbalance");
            return (Criteria) this;
        }

        public Criteria andRequestbalanceLessThan(BigDecimal value) {
            addCriterion("RequestBalance <", value, "requestbalance");
            return (Criteria) this;
        }

        public Criteria andRequestbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RequestBalance <=", value, "requestbalance");
            return (Criteria) this;
        }

        public Criteria andRequestbalanceIn(List<BigDecimal> values) {
            addCriterion("RequestBalance in", values, "requestbalance");
            return (Criteria) this;
        }

        public Criteria andRequestbalanceNotIn(List<BigDecimal> values) {
            addCriterion("RequestBalance not in", values, "requestbalance");
            return (Criteria) this;
        }

        public Criteria andRequestbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RequestBalance between", value1, value2, "requestbalance");
            return (Criteria) this;
        }

        public Criteria andRequestbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RequestBalance not between", value1, value2, "requestbalance");
            return (Criteria) this;
        }

        public Criteria andTopregionidIsNull() {
            addCriterion("TopRegionId is null");
            return (Criteria) this;
        }

        public Criteria andTopregionidIsNotNull() {
            addCriterion("TopRegionId is not null");
            return (Criteria) this;
        }

        public Criteria andTopregionidEqualTo(Integer value) {
            addCriterion("TopRegionId =", value, "topregionid");
            return (Criteria) this;
        }

        public Criteria andTopregionidNotEqualTo(Integer value) {
            addCriterion("TopRegionId <>", value, "topregionid");
            return (Criteria) this;
        }

        public Criteria andTopregionidGreaterThan(Integer value) {
            addCriterion("TopRegionId >", value, "topregionid");
            return (Criteria) this;
        }

        public Criteria andTopregionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TopRegionId >=", value, "topregionid");
            return (Criteria) this;
        }

        public Criteria andTopregionidLessThan(Integer value) {
            addCriterion("TopRegionId <", value, "topregionid");
            return (Criteria) this;
        }

        public Criteria andTopregionidLessThanOrEqualTo(Integer value) {
            addCriterion("TopRegionId <=", value, "topregionid");
            return (Criteria) this;
        }

        public Criteria andTopregionidIn(List<Integer> values) {
            addCriterion("TopRegionId in", values, "topregionid");
            return (Criteria) this;
        }

        public Criteria andTopregionidNotIn(List<Integer> values) {
            addCriterion("TopRegionId not in", values, "topregionid");
            return (Criteria) this;
        }

        public Criteria andTopregionidBetween(Integer value1, Integer value2) {
            addCriterion("TopRegionId between", value1, value2, "topregionid");
            return (Criteria) this;
        }

        public Criteria andTopregionidNotBetween(Integer value1, Integer value2) {
            addCriterion("TopRegionId not between", value1, value2, "topregionid");
            return (Criteria) this;
        }

        public Criteria andRegionidIsNull() {
            addCriterion("RegionId is null");
            return (Criteria) this;
        }

        public Criteria andRegionidIsNotNull() {
            addCriterion("RegionId is not null");
            return (Criteria) this;
        }

        public Criteria andRegionidEqualTo(Integer value) {
            addCriterion("RegionId =", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotEqualTo(Integer value) {
            addCriterion("RegionId <>", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThan(Integer value) {
            addCriterion("RegionId >", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RegionId >=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThan(Integer value) {
            addCriterion("RegionId <", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThanOrEqualTo(Integer value) {
            addCriterion("RegionId <=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidIn(List<Integer> values) {
            addCriterion("RegionId in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotIn(List<Integer> values) {
            addCriterion("RegionId not in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidBetween(Integer value1, Integer value2) {
            addCriterion("RegionId between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotBetween(Integer value1, Integer value2) {
            addCriterion("RegionId not between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNull() {
            addCriterion("CellPhone is null");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNotNull() {
            addCriterion("CellPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCellphoneEqualTo(String value) {
            addCriterion("CellPhone =", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotEqualTo(String value) {
            addCriterion("CellPhone <>", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThan(String value) {
            addCriterion("CellPhone >", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CellPhone >=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThan(String value) {
            addCriterion("CellPhone <", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThanOrEqualTo(String value) {
            addCriterion("CellPhone <=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLike(String value) {
            addCriterion("CellPhone like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotLike(String value) {
            addCriterion("CellPhone not like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneIn(List<String> values) {
            addCriterion("CellPhone in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotIn(List<String> values) {
            addCriterion("CellPhone not in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneBetween(String value1, String value2) {
            addCriterion("CellPhone between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotBetween(String value1, String value2) {
            addCriterion("CellPhone not between", value1, value2, "cellphone");
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

        public Criteria andWangwangIsNull() {
            addCriterion("Wangwang is null");
            return (Criteria) this;
        }

        public Criteria andWangwangIsNotNull() {
            addCriterion("Wangwang is not null");
            return (Criteria) this;
        }

        public Criteria andWangwangEqualTo(String value) {
            addCriterion("Wangwang =", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangNotEqualTo(String value) {
            addCriterion("Wangwang <>", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangGreaterThan(String value) {
            addCriterion("Wangwang >", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangGreaterThanOrEqualTo(String value) {
            addCriterion("Wangwang >=", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangLessThan(String value) {
            addCriterion("Wangwang <", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangLessThanOrEqualTo(String value) {
            addCriterion("Wangwang <=", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangLike(String value) {
            addCriterion("Wangwang like", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangNotLike(String value) {
            addCriterion("Wangwang not like", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangIn(List<String> values) {
            addCriterion("Wangwang in", values, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangNotIn(List<String> values) {
            addCriterion("Wangwang not in", values, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangBetween(String value1, String value2) {
            addCriterion("Wangwang between", value1, value2, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangNotBetween(String value1, String value2) {
            addCriterion("Wangwang not between", value1, value2, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("WeChat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("WeChat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("WeChat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("WeChat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("WeChat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("WeChat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("WeChat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("WeChat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("WeChat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("WeChat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("WeChat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("WeChat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("WeChat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("WeChat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andSessionidIsNull() {
            addCriterion("SessionId is null");
            return (Criteria) this;
        }

        public Criteria andSessionidIsNotNull() {
            addCriterion("SessionId is not null");
            return (Criteria) this;
        }

        public Criteria andSessionidEqualTo(String value) {
            addCriterion("SessionId =", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotEqualTo(String value) {
            addCriterion("SessionId <>", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThan(String value) {
            addCriterion("SessionId >", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThanOrEqualTo(String value) {
            addCriterion("SessionId >=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThan(String value) {
            addCriterion("SessionId <", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThanOrEqualTo(String value) {
            addCriterion("SessionId <=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLike(String value) {
            addCriterion("SessionId like", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotLike(String value) {
            addCriterion("SessionId not like", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidIn(List<String> values) {
            addCriterion("SessionId in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotIn(List<String> values) {
            addCriterion("SessionId not in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidBetween(String value1, String value2) {
            addCriterion("SessionId between", value1, value2, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotBetween(String value1, String value2) {
            addCriterion("SessionId not between", value1, value2, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionendtimeIsNull() {
            addCriterion("SessionEndTime is null");
            return (Criteria) this;
        }

        public Criteria andSessionendtimeIsNotNull() {
            addCriterion("SessionEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andSessionendtimeEqualTo(Date value) {
            addCriterion("SessionEndTime =", value, "sessionendtime");
            return (Criteria) this;
        }

        public Criteria andSessionendtimeNotEqualTo(Date value) {
            addCriterion("SessionEndTime <>", value, "sessionendtime");
            return (Criteria) this;
        }

        public Criteria andSessionendtimeGreaterThan(Date value) {
            addCriterion("SessionEndTime >", value, "sessionendtime");
            return (Criteria) this;
        }

        public Criteria andSessionendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SessionEndTime >=", value, "sessionendtime");
            return (Criteria) this;
        }

        public Criteria andSessionendtimeLessThan(Date value) {
            addCriterion("SessionEndTime <", value, "sessionendtime");
            return (Criteria) this;
        }

        public Criteria andSessionendtimeLessThanOrEqualTo(Date value) {
            addCriterion("SessionEndTime <=", value, "sessionendtime");
            return (Criteria) this;
        }

        public Criteria andSessionendtimeIn(List<Date> values) {
            addCriterion("SessionEndTime in", values, "sessionendtime");
            return (Criteria) this;
        }

        public Criteria andSessionendtimeNotIn(List<Date> values) {
            addCriterion("SessionEndTime not in", values, "sessionendtime");
            return (Criteria) this;
        }

        public Criteria andSessionendtimeBetween(Date value1, Date value2) {
            addCriterion("SessionEndTime between", value1, value2, "sessionendtime");
            return (Criteria) this;
        }

        public Criteria andSessionendtimeNotBetween(Date value1, Date value2) {
            addCriterion("SessionEndTime not between", value1, value2, "sessionendtime");
            return (Criteria) this;
        }

        public Criteria andEmailverificationIsNull() {
            addCriterion("EmailVerification is null");
            return (Criteria) this;
        }

        public Criteria andEmailverificationIsNotNull() {
            addCriterion("EmailVerification is not null");
            return (Criteria) this;
        }

        public Criteria andEmailverificationEqualTo(Boolean value) {
            addCriterion("EmailVerification =", value, "emailverification");
            return (Criteria) this;
        }

        public Criteria andEmailverificationNotEqualTo(Boolean value) {
            addCriterion("EmailVerification <>", value, "emailverification");
            return (Criteria) this;
        }

        public Criteria andEmailverificationGreaterThan(Boolean value) {
            addCriterion("EmailVerification >", value, "emailverification");
            return (Criteria) this;
        }

        public Criteria andEmailverificationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("EmailVerification >=", value, "emailverification");
            return (Criteria) this;
        }

        public Criteria andEmailverificationLessThan(Boolean value) {
            addCriterion("EmailVerification <", value, "emailverification");
            return (Criteria) this;
        }

        public Criteria andEmailverificationLessThanOrEqualTo(Boolean value) {
            addCriterion("EmailVerification <=", value, "emailverification");
            return (Criteria) this;
        }

        public Criteria andEmailverificationIn(List<Boolean> values) {
            addCriterion("EmailVerification in", values, "emailverification");
            return (Criteria) this;
        }

        public Criteria andEmailverificationNotIn(List<Boolean> values) {
            addCriterion("EmailVerification not in", values, "emailverification");
            return (Criteria) this;
        }

        public Criteria andEmailverificationBetween(Boolean value1, Boolean value2) {
            addCriterion("EmailVerification between", value1, value2, "emailverification");
            return (Criteria) this;
        }

        public Criteria andEmailverificationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("EmailVerification not between", value1, value2, "emailverification");
            return (Criteria) this;
        }

        public Criteria andCellphoneverificationIsNull() {
            addCriterion("CellPhoneVerification is null");
            return (Criteria) this;
        }

        public Criteria andCellphoneverificationIsNotNull() {
            addCriterion("CellPhoneVerification is not null");
            return (Criteria) this;
        }

        public Criteria andCellphoneverificationEqualTo(Boolean value) {
            addCriterion("CellPhoneVerification =", value, "cellphoneverification");
            return (Criteria) this;
        }

        public Criteria andCellphoneverificationNotEqualTo(Boolean value) {
            addCriterion("CellPhoneVerification <>", value, "cellphoneverification");
            return (Criteria) this;
        }

        public Criteria andCellphoneverificationGreaterThan(Boolean value) {
            addCriterion("CellPhoneVerification >", value, "cellphoneverification");
            return (Criteria) this;
        }

        public Criteria andCellphoneverificationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CellPhoneVerification >=", value, "cellphoneverification");
            return (Criteria) this;
        }

        public Criteria andCellphoneverificationLessThan(Boolean value) {
            addCriterion("CellPhoneVerification <", value, "cellphoneverification");
            return (Criteria) this;
        }

        public Criteria andCellphoneverificationLessThanOrEqualTo(Boolean value) {
            addCriterion("CellPhoneVerification <=", value, "cellphoneverification");
            return (Criteria) this;
        }

        public Criteria andCellphoneverificationIn(List<Boolean> values) {
            addCriterion("CellPhoneVerification in", values, "cellphoneverification");
            return (Criteria) this;
        }

        public Criteria andCellphoneverificationNotIn(List<Boolean> values) {
            addCriterion("CellPhoneVerification not in", values, "cellphoneverification");
            return (Criteria) this;
        }

        public Criteria andCellphoneverificationBetween(Boolean value1, Boolean value2) {
            addCriterion("CellPhoneVerification between", value1, value2, "cellphoneverification");
            return (Criteria) this;
        }

        public Criteria andCellphoneverificationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CellPhoneVerification not between", value1, value2, "cellphoneverification");
            return (Criteria) this;
        }

        public Criteria andRegisteredsourceIsNull() {
            addCriterion("RegisteredSource is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredsourceIsNotNull() {
            addCriterion("RegisteredSource is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredsourceEqualTo(Integer value) {
            addCriterion("RegisteredSource =", value, "registeredsource");
            return (Criteria) this;
        }

        public Criteria andRegisteredsourceNotEqualTo(Integer value) {
            addCriterion("RegisteredSource <>", value, "registeredsource");
            return (Criteria) this;
        }

        public Criteria andRegisteredsourceGreaterThan(Integer value) {
            addCriterion("RegisteredSource >", value, "registeredsource");
            return (Criteria) this;
        }

        public Criteria andRegisteredsourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("RegisteredSource >=", value, "registeredsource");
            return (Criteria) this;
        }

        public Criteria andRegisteredsourceLessThan(Integer value) {
            addCriterion("RegisteredSource <", value, "registeredsource");
            return (Criteria) this;
        }

        public Criteria andRegisteredsourceLessThanOrEqualTo(Integer value) {
            addCriterion("RegisteredSource <=", value, "registeredsource");
            return (Criteria) this;
        }

        public Criteria andRegisteredsourceIn(List<Integer> values) {
            addCriterion("RegisteredSource in", values, "registeredsource");
            return (Criteria) this;
        }

        public Criteria andRegisteredsourceNotIn(List<Integer> values) {
            addCriterion("RegisteredSource not in", values, "registeredsource");
            return (Criteria) this;
        }

        public Criteria andRegisteredsourceBetween(Integer value1, Integer value2) {
            addCriterion("RegisteredSource between", value1, value2, "registeredsource");
            return (Criteria) this;
        }

        public Criteria andRegisteredsourceNotBetween(Integer value1, Integer value2) {
            addCriterion("RegisteredSource not between", value1, value2, "registeredsource");
            return (Criteria) this;
        }

        public Criteria andIsquickloginIsNull() {
            addCriterion("IsQuickLogin is null");
            return (Criteria) this;
        }

        public Criteria andIsquickloginIsNotNull() {
            addCriterion("IsQuickLogin is not null");
            return (Criteria) this;
        }

        public Criteria andIsquickloginEqualTo(Boolean value) {
            addCriterion("IsQuickLogin =", value, "isquicklogin");
            return (Criteria) this;
        }

        public Criteria andIsquickloginNotEqualTo(Boolean value) {
            addCriterion("IsQuickLogin <>", value, "isquicklogin");
            return (Criteria) this;
        }

        public Criteria andIsquickloginGreaterThan(Boolean value) {
            addCriterion("IsQuickLogin >", value, "isquicklogin");
            return (Criteria) this;
        }

        public Criteria andIsquickloginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsQuickLogin >=", value, "isquicklogin");
            return (Criteria) this;
        }

        public Criteria andIsquickloginLessThan(Boolean value) {
            addCriterion("IsQuickLogin <", value, "isquicklogin");
            return (Criteria) this;
        }

        public Criteria andIsquickloginLessThanOrEqualTo(Boolean value) {
            addCriterion("IsQuickLogin <=", value, "isquicklogin");
            return (Criteria) this;
        }

        public Criteria andIsquickloginIn(List<Boolean> values) {
            addCriterion("IsQuickLogin in", values, "isquicklogin");
            return (Criteria) this;
        }

        public Criteria andIsquickloginNotIn(List<Boolean> values) {
            addCriterion("IsQuickLogin not in", values, "isquicklogin");
            return (Criteria) this;
        }

        public Criteria andIsquickloginBetween(Boolean value1, Boolean value2) {
            addCriterion("IsQuickLogin between", value1, value2, "isquicklogin");
            return (Criteria) this;
        }

        public Criteria andIsquickloginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsQuickLogin not between", value1, value2, "isquicklogin");
            return (Criteria) this;
        }

        public Criteria andIsloginedIsNull() {
            addCriterion("IsLogined is null");
            return (Criteria) this;
        }

        public Criteria andIsloginedIsNotNull() {
            addCriterion("IsLogined is not null");
            return (Criteria) this;
        }

        public Criteria andIsloginedEqualTo(Boolean value) {
            addCriterion("IsLogined =", value, "islogined");
            return (Criteria) this;
        }

        public Criteria andIsloginedNotEqualTo(Boolean value) {
            addCriterion("IsLogined <>", value, "islogined");
            return (Criteria) this;
        }

        public Criteria andIsloginedGreaterThan(Boolean value) {
            addCriterion("IsLogined >", value, "islogined");
            return (Criteria) this;
        }

        public Criteria andIsloginedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsLogined >=", value, "islogined");
            return (Criteria) this;
        }

        public Criteria andIsloginedLessThan(Boolean value) {
            addCriterion("IsLogined <", value, "islogined");
            return (Criteria) this;
        }

        public Criteria andIsloginedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsLogined <=", value, "islogined");
            return (Criteria) this;
        }

        public Criteria andIsloginedIn(List<Boolean> values) {
            addCriterion("IsLogined in", values, "islogined");
            return (Criteria) this;
        }

        public Criteria andIsloginedNotIn(List<Boolean> values) {
            addCriterion("IsLogined not in", values, "islogined");
            return (Criteria) this;
        }

        public Criteria andIsloginedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsLogined between", value1, value2, "islogined");
            return (Criteria) this;
        }

        public Criteria andIsloginedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsLogined not between", value1, value2, "islogined");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNull() {
            addCriterion("Unionid is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("Unionid is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("Unionid =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("Unionid <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("Unionid >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("Unionid >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("Unionid <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("Unionid <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("Unionid like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("Unionid not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("Unionid in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("Unionid not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("Unionid between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("Unionid not between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andIssubscribeIsNull() {
            addCriterion("IsSubscribe is null");
            return (Criteria) this;
        }

        public Criteria andIssubscribeIsNotNull() {
            addCriterion("IsSubscribe is not null");
            return (Criteria) this;
        }

        public Criteria andIssubscribeEqualTo(Boolean value) {
            addCriterion("IsSubscribe =", value, "issubscribe");
            return (Criteria) this;
        }

        public Criteria andIssubscribeNotEqualTo(Boolean value) {
            addCriterion("IsSubscribe <>", value, "issubscribe");
            return (Criteria) this;
        }

        public Criteria andIssubscribeGreaterThan(Boolean value) {
            addCriterion("IsSubscribe >", value, "issubscribe");
            return (Criteria) this;
        }

        public Criteria andIssubscribeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsSubscribe >=", value, "issubscribe");
            return (Criteria) this;
        }

        public Criteria andIssubscribeLessThan(Boolean value) {
            addCriterion("IsSubscribe <", value, "issubscribe");
            return (Criteria) this;
        }

        public Criteria andIssubscribeLessThanOrEqualTo(Boolean value) {
            addCriterion("IsSubscribe <=", value, "issubscribe");
            return (Criteria) this;
        }

        public Criteria andIssubscribeIn(List<Boolean> values) {
            addCriterion("IsSubscribe in", values, "issubscribe");
            return (Criteria) this;
        }

        public Criteria andIssubscribeNotIn(List<Boolean> values) {
            addCriterion("IsSubscribe not in", values, "issubscribe");
            return (Criteria) this;
        }

        public Criteria andIssubscribeBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSubscribe between", value1, value2, "issubscribe");
            return (Criteria) this;
        }

        public Criteria andIssubscribeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSubscribe not between", value1, value2, "issubscribe");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NickName is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NickName is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NickName =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NickName <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NickName >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NickName >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NickName <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NickName <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NickName like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NickName not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NickName in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NickName not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NickName between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NickName not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andTagidsIsNull() {
            addCriterion("TagIds is null");
            return (Criteria) this;
        }

        public Criteria andTagidsIsNotNull() {
            addCriterion("TagIds is not null");
            return (Criteria) this;
        }

        public Criteria andTagidsEqualTo(String value) {
            addCriterion("TagIds =", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsNotEqualTo(String value) {
            addCriterion("TagIds <>", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsGreaterThan(String value) {
            addCriterion("TagIds >", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsGreaterThanOrEqualTo(String value) {
            addCriterion("TagIds >=", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsLessThan(String value) {
            addCriterion("TagIds <", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsLessThanOrEqualTo(String value) {
            addCriterion("TagIds <=", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsLike(String value) {
            addCriterion("TagIds like", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsNotLike(String value) {
            addCriterion("TagIds not like", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsIn(List<String> values) {
            addCriterion("TagIds in", values, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsNotIn(List<String> values) {
            addCriterion("TagIds not in", values, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsBetween(String value1, String value2) {
            addCriterion("TagIds between", value1, value2, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsNotBetween(String value1, String value2) {
            addCriterion("TagIds not between", value1, value2, "tagids");
            return (Criteria) this;
        }

        public Criteria andIssendappcouponsIsNull() {
            addCriterion("IsSendAppCoupons is null");
            return (Criteria) this;
        }

        public Criteria andIssendappcouponsIsNotNull() {
            addCriterion("IsSendAppCoupons is not null");
            return (Criteria) this;
        }

        public Criteria andIssendappcouponsEqualTo(Boolean value) {
            addCriterion("IsSendAppCoupons =", value, "issendappcoupons");
            return (Criteria) this;
        }

        public Criteria andIssendappcouponsNotEqualTo(Boolean value) {
            addCriterion("IsSendAppCoupons <>", value, "issendappcoupons");
            return (Criteria) this;
        }

        public Criteria andIssendappcouponsGreaterThan(Boolean value) {
            addCriterion("IsSendAppCoupons >", value, "issendappcoupons");
            return (Criteria) this;
        }

        public Criteria andIssendappcouponsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsSendAppCoupons >=", value, "issendappcoupons");
            return (Criteria) this;
        }

        public Criteria andIssendappcouponsLessThan(Boolean value) {
            addCriterion("IsSendAppCoupons <", value, "issendappcoupons");
            return (Criteria) this;
        }

        public Criteria andIssendappcouponsLessThanOrEqualTo(Boolean value) {
            addCriterion("IsSendAppCoupons <=", value, "issendappcoupons");
            return (Criteria) this;
        }

        public Criteria andIssendappcouponsIn(List<Boolean> values) {
            addCriterion("IsSendAppCoupons in", values, "issendappcoupons");
            return (Criteria) this;
        }

        public Criteria andIssendappcouponsNotIn(List<Boolean> values) {
            addCriterion("IsSendAppCoupons not in", values, "issendappcoupons");
            return (Criteria) this;
        }

        public Criteria andIssendappcouponsBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSendAppCoupons between", value1, value2, "issendappcoupons");
            return (Criteria) this;
        }

        public Criteria andIssendappcouponsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSendAppCoupons not between", value1, value2, "issendappcoupons");
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