/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.data.repository;

import com.bep.startup.model.domain.ProjectCia;
import com.bep.startup.data.repository.custom.ProjectCiaCustomRepository;

import org.springframework.data.repository.CrudRepository;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
public abstract interface ProjectCiaRepository extends CrudRepository<ProjectCia, Long>, ProjectCiaCustomRepository {

}