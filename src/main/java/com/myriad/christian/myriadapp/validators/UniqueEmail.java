package com.myriad.christian.myriadapp.validators;

import java.lang.annotation.*;
import java.lang.annotation.*;
import javax.validation.*;

@Constraint(validatedBy = UniqueEmailValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface UniqueEmail {

    public String message() default "Email already in use!!";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default{};

}