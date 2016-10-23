/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.bep.startup.model.domain.DomainEntity;
import com.bep.startup.model.domain.dto.DataTransferObject;

/** 
*
* @author GSI
* @since 1.0
* 
*/
public abstract class AbstractService<T extends DataTransferObject, E extends DomainEntity<?>, ID extends Serializable> {
	
	 private static final Logger LOGGER  = Logger.getLogger(AbstractService.class.getName());

	@Autowired
	private CrudRepository<E, ID> dataRepository;
	private Class<T> t;
	private Class<E> e;

	public AbstractService() {

	}

	/**
	 * @param t
	 * @param e
	 */
	public AbstractService(Class<T> t, Class<E> e) {
		this.t = t;
		this.e = e;
	}

	/**
	 * @param dto
	 * @return T
	 */
	public T save(T dto) {

		if (dto != null) {
			try {
				E entity = e.newInstance();
				BeanUtils.copyProperties(dto, entity);
				entity = this.dataRepository.save(entity);
				BeanUtils.copyProperties(entity, dto);
			}catch (InstantiationException e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
			}catch (IllegalAccessException e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
			}
		}

		return dto;
	}

	/**
	 * @param id
	 * @return
	 */
	public T findOne(ID id) {

		if (id != null) {
			try {
				T dto = t.newInstance();
				BeanUtils.copyProperties(this.dataRepository.findOne(id), dto);
				return dto;
			}catch (InstantiationException e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
			}catch (IllegalAccessException e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
			}
		}

		return null;
	}

	
	/**
	 * @return Iterable<T>
	 */
	public Iterable<T> findAll() {

		Iterable<E> iterableFindAll = this.dataRepository.findAll();

		if (iterableFindAll != null) {

			List<T> listResult = new ArrayList<T>();
			Iterator<E> iterator = iterableFindAll.iterator();

			while (iterator.hasNext()) {
				try {
					T dto = t.newInstance();
					BeanUtils.copyProperties(iterator.next(), dto);
					listResult.add(dto);
				}catch (InstantiationException e) {
					LOGGER.log(Level.SEVERE, e.getMessage(), e);
				}catch (IllegalAccessException e) {
					LOGGER.log(Level.SEVERE, e.getMessage(), e);
				}
			}

			return listResult;
		}

		return null;
	}
}
