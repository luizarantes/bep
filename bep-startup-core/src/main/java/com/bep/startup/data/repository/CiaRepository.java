/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.bep.startup.model.domain.Cia;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
public abstract interface CiaRepository extends CrudRepository<Cia, Long> {

}