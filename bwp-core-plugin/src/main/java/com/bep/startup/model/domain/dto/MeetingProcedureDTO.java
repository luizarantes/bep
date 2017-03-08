/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain.dto;


import com.bep.startup.model.domain.type.ProjectStageIndicador;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public class MeetingProcedureDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * INDICATE OF PROJECT STAGE
     */     
	private ProjectStageIndicador inProjectStage;

  	/*
     * LOCATION OF MEETING
     */
	private String descricaoLocation;


    /**
     * @return Long
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
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
     * @param descricaoLocation
     */
    public void setDescricaoLocation(String descricaoLocation) {
        this.descricaoLocation = descricaoLocation;
    }

    /**
     * LOCATION OF MEETING
     *
     * @return String
     */
    public String getDescricaoLocation() {
        return this.descricaoLocation;
    }
     
}