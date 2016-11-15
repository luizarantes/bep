/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Hardware;
import com.bep.startup.model.domain.dto.HardwareDTO;
import com.bep.startup.service.HardwareService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class HardwareServiceImpl extends AbstractService<HardwareDTO, Hardware, Long> implements HardwareService<HardwareDTO, Hardware, Long> {
    
     public  HardwareServiceImpl() {
    	super(HardwareDTO.class, Hardware.class);
    }
}