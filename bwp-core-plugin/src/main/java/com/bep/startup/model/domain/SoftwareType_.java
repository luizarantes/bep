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
@StaticMetamodel(SoftwareType.class)
public class SoftwareType_ {

	public static volatile SingularAttribute<SoftwareType, Long> id;	
	public static volatile ListAttribute<SoftwareType, Software> softwares;
	public static volatile SingularAttribute<SoftwareType, String> nomeSoftwareType;
	
}