package com.ahasan.rest.common.utils;

import java.io.Serializable;

import javax.transaction.Transactional;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueIdValidator implements ConstraintValidator<Unique, Serializable> {

    @Autowired(required=true)
    private SessionFactory sessionFactory;

    private Class<?> entityClass;
    private String uniqueField;

    public void initialize(Unique unique) {
        entityClass = unique.entity();
        uniqueField = unique.property();
    }

    @Transactional
    public boolean isValid(Serializable property, ConstraintValidatorContext cvContext) {
        Criteria crit = sessionFactory.getCurrentSession().createCriteria(entityClass);
        crit.add(Restrictions.eq(uniqueField, property));
        return crit.list().isEmpty();
    }

}