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
@StaticMetamodel(CheckType.class)
public class CheckType_ {

	public static volatile SingularAttribute<CheckType, Long> id;	
	public static volatile ListAttribute<CheckType, QualityControl> qualityControls;
	public static volatile SingularAttribute<CheckType, String> nomeCheckType;
	
}