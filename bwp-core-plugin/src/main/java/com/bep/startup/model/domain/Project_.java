/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain;

import java.util.Date;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@StaticMetamodel(Project.class)
public class Project_ {

	public static volatile SingularAttribute<Project, Long> id;	
	public static volatile ListAttribute<Project, KeyMember> keyMembers;
	public static volatile SingularAttribute<Project, Short> numeroVersion;
	public static volatile SingularAttribute<Project, Date> dataLastUpdate;
	public static volatile SingularAttribute<Project, String> descricaoOverview;
	public static volatile ListAttribute<Project, Invite> invites;
	public static volatile ListAttribute<Project, ProjectCia> projectCias;
	public static volatile ListAttribute<Project, Hardware> hardwares;
	public static volatile ListAttribute<Project, Software> softwares;
	public static volatile ListAttribute<Project, Goal> goals;
	
}