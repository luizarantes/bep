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
@StaticMetamodel(ProjectTeam.class)
public class ProjectTeam_ {

	public static volatile SingularAttribute<ProjectTeam, Long> id;	
	public static volatile SingularAttribute<ProjectTeam, Project> project;
	public static volatile SingularAttribute<ProjectTeam, Discipline> discipline;
	public static volatile SingularAttribute<ProjectTeam, Cia> cia;
	
}