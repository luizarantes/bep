/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.model.domain;

import java.util.Date;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@StaticMetamodel(Project.class)
public class Project_ {

	public static volatile SingularAttribute<Project, Long> id;	
	public static volatile ListAttribute<Project, KeyMember> keyMembers;
	public static volatile SingularAttribute<Project, User> user;
	public static volatile SingularAttribute<Project, ContactPerson> contactPersonAdmin;
	public static volatile SingularAttribute<Project, String> numberVersion;
	public static volatile SingularAttribute<Project, Date> dateLastUpdate;
	public static volatile SingularAttribute<Project, String> descriptionOverview;
	public static volatile SingularAttribute<Project, String> descriptionName;
	public static volatile SingularAttribute<Project, String> descriptionLocation;
	public static volatile ListAttribute<Project, Invite> invites;
	public static volatile ListAttribute<Project, ProjectCia> projectCias;
	public static volatile ListAttribute<Project, Hardware> hardwares;
	public static volatile ListAttribute<Project, Software> softwares;
	public static volatile ListAttribute<Project, Goal> goals;
	
}