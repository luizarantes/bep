/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.service.impl;

import org.springframework.stereotype.Service;

import com.madsi.marketing.digital.model.domain.Campanha;
import com.madsi.marketing.digital.model.domain.dto.CampanhaDTO;
import com.madsi.marketing.digital.service.CampanhaService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class CampanhaServiceImpl extends AbstractService<CampanhaDTO, Campanha, Long> implements CampanhaService<CampanhaDTO, Campanha, Long> {
    
     public  CampanhaServiceImpl() {
    	super(CampanhaDTO.class, Campanha.class);
    }
}