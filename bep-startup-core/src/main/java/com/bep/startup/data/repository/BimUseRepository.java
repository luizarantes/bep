/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.data.repository;

import com.bep.startup.model.domain.BimUse;

import org.springframework.data.repository.CrudRepository;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public abstract interface BimUseRepository extends CrudRepository<BimUse, Long> {

}