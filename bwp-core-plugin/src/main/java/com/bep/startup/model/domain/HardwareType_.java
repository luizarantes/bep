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
@StaticMetamodel(HardwareType.class)
public class HardwareType_ {

	public static volatile SingularAttribute<HardwareType, Long> id;	
	public static volatile ListAttribute<HardwareType, Hardware> hardwares;
	public static volatile SingularAttribute<HardwareType, String> nomeHardwareType;
	
}