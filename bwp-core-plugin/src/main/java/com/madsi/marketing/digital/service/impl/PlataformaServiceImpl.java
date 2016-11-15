/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.service.impl;

import org.springframework.stereotype.Service;

import com.madsi.marketing.digital.model.domain.Plataforma;
import com.madsi.marketing.digital.model.domain.dto.PlataformaDTO;
import com.madsi.marketing.digital.service.PlataformaService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class PlataformaServiceImpl extends AbstractService<PlataformaDTO, Plataforma, Long> implements PlataformaService<PlataformaDTO, Plataforma, Long> {
    
     public  PlataformaServiceImpl() {
    	super(PlataformaDTO.class, Plataforma.class);
    }
}