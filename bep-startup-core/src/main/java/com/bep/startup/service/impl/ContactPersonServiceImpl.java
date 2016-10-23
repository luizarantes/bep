/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.ContactPerson;
import com.bep.startup.model.domain.dto.ContactPersonDTO;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class ContactPersonServiceImpl extends AbstractService<ContactPersonDTO, ContactPerson, Long>  {
    
    public ContactPersonServiceImpl() {
    	super(ContactPersonDTO.class, ContactPerson.class);
    }

}