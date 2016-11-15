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
@StaticMetamodel(Software.class)
public class Software_ {

	public static volatile SingularAttribute<Software, Long> id;	
	public static volatile SingularAttribute<Software, BimUse> bimUse;
	public static volatile SingularAttribute<Software, Project> project;
	public static volatile SingularAttribute<Software, SoftwareType> softwareType;
	public static volatile SingularAttribute<Software, String> descriptionSoftware;
	public static volatile ListAttribute<Software, QualityControl> qualityControls;
	
}