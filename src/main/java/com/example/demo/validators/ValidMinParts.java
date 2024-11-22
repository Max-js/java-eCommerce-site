package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */
@Constraint(validatedBy = {MinPartValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMinParts {
    String message() default "Part inventory is below minimum allowable inventory!";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
