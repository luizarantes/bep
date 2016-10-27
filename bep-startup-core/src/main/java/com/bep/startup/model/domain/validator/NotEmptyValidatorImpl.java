/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without BTG Pactual's express consent.
* 
*/

package com.bep.startup.model.domain.validator;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
public class NotEmptyValidatorImpl implements Validator<String> {

	public boolean isValid(String value) {
		boolean result = true;
		if (value == null || value.trim().equals("")){
			result = false;
		}
		return result;
	}

}
