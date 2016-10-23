/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Software;
import com.bep.startup.model.domain.dto.SoftwareDTO;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class SoftwareServiceImpl extends AbstractService<SoftwareDTO, Software, Long>  {
    
	public SoftwareServiceImpl() {
    	super(SoftwareDTO.class, Software.class);
    }
}