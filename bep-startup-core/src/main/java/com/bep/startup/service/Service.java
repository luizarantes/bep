/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.service;

import java.io.Serializable;

import com.bep.startup.model.domain.DomainEntity;
import com.bep.startup.model.domain.dto.DataTransferObject;

/** 
*
* @author GSI
* @since 1.0
* 
*/
public interface Service<T extends DataTransferObject, E extends DomainEntity<?>, ID extends Serializable> {
	
	/**
	 * @param dto
	 * @return T
	 */
	public T save(T dto);
	
	
	/**
	 * @param id
	 * @return T
	 */
	public T findOne(ID id);
	
	/**
	 * @return Iterable<T>
	 */
	public Iterable<T> findAll();
	
	/**
	 * @param id
	 */
	public void delete(ID id);

}
