/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.model.domain;


import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@StaticMetamodel(Invite.class)
public class Invite_ {

	public static volatile SingularAttribute<Invite, Long> id;	
	public static volatile SingularAttribute<Invite, ContactPerson> contactPerson;
	public static volatile SingularAttribute<Invite, Project> project;
	public static volatile SingularAttribute<Invite, String> codeInvite;
	
}