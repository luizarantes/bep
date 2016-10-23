/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.data.repository;

import com.bep.startup.model.domain.Invite;
import com.bep.startup.data.repository.custom.InviteCustomRepository;

import org.springframework.data.repository.CrudRepository;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
public abstract interface InviteRepository extends CrudRepository<Invite, Long>, InviteCustomRepository {

}