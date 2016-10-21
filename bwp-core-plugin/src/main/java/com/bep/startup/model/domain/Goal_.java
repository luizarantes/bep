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
@StaticMetamodel(Goal.class)
public class Goal_ {

	public static volatile SingularAttribute<Goal, Long> id;	
	public static volatile SingularAttribute<Goal, Project> project;
	public static volatile SingularAttribute<Goal, PotenticalUse> potencialUse;
	public static volatile SingularAttribute<Goal, Discipline> discipline;
	public static volatile SingularAttribute<Goal, String> descricaoDescription;
	public static volatile SingularAttribute<Goal, String> inPriority;
	
}