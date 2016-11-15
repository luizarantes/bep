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
@StaticMetamodel(Discipline.class)
public class Discipline_ {

	public static volatile SingularAttribute<Discipline, Long> id;	
	public static volatile ListAttribute<Discipline, KeyMember> keyMembers;
	public static volatile SingularAttribute<Discipline, String> descriptionDiscipline;
	public static volatile ListAttribute<Discipline, Goal> goals;
	public static volatile ListAttribute<Discipline, ProjectTeam> projectTeams;
	public static volatile ListAttribute<Discipline, MeetingParticipant> meetingParticipants;
	public static volatile ListAttribute<Discipline, QualityControl> qualityControls;
	
}