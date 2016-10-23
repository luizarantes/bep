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

public interface Validator<T> {

	boolean isValid(T obj);
}
