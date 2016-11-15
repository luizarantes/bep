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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_DISCIPLINE")
public class Discipline extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_DISCIPLINE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                                                                                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF KEY MEMBERS OF A PROJECT
     */
    @OneToMany(mappedBy = "discipline")
    private List<KeyMember> keyMembers;
                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF GOAL
     */
    @OneToMany(mappedBy = "discipline")
    private List<Goal> goals;
            
    /*
     * ENTITY RESPONSIBLE OF PROJECT TEAM
     */
    @OneToMany(mappedBy = "discipline")
    private List<ProjectTeam> projectTeams;
            
    /*
     * ENTITY RESPONSIBLE OF MEETING PARTICIPANT
     */
    @OneToMany(mappedBy = "discipline")
    private List<MeetingParticipant> meetingParticipants;
            
    /*
     * ENTITY RESPONSIBLE OF QUALITY CONTROL
     */
    @OneToMany(mappedBy = "discipline")
    private List<QualityControl> qualityControls;
                                
    /*
     * NAME OF DISCIPLINE
     */
    
    @NotNull
        
	@Column(name = "TX_DISCIPLINE", length = 30, nullable = false)
    private String descriptionDiscipline;
                                            
    /**
     * @param id
     */
    public Discipline(Long id) {
        super(id);
    }

    public Discipline() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF KEY MEMBERS OF A PROJECT
     *
     * @param keyMembers
     */
    public void setKeyMembers(List<KeyMember> keyMembers) {
        this.keyMembers = keyMembers;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF KEY MEMBERS OF A PROJECT
     *
     * @return List<KeyMember>
     */
    public List<KeyMember> getKeyMembers() {
        return this.keyMembers;
    }
                    
     
    /**
     * NAME OF DISCIPLINE
     *
     * @param descriptionDiscipline
     */
    public void setDescriptionDiscipline(String descriptionDiscipline) {
        this.descriptionDiscipline = descriptionDiscipline;
    }

    /**
     * NAME OF DISCIPLINE
     *
     * @return String
     */
    public String getDescriptionDiscipline() {
        return this.descriptionDiscipline;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF GOAL
     *
     * @param goals
     */
    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF GOAL
     *
     * @return List<Goal>
     */
    public List<Goal> getGoals() {
        return this.goals;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF PROJECT TEAM
     *
     * @param projectTeams
     */
    public void setProjectTeams(List<ProjectTeam> projectTeams) {
        this.projectTeams = projectTeams;
    }

    /**
     * ENTITY RESPONSIBLE OF PROJECT TEAM
     *
     * @return List<ProjectTeam>
     */
    public List<ProjectTeam> getProjectTeams() {
        return this.projectTeams;
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
                    
     
    /**
     * ENTITY RESPONSIBLE OF QUALITY CONTROL
     *
     * @param qualityControls
     */
    public void setQualityControls(List<QualityControl> qualityControls) {
        this.qualityControls = qualityControls;
    }

    /**
     * ENTITY RESPONSIBLE OF QUALITY CONTROL
     *
     * @return List<QualityControl>
     */
    public List<QualityControl> getQualityControls() {
        return this.qualityControls;
    }
    
}