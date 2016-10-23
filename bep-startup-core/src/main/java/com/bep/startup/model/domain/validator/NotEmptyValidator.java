/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Portal may be reproduced without BTG Pactual's express consent.
* 
*/

package com.bep.startup.model.domain.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
public class NotEmptyValidator implements ConstraintValidator<NotEmpty, String> {

	private Validator<String> validation;

	@Override
	public void initialize(NotEmpty validator) {
		validation = new NotEmptyValidatorImpl();
	}

	@Override
	public boolean isValid(String emails, ConstraintValidatorContext constraintValidatorContext) {
		return validation.isValid(emails);
	}

}
