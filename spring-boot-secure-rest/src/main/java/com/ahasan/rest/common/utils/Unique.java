package com.ahasan.rest.common.utils;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = UniqueIdValidator.class)
@Documented
public @interface Unique {
    String message() default "already exits";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * The mapped hibernate/jpa entity class
     */
    Class<?> entity();

    /**
     * The property of the entity we want to validate for uniqueness. Default name is "id"
     */
    String property() default "id";   
}
