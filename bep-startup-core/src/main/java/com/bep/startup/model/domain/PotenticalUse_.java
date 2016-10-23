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
@StaticMetamodel(PotenticalUse.class)
public class PotenticalUse_ {

	public static volatile SingularAttribute<PotenticalUse, Long> id;	
	public static volatile ListAttribute<PotenticalUse, Goal> goalPotencialUses;
	public static volatile SingularAttribute<PotenticalUse, String> descriptionPotencialUse;
	
}