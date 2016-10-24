/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.User;
import com.bep.startup.model.domain.dto.UserDTO;
import com.bep.startup.service.UserService;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class UserServiceImpl extends AbstractService<UserDTO, User, Long> implements UserService<UserDTO, User, Long> {
    
	public UserServiceImpl() {
    	super(UserDTO.class, User.class);
    }

}