/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Discipline;
import com.bep.startup.model.domain.dto.DisciplineDTO;
import com.bep.startup.service.DisciplineService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class DisciplineServiceImpl extends AbstractService<DisciplineDTO, Discipline, Long> implements DisciplineService<DisciplineDTO, Discipline, Long> {
    
     public  DisciplineServiceImpl() {
    	super(DisciplineDTO.class, Discipline.class);
    }
}