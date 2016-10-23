/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.PotenticalUse;
import com.bep.startup.model.domain.dto.PotenticalUseDTO;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class PotenticalUseServiceImpl extends AbstractService<PotenticalUseDTO, PotenticalUse, Long>  {
    
	public PotenticalUseServiceImpl() {
    	super(PotenticalUseDTO.class, PotenticalUse.class);
    }
    
}