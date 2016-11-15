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

import com.bep.startup.model.domain.type.ProjectStageIndicador;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@StaticMetamodel(MeetingProcedure.class)
public class MeetingProcedure_ {

	public static volatile SingularAttribute<MeetingProcedure, Long> id;	
	public static volatile SingularAttribute<MeetingProcedure, Project> project;
	public static volatile SingularAttribute<MeetingProcedure, MeetingType> meetingType;
	public static volatile SingularAttribute<MeetingProcedure, ProjectStageIndicador> inProjectStage;
	public static volatile SingularAttribute<MeetingProcedure, String> descriptionLocation;
	public static volatile ListAttribute<MeetingProcedure, MeetingParticipant> meetingParticipants;
	
}