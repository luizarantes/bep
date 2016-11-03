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

import com.madsi.marketing.digital.model.domain.FaixaEtaria;
import com.madsi.marketing.digital.model.domain.dto.FaixaEtariaDTO;
import com.madsi.marketing.digital.service.FaixaEtariaService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class FaixaEtariaServiceImpl extends AbstractService<FaixaEtariaDTO, FaixaEtaria, Long> implements FaixaEtariaService<FaixaEtariaDTO, FaixaEtaria, Long> {
    
     public  FaixaEtariaServiceImpl() {
    	super(FaixaEtariaDTO.class, FaixaEtaria.class);
    }
}