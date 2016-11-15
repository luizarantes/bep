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
@StaticMetamodel(MeetingParticipant.class)
public class MeetingParticipant_ {

	public static volatile SingularAttribute<MeetingParticipant, Long> id;	
	public static volatile SingularAttribute<MeetingParticipant, MeetingProcedure> meetingProcedure;
	public static volatile SingularAttribute<MeetingParticipant, Discipline> discipline;
	
}