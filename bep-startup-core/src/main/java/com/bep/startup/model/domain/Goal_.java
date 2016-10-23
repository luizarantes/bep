/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.model.domain;


import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@StaticMetamodel(Goal.class)
public class Goal_ {

	public static volatile SingularAttribute<Goal, Long> id;	
	public static volatile SingularAttribute<Goal, Project> project;
	public static volatile SingularAttribute<Goal, PotenticalUse> potencialUse;
	public static volatile SingularAttribute<Goal, Discipline> discipline;
	public static volatile SingularAttribute<Goal, String> descriptionDescription;
	public static volatile SingularAttribute<Goal, String> inPriority;
	
}