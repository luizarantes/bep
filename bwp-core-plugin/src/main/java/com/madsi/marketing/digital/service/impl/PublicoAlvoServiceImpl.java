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

import com.madsi.marketing.digital.model.domain.PublicoAlvo;
import com.madsi.marketing.digital.model.domain.dto.PublicoAlvoDTO;
import com.madsi.marketing.digital.service.PublicoAlvoService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class PublicoAlvoServiceImpl extends AbstractService<PublicoAlvoDTO, PublicoAlvo, Long> implements PublicoAlvoService<PublicoAlvoDTO, PublicoAlvo, Long> {
    
     public  PublicoAlvoServiceImpl() {
    	super(PublicoAlvoDTO.class, PublicoAlvo.class);
    }
}