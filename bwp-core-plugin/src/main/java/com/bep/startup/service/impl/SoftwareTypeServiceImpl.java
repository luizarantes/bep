/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.SoftwareType;
import com.bep.startup.model.domain.dto.SoftwareTypeDTO;
import com.bep.startup.service.SoftwareTypeService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class SoftwareTypeServiceImpl extends AbstractService<SoftwareTypeDTO, SoftwareType, Long> implements SoftwareTypeService<SoftwareTypeDTO, SoftwareType, Long> {
    
     public  SoftwareTypeServiceImpl() {
    	super(SoftwareTypeDTO.class, SoftwareType.class);
    }
}