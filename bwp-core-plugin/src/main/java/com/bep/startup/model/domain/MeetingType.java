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
@Table(name = "TB_MEETING_TYPE")
public class MeetingType extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_MEETING_TYPE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                            
    /*
     * ENTITY RESPONSIBLE OF MEETING PROCEDURE
     */
    @OneToMany(mappedBy = "meetingType")
    private List<MeetingProcedure> meetingProcedures;
                        
    /*
     * NAME OF MEETING TYPE
     */
    
    @NotNull
        
	@Column(name = "NM_MEETING_TYPE", length = 255, nullable = false)
    private String nomeMeetingType;
                    
    /**
     * @param id
     */
    public MeetingType(Long id) {
        super(id);
    }

    public MeetingType() {

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
     * NAME OF MEETING TYPE
     *
     * @param nomeMeetingType
     */
    public void setNomeMeetingType(String nomeMeetingType) {
        this.nomeMeetingType = nomeMeetingType;
    }

    /**
     * NAME OF MEETING TYPE
     *
     * @return String
     */
    public String getNomeMeetingType() {
        return this.nomeMeetingType;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF MEETING PROCEDURE
     *
     * @param meetingProcedures
     */
    public void setMeetingProcedures(List<MeetingProcedure> meetingProcedures) {
        this.meetingProcedures = meetingProcedures;
    }

    /**
     * ENTITY RESPONSIBLE OF MEETING PROCEDURE
     *
     * @return List<MeetingProcedure>
     */
    public List<MeetingProcedure> getMeetingProcedures() {
        return this.meetingProcedures;
    }
    
}