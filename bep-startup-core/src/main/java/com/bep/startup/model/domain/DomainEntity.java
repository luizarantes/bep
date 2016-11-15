/**
 *
 * Copyright MADSI 2016 All Rights Reserved. 
 * No part of this Portal may be reproduced without GSI express consent.
 * 
 */

package com.bep.startup.model.domain;

import java.io.Serializable;

/**
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public abstract class DomainEntity<ID extends Serializable & Comparable<ID>> implements Serializable {

	private static final long serialVersionUID = 1L;

	public DomainEntity() {

	}

	/**
	 * @param id
	 */
	public DomainEntity(ID id) {
		this();
		setId(id);
	}

	/**
	 * @return
	 */
	public abstract ID getId();

	/**
	 * @param id
	 */
	public abstract void setId(ID id);

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return (getId() == null) ? 0 : getId().hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public boolean equals(Object object) {

		if (object == null) {
			return false;
		}

		if (!object.getClass().isAssignableFrom(getClass())) {
			return false;
		}

		if (this == object) {
			return true;
		}

		final DomainEntity<ID> that = (DomainEntity<ID>) object;

		return getId() != null ? getId().equals(that.getId()) : getId() == that.getId();
	}

	/**
	 * @param object
	 * @return int
	 */
	public int compareTo(DomainEntity<ID> object) {
		return getId() == null ? 1 : ((ID) getId()).compareTo(object.getId());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.toString();
	}

}
