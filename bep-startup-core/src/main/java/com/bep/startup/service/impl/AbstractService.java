package com.bep.startup.service.impl;

import org.springframework.beans.BeanUtils;

public abstract class AbstractService<T, E, ID> {

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

	/**
	 * @param destiny
	 * @param origin
	 */
	protected static void copyProperties(Object destiny, Object origin) {
		BeanUtils.copyProperties(origin, destiny);
	}

}
