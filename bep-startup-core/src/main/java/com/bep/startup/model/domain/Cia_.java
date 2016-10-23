/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.model.domain;


import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@StaticMetamodel(Cia.class)
public class Cia_ {

	public static volatile SingularAttribute<Cia, Long> id;	
	public static volatile ListAttribute<Cia, KeyMember> keyMembers;
	public static volatile SingularAttribute<Cia, String> descriptionAddress;
	public static volatile SingularAttribute<Cia, String> nameCity;
	public static volatile SingularAttribute<Cia, String> descriptionZipCode;
	public static volatile SingularAttribute<Cia, String> descriptionTin;
	public static volatile ListAttribute<Cia, ProjectCia> projectCias;
	
}