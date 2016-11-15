/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.service.impl;

import org.springframework.stereotype.Service;

import com.madsi.marketing.digital.model.domain.CampanhaMetrica;
import com.madsi.marketing.digital.model.domain.dto.CampanhaMetricaDTO;
import com.madsi.marketing.digital.service.CampanhaMetricaService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class CampanhaMetricaServiceImpl extends AbstractService<CampanhaMetricaDTO, CampanhaMetrica, Long> implements CampanhaMetricaService<CampanhaMetricaDTO, CampanhaMetrica, Long> {
    
     public  CampanhaMetricaServiceImpl() {
    	super(CampanhaMetricaDTO.class, CampanhaMetrica.class);
    }
}