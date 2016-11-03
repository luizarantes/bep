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

import com.madsi.marketing.digital.model.domain.PlataformaGoogleAdword;
import com.madsi.marketing.digital.model.domain.dto.PlataformaGoogleAdwordDTO;
import com.madsi.marketing.digital.service.PlataformaGoogleAdwordService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class PlataformaGoogleAdwordServiceImpl extends AbstractService<PlataformaGoogleAdwordDTO, PlataformaGoogleAdword, Long> implements PlataformaGoogleAdwordService<PlataformaGoogleAdwordDTO, PlataformaGoogleAdword, Long> {
    
     public  PlataformaGoogleAdwordServiceImpl() {
    	super(PlataformaGoogleAdwordDTO.class, PlataformaGoogleAdword.class);
    }
}