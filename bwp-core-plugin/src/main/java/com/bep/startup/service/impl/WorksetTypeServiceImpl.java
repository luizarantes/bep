/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.WorksetType;
import com.bep.startup.model.domain.dto.WorksetTypeDTO;
import com.bep.startup.service.WorksetTypeService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class WorksetTypeServiceImpl extends AbstractService<WorksetTypeDTO, WorksetType, Long> implements WorksetTypeService<WorksetTypeDTO, WorksetType, Long> {
    
     public  WorksetTypeServiceImpl() {
    	super(WorksetTypeDTO.class, WorksetType.class);
    }
}