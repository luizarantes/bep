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
@StaticMetamodel(BimUse.class)
public class BimUse_ {

	public static volatile SingularAttribute<BimUse, Long> id;	
	public static volatile ListAttribute<BimUse, Software> softwares;
	public static volatile SingularAttribute<BimUse, String> nameBimUse;
	public static volatile SingularAttribute<BimUse, String> descriptionBimUse;
	
}