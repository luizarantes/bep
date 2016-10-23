/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.SoftwareType;
import com.bep.startup.model.domain.dto.SoftwareTypeDTO;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class SoftwareTypeServiceImpl extends AbstractService<SoftwareTypeDTO, SoftwareType, Long>  {
    
	public SoftwareTypeServiceImpl() {
    	super(SoftwareTypeDTO.class, SoftwareType.class);
    }

}