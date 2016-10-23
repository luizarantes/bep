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
@StaticMetamodel(SoftwareType.class)
public class SoftwareType_ {

	public static volatile SingularAttribute<SoftwareType, Long> id;	
	public static volatile ListAttribute<SoftwareType, Software> softwares;
	public static volatile SingularAttribute<SoftwareType, String> nameSoftwareType;
	
}