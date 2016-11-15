/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.service.impl;

import org.springframework.stereotype.Service;

import com.madsi.marketing.digital.model.domain.Empresa;
import com.madsi.marketing.digital.model.domain.dto.EmpresaDTO;
import com.madsi.marketing.digital.service.EmpresaService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class EmpresaServiceImpl extends AbstractService<EmpresaDTO, Empresa, Long> implements EmpresaService<EmpresaDTO, Empresa, Long> {
    
     public  EmpresaServiceImpl() {
    	super(EmpresaDTO.class, Empresa.class);
    }
}