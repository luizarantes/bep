/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.service.impl;

import org.springframework.stereotype.Service;

import com.madsi.marketing.digital.model.domain.PlataformaGoogleAnalytic;
import com.madsi.marketing.digital.model.domain.dto.PlataformaGoogleAnalyticDTO;
import com.madsi.marketing.digital.service.PlataformaGoogleAnalyticService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class PlataformaGoogleAnalyticServiceImpl extends AbstractService<PlataformaGoogleAnalyticDTO, PlataformaGoogleAnalytic, Long> implements PlataformaGoogleAnalyticService<PlataformaGoogleAnalyticDTO, PlataformaGoogleAnalytic, Long> {
    
     public  PlataformaGoogleAnalyticServiceImpl() {
    	super(PlataformaGoogleAnalyticDTO.class, PlataformaGoogleAnalytic.class);
    }
}