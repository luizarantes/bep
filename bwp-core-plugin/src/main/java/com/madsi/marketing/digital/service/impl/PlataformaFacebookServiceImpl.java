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

import com.madsi.marketing.digital.model.domain.PlataformaFacebook;
import com.madsi.marketing.digital.model.domain.dto.PlataformaFacebookDTO;
import com.madsi.marketing.digital.service.PlataformaFacebookService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class PlataformaFacebookServiceImpl extends AbstractService<PlataformaFacebookDTO, PlataformaFacebook, Long> implements PlataformaFacebookService<PlataformaFacebookDTO, PlataformaFacebook, Long> {
    
     public  PlataformaFacebookServiceImpl() {
    	super(PlataformaFacebookDTO.class, PlataformaFacebook.class);
    }
}