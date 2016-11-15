/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain.dto;



/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public class ProjectPhaseDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF PROJECT PHASE
     */
	private String nameProjectPhase;


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
     * NAME OF PROJECT PHASE
     *
     * @param nameProjectPhase
     */
    public void setNameProjectPhase(String nameProjectPhase) {
        this.nameProjectPhase = nameProjectPhase;
    }

    /**
     * NAME OF PROJECT PHASE
     *
     * @return String
     */
    public String getNameProjectPhase() {
        return this.nameProjectPhase;
    }
     
}