/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.bep.startup.model.domain.type.ProjectStageIndicador;



/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_MEETING_PROCEDURE")
public class MeetingProcedure extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_MEETING_PROCEDURE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_PROJECT", referencedColumnName = "ID_PROJECT", nullable = false)
    private Project project;
            
    /*
     * ENTITY RESPONSIBLE OF MEETING TYPE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_MEETING_TYPE", referencedColumnName = "ID_MEETING_TYPE", nullable = false)
    private MeetingType meetingType;
                                                                                                                    
    /*
     * ENTITY RESPONSIBLE OF MEETING PARTICIPANT
     */
    @OneToMany(mappedBy = "meetingProcedure")
    private List<MeetingParticipant> meetingParticipants;
                                        
    /*
     * INDICATE OF PROJECT STAGE
     */
    
	@Enumerated(EnumType.STRING)
	@Column(name = "IN_PROJECT_STAGE", length = 255)
    private ProjectStageIndicador inProjectStage;
	                    
    /*
     * LOCATION OF MEETING
     */
    
	@Column(name = "TX_LOCATION", length = 255)
    private String descriptionLocation;
                    
    /**
     * @param id
     */
    public MeetingProcedure(Long id) {
        super(id);
    }

    public MeetingProcedure() {

    }

    /**
     * @return Long
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     *
     * @param project
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     *
     * @return Project
     */
    public Project getProject() {
        return this.project;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF MEETING TYPE
     *
     * @param meetingType
     */
    public void setMeetingType(MeetingType meetingType) {
        this.meetingType = meetingType;
    }

    /**
     * ENTITY RESPONSIBLE OF MEETING TYPE
     *
     * @return MeetingType
     */
    public MeetingType getMeetingType() {
        return this.meetingType;
    }
                    
     
    /**
     * INDICATE OF PROJECT STAGE
     *
     * @param inProjectStage
     */
    public void setInProjectStage(ProjectStageIndicador inProjectStage) {
        this.inProjectStage = inProjectStage;
    }

    /**
     * INDICATE OF PROJECT STAGE
     *
     * @return ProjectStageIndicador
     */
    public ProjectStageIndicador getInProjectStage() {
         return this.inProjectStage;
    }
                
     
    /**
     * LOCATION OF MEETING
     *
     * @param descriptionLocation
     */
    public void setDescriptionLocation(String descriptionLocation) {
        this.descriptionLocation = descriptionLocation;
    }

    /**
     * LOCATION OF MEETING
     *
     * @return String
     */
    public String getDescriptionLocation() {
        return this.descriptionLocation;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF MEETING PARTICIPANT
     *
     * @param meetingParticipants
     */
    public void setMeetingParticipants(List<MeetingParticipant> meetingParticipants) {
        this.meetingParticipants = meetingParticipants;
    }

    /**
     * ENTITY RESPONSIBLE OF MEETING PARTICIPANT
     *
     * @return List<MeetingParticipant>
     */
    public List<MeetingParticipant> getMeetingParticipants() {
        return this.meetingParticipants;
    }
    
}