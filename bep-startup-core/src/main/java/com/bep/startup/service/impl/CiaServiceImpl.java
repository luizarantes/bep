/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Cia;
import com.bep.startup.model.domain.dto.CiaDTO;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class CiaServiceImpl extends AbstractService<CiaDTO, Cia, Long>  {
    
    public CiaServiceImpl() {
    	super(CiaDTO.class, Cia.class);
    }
    
}