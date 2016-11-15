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
public class QualityControlDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * DESCRIPTION OF DEFINITION
     */
	private String descriptionDefinition;

  	/*
     * DESCRIPTION OF FREQUENCY
     */
	private String descriptionFrequency;


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
     * DESCRIPTION OF DEFINITION
     *
     * @param descriptionDefinition
     */
    public void setDescriptionDefinition(String descriptionDefinition) {
        this.descriptionDefinition = descriptionDefinition;
    }

    /**
     * DESCRIPTION OF DEFINITION
     *
     * @return String
     */
    public String getDescriptionDefinition() {
        return this.descriptionDefinition;
    }
             
         /**
     * DESCRIPTION OF FREQUENCY
     *
     * @param descriptionFrequency
     */
    public void setDescriptionFrequency(String descriptionFrequency) {
        this.descriptionFrequency = descriptionFrequency;
    }

    /**
     * DESCRIPTION OF FREQUENCY
     *
     * @return String
     */
    public String getDescriptionFrequency() {
        return this.descriptionFrequency;
    }
     
}