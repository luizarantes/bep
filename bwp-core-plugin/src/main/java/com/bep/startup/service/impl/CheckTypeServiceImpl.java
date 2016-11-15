/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.CheckType;
import com.bep.startup.model.domain.dto.CheckTypeDTO;
import com.bep.startup.service.CheckTypeService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class CheckTypeServiceImpl extends AbstractService<CheckTypeDTO, CheckType, Long> implements CheckTypeService<CheckTypeDTO, CheckType, Long> {
    
     public  CheckTypeServiceImpl() {
    	super(CheckTypeDTO.class, CheckType.class);
    }
}