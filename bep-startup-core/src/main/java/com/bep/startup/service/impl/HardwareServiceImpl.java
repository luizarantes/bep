/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Hardware;
import com.bep.startup.model.domain.dto.HardwareDTO;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class HardwareServiceImpl extends AbstractService<HardwareDTO, Hardware, Long>  {
    
	public HardwareServiceImpl() {
    	super(HardwareDTO.class, Hardware.class);
    }

}