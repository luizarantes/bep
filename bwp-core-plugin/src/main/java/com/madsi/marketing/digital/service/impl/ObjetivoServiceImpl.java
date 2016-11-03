/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.madsi.marketing.digital.model.domain.Objetivo;
import com.madsi.marketing.digital.model.domain.dto.ObjetivoDTO;
import com.madsi.marketing.digital.service.ObjetivoService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class ObjetivoServiceImpl extends AbstractService<ObjetivoDTO, Objetivo, Long> implements ObjetivoService<ObjetivoDTO, Objetivo, Long> {
    
     public  ObjetivoServiceImpl() {
    	super(ObjetivoDTO.class, Objetivo.class);
    }
}