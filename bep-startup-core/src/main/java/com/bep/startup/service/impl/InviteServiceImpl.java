/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Invite;
import com.bep.startup.model.domain.dto.InviteDTO;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class InviteServiceImpl extends AbstractService<InviteDTO, Invite, Long>  {
    
	public InviteServiceImpl() {
    	super(InviteDTO.class, Invite.class);
    }

}