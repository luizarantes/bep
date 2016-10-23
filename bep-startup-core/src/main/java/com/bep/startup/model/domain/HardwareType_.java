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
@StaticMetamodel(HardwareType.class)
public class HardwareType_ {

	public static volatile SingularAttribute<HardwareType, Long> id;	
	public static volatile ListAttribute<HardwareType, Hardware> hardwares;
	public static volatile SingularAttribute<HardwareType, String> nameHardwareType;
	
}