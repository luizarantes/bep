/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain;


import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@StaticMetamodel(ContactPerson.class)
public class ContactPerson_ {

	public static volatile SingularAttribute<ContactPerson, Long> id;	
	public static volatile ListAttribute<ContactPerson, KeyMember> keyMembers;
	public static volatile ListAttribute<ContactPerson, Project> projectContactPersonAdmins;
	public static volatile ListAttribute<ContactPerson, Invite> invites;
	public static volatile SingularAttribute<ContactPerson, String> descricaoName;
	public static volatile SingularAttribute<ContactPerson, String> descricaoMail;
	public static volatile SingularAttribute<ContactPerson, String> descricaoMobile;
	
}