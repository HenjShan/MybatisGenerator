package com.hanshan.mysqlgenerator.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Long value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Long value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Long value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Long value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Long value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Long> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Long> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Long value1, Long value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Long value1, Long value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedateIsNull() {
            addCriterion("article_createdate is null");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedateIsNotNull() {
            addCriterion("article_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedateEqualTo(Date value) {
            addCriterion("article_createdate =", value, "articleCreatedate");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedateNotEqualTo(Date value) {
            addCriterion("article_createdate <>", value, "articleCreatedate");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedateGreaterThan(Date value) {
            addCriterion("article_createdate >", value, "articleCreatedate");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("article_createdate >=", value, "articleCreatedate");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedateLessThan(Date value) {
            addCriterion("article_createdate <", value, "articleCreatedate");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("article_createdate <=", value, "articleCreatedate");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedateIn(List<Date> values) {
            addCriterion("article_createdate in", values, "articleCreatedate");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedateNotIn(List<Date> values) {
            addCriterion("article_createdate not in", values, "articleCreatedate");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedateBetween(Date value1, Date value2) {
            addCriterion("article_createdate between", value1, value2, "articleCreatedate");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("article_createdate not between", value1, value2, "articleCreatedate");
            return (Criteria) this;
        }

        public Criteria andArticlePraiseIsNull() {
            addCriterion("article_praise is null");
            return (Criteria) this;
        }

        public Criteria andArticlePraiseIsNotNull() {
            addCriterion("article_praise is not null");
            return (Criteria) this;
        }

        public Criteria andArticlePraiseEqualTo(Integer value) {
            addCriterion("article_praise =", value, "articlePraise");
            return (Criteria) this;
        }

        public Criteria andArticlePraiseNotEqualTo(Integer value) {
            addCriterion("article_praise <>", value, "articlePraise");
            return (Criteria) this;
        }

        public Criteria andArticlePraiseGreaterThan(Integer value) {
            addCriterion("article_praise >", value, "articlePraise");
            return (Criteria) this;
        }

        public Criteria andArticlePraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_praise >=", value, "articlePraise");
            return (Criteria) this;
        }

        public Criteria andArticlePraiseLessThan(Integer value) {
            addCriterion("article_praise <", value, "articlePraise");
            return (Criteria) this;
        }

        public Criteria andArticlePraiseLessThanOrEqualTo(Integer value) {
            addCriterion("article_praise <=", value, "articlePraise");
            return (Criteria) this;
        }

        public Criteria andArticlePraiseIn(List<Integer> values) {
            addCriterion("article_praise in", values, "articlePraise");
            return (Criteria) this;
        }

        public Criteria andArticlePraiseNotIn(List<Integer> values) {
            addCriterion("article_praise not in", values, "articlePraise");
            return (Criteria) this;
        }

        public Criteria andArticlePraiseBetween(Integer value1, Integer value2) {
            addCriterion("article_praise between", value1, value2, "articlePraise");
            return (Criteria) this;
        }

        public Criteria andArticlePraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("article_praise not between", value1, value2, "articlePraise");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIsNull() {
            addCriterion("article_comment is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIsNotNull() {
            addCriterion("article_comment is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentEqualTo(Integer value) {
            addCriterion("article_comment =", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentNotEqualTo(Integer value) {
            addCriterion("article_comment <>", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentGreaterThan(Integer value) {
            addCriterion("article_comment >", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_comment >=", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLessThan(Integer value) {
            addCriterion("article_comment <", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLessThanOrEqualTo(Integer value) {
            addCriterion("article_comment <=", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIn(List<Integer> values) {
            addCriterion("article_comment in", values, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentNotIn(List<Integer> values) {
            addCriterion("article_comment not in", values, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentBetween(Integer value1, Integer value2) {
            addCriterion("article_comment between", value1, value2, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("article_comment not between", value1, value2, "articleComment");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Long value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Long value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Long value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Long value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Long value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Long value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Long> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Long> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Long value1, Long value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Long value1, Long value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
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