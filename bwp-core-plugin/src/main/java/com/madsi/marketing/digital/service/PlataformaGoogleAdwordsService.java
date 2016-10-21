/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.service;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public abstract interface PlataformaGoogleAdwordsService<T, E, ID> {

/**
	 * Saves a given entity. Use the returned instance of DTO for further operations as the save operation might have changed the
	 * entity instance completely.
	 * 
	 * @param dto
	 * @return the saved entity
	 */
	public abstract T save(T dto);
	
	/**
	 * Retrieves an DTO by its id.
	 * 
	 * @param id must not be {@literal null}.
	 * @return the DTO with the given id or {@literal null} if none found
	 * @throws IllegalArgumentException if {@code id} is {@literal null}
	 */
	public abstract T findOne(ID id);	
	
	/**
	 * Returns all instances of the type.
	 * 
	 * @return all entities and converted to DTO
	 */
	public abstract Iterable<T> findAll();

}