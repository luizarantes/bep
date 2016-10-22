package com.bep.startup.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

public abstract class AbstractService<T, E, ID> {
	
	 private static final Logger LOGGER  = Logger.getLogger(AbstractService.class.getName());

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
		
		try {
			DateConverter converter = new DateConverter(null);
			ConvertUtils.register(converter, java.util.Date.class); 
			BeanUtilsBean.getInstance().getConvertUtils().register(false, false, 0);
			BeanUtils.copyProperties(destiny, origin);
		}catch (IllegalAccessException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}catch (InvocationTargetException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}
	}

}
