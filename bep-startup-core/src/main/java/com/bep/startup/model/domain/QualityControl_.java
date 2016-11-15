/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain;


import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@StaticMetamodel(QualityControl.class)
public class QualityControl_ {

	public static volatile SingularAttribute<QualityControl, Long> id;	
	public static volatile SingularAttribute<QualityControl, Discipline> discipline;
	public static volatile SingularAttribute<QualityControl, Software> software;
	public static volatile SingularAttribute<QualityControl, CheckType> checkType;
	public static volatile SingularAttribute<QualityControl, String> descriptionDefinition;
	public static volatile SingularAttribute<QualityControl, String> descriptionFrequency;
	
}