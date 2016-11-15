/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.MeetingParticipant;
import com.bep.startup.model.domain.dto.MeetingParticipantDTO;
import com.bep.startup.service.MeetingParticipantService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class MeetingParticipantServiceImpl extends AbstractService<MeetingParticipantDTO, MeetingParticipant, Long> implements MeetingParticipantService<MeetingParticipantDTO, MeetingParticipant, Long> {
    
     public  MeetingParticipantServiceImpl() {
    	super(MeetingParticipantDTO.class, MeetingParticipant.class);
    }
}