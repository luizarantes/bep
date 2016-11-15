/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.MeetingProcedure;
import com.bep.startup.model.domain.dto.MeetingProcedureDTO;
import com.bep.startup.service.MeetingProcedureService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class MeetingProcedureServiceImpl extends AbstractService<MeetingProcedureDTO, MeetingProcedure, Long> implements MeetingProcedureService<MeetingProcedureDTO, MeetingProcedure, Long> {
    
     public  MeetingProcedureServiceImpl() {
    	super(MeetingProcedureDTO.class, MeetingProcedure.class);
    }
}