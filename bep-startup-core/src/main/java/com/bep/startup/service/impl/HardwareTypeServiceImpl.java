/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.HardwareType;
import com.bep.startup.model.domain.dto.HardwareTypeDTO;
import com.bep.startup.service.HardwareTypeService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class HardwareTypeServiceImpl extends AbstractService<HardwareTypeDTO, HardwareType, Long> implements HardwareTypeService<HardwareTypeDTO, HardwareType, Long> {
    
     public  HardwareTypeServiceImpl() {
    	super(HardwareTypeDTO.class, HardwareType.class);
    }
}