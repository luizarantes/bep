/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.MeetingType;
import com.bep.startup.model.domain.dto.MeetingTypeDTO;
import com.bep.startup.service.MeetingTypeService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class MeetingTypeServiceImpl extends AbstractService<MeetingTypeDTO, MeetingType, Long> implements MeetingTypeService<MeetingTypeDTO, MeetingType, Long> {
    
     public  MeetingTypeServiceImpl() {
    	super(MeetingTypeDTO.class, MeetingType.class);
    }
}