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
@StaticMetamodel(KeyMember.class)
public class KeyMember_ {

	public static volatile SingularAttribute<KeyMember, Long> id;	
	public static volatile SingularAttribute<KeyMember, Project> project;
	public static volatile SingularAttribute<KeyMember, ContactPerson> contactPerson;
	public static volatile SingularAttribute<KeyMember, Cia> cia;
	public static volatile SingularAttribute<KeyMember, Discipline> discipline;
	
}