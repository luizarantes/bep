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
public class DisciplineDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF DISCIPLINE
     */
	private String descriptionDiscipline;


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
     
}