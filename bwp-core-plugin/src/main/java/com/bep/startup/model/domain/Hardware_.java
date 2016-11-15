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
@StaticMetamodel(Hardware.class)
public class Hardware_ {

	public static volatile SingularAttribute<Hardware, Long> id;	
	public static volatile SingularAttribute<Hardware, Project> project;
	public static volatile SingularAttribute<Hardware, HardwareType> hardwareType;
	public static volatile SingularAttribute<Hardware, String> descriptionHardware;
	
}