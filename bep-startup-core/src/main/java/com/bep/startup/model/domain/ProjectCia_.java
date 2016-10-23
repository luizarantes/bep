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
@StaticMetamodel(ProjectCia.class)
public class ProjectCia_ {

	public static volatile SingularAttribute<ProjectCia, Long> id;	
	public static volatile SingularAttribute<ProjectCia, Cia> cia;
	public static volatile SingularAttribute<ProjectCia, Project> project;
	
}