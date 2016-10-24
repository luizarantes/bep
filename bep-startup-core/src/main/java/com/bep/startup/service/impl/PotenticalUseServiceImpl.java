/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.PotenticalUse;
import com.bep.startup.model.domain.dto.PotenticalUseDTO;
import com.bep.startup.service.PotenticalUseService;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class PotenticalUseServiceImpl extends AbstractService<PotenticalUseDTO, PotenticalUse, Long> implements PotenticalUseService<PotenticalUseDTO, PotenticalUse, Long> {
    
	public PotenticalUseServiceImpl() {
    	super(PotenticalUseDTO.class, PotenticalUse.class);
    }
    
}