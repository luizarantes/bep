/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_MEETING_PARTICIPANT")
public class MeetingParticipant extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_MEETING_PARTICIPANT", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    /*
     * ENTITY RESPONSIBLE OF MEETING PROCEDURE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_MEETING_PROCEDURE", referencedColumnName = "ID_MEETING_PROCEDURE", nullable = false)
    private MeetingProcedure meetingProcedure;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF DISCIPLINE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_DISCIPLINE", referencedColumnName = "ID_DISCIPLINE", nullable = false)
    private Discipline discipline;
                                                                    
    /**
     * @param id
     */
    public MeetingParticipant(Long id) {
        super(id);
    }

    public MeetingParticipant() {

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
     * ENTITY RESPONSIBLE OF MEETING PROCEDURE
     *
     * @param meetingProcedure
     */
    public void setMeetingProcedure(MeetingProcedure meetingProcedure) {
        this.meetingProcedure = meetingProcedure;
    }

    /**
     * ENTITY RESPONSIBLE OF MEETING PROCEDURE
     *
     * @return MeetingProcedure
     */
    public MeetingProcedure getMeetingProcedure() {
        return this.meetingProcedure;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF DISCIPLINE
     *
     * @param discipline
     */
    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF DISCIPLINE
     *
     * @return Discipline
     */
    public Discipline getDiscipline() {
        return this.discipline;
    }
    
}