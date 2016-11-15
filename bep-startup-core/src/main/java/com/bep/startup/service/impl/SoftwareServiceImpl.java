/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Software;
import com.bep.startup.model.domain.dto.SoftwareDTO;
import com.bep.startup.service.SoftwareService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class SoftwareServiceImpl extends AbstractService<SoftwareDTO, Software, Long> implements SoftwareService<SoftwareDTO, Software, Long> {
    
     public  SoftwareServiceImpl() {
    	super(SoftwareDTO.class, Software.class);
    }
}