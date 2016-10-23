/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.data.repository;

import com.bep.startup.model.domain.Discipline;
import com.bep.startup.data.repository.custom.DisciplineCustomRepository;

import org.springframework.data.repository.CrudRepository;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
public abstract interface DisciplineRepository extends CrudRepository<Discipline, Long>, DisciplineCustomRepository {

}