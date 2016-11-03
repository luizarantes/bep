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

import com.madsi.marketing.digital.model.domain.Meta;
import com.madsi.marketing.digital.model.domain.dto.MetaDTO;
import com.madsi.marketing.digital.service.MetaService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class MetaServiceImpl extends AbstractService<MetaDTO, Meta, Long> implements MetaService<MetaDTO, Meta, Long> {
    
     public  MetaServiceImpl() {
    	super(MetaDTO.class, Meta.class);
    }
}