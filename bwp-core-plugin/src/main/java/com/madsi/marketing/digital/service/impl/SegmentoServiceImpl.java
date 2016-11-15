/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.service.impl;

import org.springframework.stereotype.Service;

import com.madsi.marketing.digital.model.domain.Segmento;
import com.madsi.marketing.digital.model.domain.dto.SegmentoDTO;
import com.madsi.marketing.digital.service.SegmentoService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class SegmentoServiceImpl extends AbstractService<SegmentoDTO, Segmento, Long> implements SegmentoService<SegmentoDTO, Segmento, Long> {
    
     public  SegmentoServiceImpl() {
    	super(SegmentoDTO.class, Segmento.class);
    }
}