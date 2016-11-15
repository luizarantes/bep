/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.User;
import com.bep.startup.model.domain.dto.UserDTO;
import com.bep.startup.service.UserService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class UserServiceImpl extends AbstractService<UserDTO, User, Long> implements UserService<UserDTO, User, Long> {
    
     public  UserServiceImpl() {
    	super(UserDTO.class, User.class);
    }
}