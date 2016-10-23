/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Discipline;
import com.bep.startup.model.domain.dto.DisciplineDTO;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class DisciplineServiceImpl extends AbstractService<DisciplineDTO, Discipline, Long>  {
    
	public DisciplineServiceImpl() {
    	super(DisciplineDTO.class, Discipline.class);
    }

}