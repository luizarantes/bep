/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.BimUse;
import com.bep.startup.model.domain.dto.BimUseDTO;
import com.bep.startup.service.BimUseService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class BimUseServiceImpl extends AbstractService<BimUseDTO, BimUse, Long> implements BimUseService<BimUseDTO, BimUse, Long> {
    
     public  BimUseServiceImpl() {
    	super(BimUseDTO.class, BimUse.class);
    }
}