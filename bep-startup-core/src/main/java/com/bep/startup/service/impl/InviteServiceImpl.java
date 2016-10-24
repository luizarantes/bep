/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Invite;
import com.bep.startup.model.domain.dto.InviteDTO;
import com.bep.startup.service.InviteService;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class InviteServiceImpl extends AbstractService<InviteDTO, Invite, Long> implements InviteService<InviteDTO, Invite, Long> {
    
	public InviteServiceImpl() {
    	super(InviteDTO.class, Invite.class);
    }

}