/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Cia;
import com.bep.startup.model.domain.dto.CiaDTO;
import com.bep.startup.service.CiaService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class CiaServiceImpl extends AbstractService<CiaDTO, Cia, Long> implements CiaService<CiaDTO, Cia, Long> {
    
     public  CiaServiceImpl() {
    	super(CiaDTO.class, Cia.class);
    }
}