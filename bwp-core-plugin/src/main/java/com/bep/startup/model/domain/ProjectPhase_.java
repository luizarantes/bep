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
@StaticMetamodel(ProjectPhase.class)
public class ProjectPhase_ {

	public static volatile SingularAttribute<ProjectPhase, Long> id;	
	public static volatile ListAttribute<ProjectPhase, ProjectSchedule> projectSchedules;
	public static volatile SingularAttribute<ProjectPhase, String> nomeProjectPhase;
	
}