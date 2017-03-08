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
	public static volatile SingularAttribute<Project, User> user;
	public static volatile SingularAttribute<Project, Project> projectContact;
	public static volatile SingularAttribute<Project, String> numeroVersion;
	public static volatile SingularAttribute<Project, Date> dataLastUpdate;
	public static volatile SingularAttribute<Project, String> descricaoOverview;
	public static volatile SingularAttribute<Project, String> descricaoName;
	public static volatile SingularAttribute<Project, String> descricaoLocation;
	public static volatile SingularAttribute<Project, byte[]> arquivoLogo;
	public static volatile SingularAttribute<Project, String> descricaoBrief;
	public static volatile ListAttribute<Project, Invite> invites;
	public static volatile ListAttribute<Project, ProjectCia> projectCias;
	public static volatile ListAttribute<Project, Hardware> hardwares;
	public static volatile ListAttribute<Project, Software> softwares;
	public static volatile ListAttribute<Project, Goal> goals;
	public static volatile ListAttribute<Project, ProjectSchedule> projectSchedules;
	public static volatile ListAttribute<Project, ProjectTeam> projectTeams;
	public static volatile ListAttribute<Project, MeetingProcedure> meetingProcedures;
	public static volatile ListAttribute<Project, Workset> worksets;
	
}