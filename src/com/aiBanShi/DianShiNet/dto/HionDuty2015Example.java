package com.aiBanShi.DianShiNet.dto;

import java.util.ArrayList;
import java.util.List;

public class HionDuty2015Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HionDuty2015Example() {
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

        public Criteria andQx1IsNull() {
            addCriterion("QX1 is null");
            return (Criteria) this;
        }

        public Criteria andQx1IsNotNull() {
            addCriterion("QX1 is not null");
            return (Criteria) this;
        }

        public Criteria andQx1EqualTo(String value) {
            addCriterion("QX1 =", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1NotEqualTo(String value) {
            addCriterion("QX1 <>", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1GreaterThan(String value) {
            addCriterion("QX1 >", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1GreaterThanOrEqualTo(String value) {
            addCriterion("QX1 >=", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1LessThan(String value) {
            addCriterion("QX1 <", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1LessThanOrEqualTo(String value) {
            addCriterion("QX1 <=", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1Like(String value) {
            addCriterion("QX1 like", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1NotLike(String value) {
            addCriterion("QX1 not like", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1In(List<String> values) {
            addCriterion("QX1 in", values, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1NotIn(List<String> values) {
            addCriterion("QX1 not in", values, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1Between(String value1, String value2) {
            addCriterion("QX1 between", value1, value2, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1NotBetween(String value1, String value2) {
            addCriterion("QX1 not between", value1, value2, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx2IsNull() {
            addCriterion("QX2 is null");
            return (Criteria) this;
        }

        public Criteria andQx2IsNotNull() {
            addCriterion("QX2 is not null");
            return (Criteria) this;
        }

        public Criteria andQx2EqualTo(String value) {
            addCriterion("QX2 =", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2NotEqualTo(String value) {
            addCriterion("QX2 <>", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2GreaterThan(String value) {
            addCriterion("QX2 >", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2GreaterThanOrEqualTo(String value) {
            addCriterion("QX2 >=", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2LessThan(String value) {
            addCriterion("QX2 <", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2LessThanOrEqualTo(String value) {
            addCriterion("QX2 <=", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2Like(String value) {
            addCriterion("QX2 like", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2NotLike(String value) {
            addCriterion("QX2 not like", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2In(List<String> values) {
            addCriterion("QX2 in", values, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2NotIn(List<String> values) {
            addCriterion("QX2 not in", values, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2Between(String value1, String value2) {
            addCriterion("QX2 between", value1, value2, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2NotBetween(String value1, String value2) {
            addCriterion("QX2 not between", value1, value2, "qx2");
            return (Criteria) this;
        }

        public Criteria andQxvalueIsNull() {
            addCriterion("QXValue is null");
            return (Criteria) this;
        }

        public Criteria andQxvalueIsNotNull() {
            addCriterion("QXValue is not null");
            return (Criteria) this;
        }

        public Criteria andQxvalueEqualTo(String value) {
            addCriterion("QXValue =", value, "qxvalue");
            return (Criteria) this;
        }

        public Criteria andQxvalueNotEqualTo(String value) {
            addCriterion("QXValue <>", value, "qxvalue");
            return (Criteria) this;
        }

        public Criteria andQxvalueGreaterThan(String value) {
            addCriterion("QXValue >", value, "qxvalue");
            return (Criteria) this;
        }

        public Criteria andQxvalueGreaterThanOrEqualTo(String value) {
            addCriterion("QXValue >=", value, "qxvalue");
            return (Criteria) this;
        }

        public Criteria andQxvalueLessThan(String value) {
            addCriterion("QXValue <", value, "qxvalue");
            return (Criteria) this;
        }

        public Criteria andQxvalueLessThanOrEqualTo(String value) {
            addCriterion("QXValue <=", value, "qxvalue");
            return (Criteria) this;
        }

        public Criteria andQxvalueLike(String value) {
            addCriterion("QXValue like", value, "qxvalue");
            return (Criteria) this;
        }

        public Criteria andQxvalueNotLike(String value) {
            addCriterion("QXValue not like", value, "qxvalue");
            return (Criteria) this;
        }

        public Criteria andQxvalueIn(List<String> values) {
            addCriterion("QXValue in", values, "qxvalue");
            return (Criteria) this;
        }

        public Criteria andQxvalueNotIn(List<String> values) {
            addCriterion("QXValue not in", values, "qxvalue");
            return (Criteria) this;
        }

        public Criteria andQxvalueBetween(String value1, String value2) {
            addCriterion("QXValue between", value1, value2, "qxvalue");
            return (Criteria) this;
        }

        public Criteria andQxvalueNotBetween(String value1, String value2) {
            addCriterion("QXValue not between", value1, value2, "qxvalue");
            return (Criteria) this;
        }

        public Criteria andOrdercolIsNull() {
            addCriterion("OrderCol is null");
            return (Criteria) this;
        }

        public Criteria andOrdercolIsNotNull() {
            addCriterion("OrderCol is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercolEqualTo(Integer value) {
            addCriterion("OrderCol =", value, "ordercol");
            return (Criteria) this;
        }

        public Criteria andOrdercolNotEqualTo(Integer value) {
            addCriterion("OrderCol <>", value, "ordercol");
            return (Criteria) this;
        }

        public Criteria andOrdercolGreaterThan(Integer value) {
            addCriterion("OrderCol >", value, "ordercol");
            return (Criteria) this;
        }

        public Criteria andOrdercolGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderCol >=", value, "ordercol");
            return (Criteria) this;
        }

        public Criteria andOrdercolLessThan(Integer value) {
            addCriterion("OrderCol <", value, "ordercol");
            return (Criteria) this;
        }

        public Criteria andOrdercolLessThanOrEqualTo(Integer value) {
            addCriterion("OrderCol <=", value, "ordercol");
            return (Criteria) this;
        }

        public Criteria andOrdercolIn(List<Integer> values) {
            addCriterion("OrderCol in", values, "ordercol");
            return (Criteria) this;
        }

        public Criteria andOrdercolNotIn(List<Integer> values) {
            addCriterion("OrderCol not in", values, "ordercol");
            return (Criteria) this;
        }

        public Criteria andOrdercolBetween(Integer value1, Integer value2) {
            addCriterion("OrderCol between", value1, value2, "ordercol");
            return (Criteria) this;
        }

        public Criteria andOrdercolNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderCol not between", value1, value2, "ordercol");
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