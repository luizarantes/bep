/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.QualityControl;
import com.bep.startup.model.domain.dto.QualityControlDTO;
import com.bep.startup.service.QualityControlService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class QualityControlServiceImpl extends AbstractService<QualityControlDTO, QualityControl, Long> implements QualityControlService<QualityControlDTO, QualityControl, Long> {
    
     public  QualityControlServiceImpl() {
    	super(QualityControlDTO.class, QualityControl.class);
    }
}