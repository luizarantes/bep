/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without BTG Pactual's express consent.
* 
*/

package com.bep.startup.model.domain.validator;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;



/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Constraint(validatedBy = NotEmptyValidator.class)
@Target({ ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NotEmpty {

	String message() default "com.madsi.core.validator.NotEmpty.message";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}