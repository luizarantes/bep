/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.KeyMember;
import com.bep.startup.model.domain.dto.KeyMemberDTO;
import com.bep.startup.service.KeyMemberService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class KeyMemberServiceImpl extends AbstractService<KeyMemberDTO, KeyMember, Long> implements KeyMemberService<KeyMemberDTO, KeyMember, Long> {
    
     public  KeyMemberServiceImpl() {
    	super(KeyMemberDTO.class, KeyMember.class);
    }
}