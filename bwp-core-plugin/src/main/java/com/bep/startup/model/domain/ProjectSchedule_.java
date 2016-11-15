/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@StaticMetamodel(ProjectSchedule.class)
public class ProjectSchedule_ {

	public static volatile SingularAttribute<ProjectSchedule, Long> id;	
	public static volatile SingularAttribute<ProjectSchedule, Cia> cia;
	public static volatile SingularAttribute<ProjectSchedule, Project> project;
	public static volatile SingularAttribute<ProjectSchedule, ProjectPhase> projectPhase;
	public static volatile SingularAttribute<ProjectSchedule, Date> dateEstimateDelivery;
	public static volatile SingularAttribute<ProjectSchedule, Short> percentPhase;
	
}