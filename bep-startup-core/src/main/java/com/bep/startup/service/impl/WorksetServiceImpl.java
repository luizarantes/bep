/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Workset;
import com.bep.startup.model.domain.dto.WorksetDTO;
import com.bep.startup.service.WorksetService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class WorksetServiceImpl extends AbstractService<WorksetDTO, Workset, Long> implements WorksetService<WorksetDTO, Workset, Long> {
    
     public  WorksetServiceImpl() {
    	super(WorksetDTO.class, Workset.class);
    }
}