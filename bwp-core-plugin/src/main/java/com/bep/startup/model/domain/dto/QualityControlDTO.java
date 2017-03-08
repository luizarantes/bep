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
	private String descricaoDefinition;

  	/*
     * DESCRIPTION OF FREQUENCY
     */
	private String descricaoFrequency;


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
     * @param descricaoDefinition
     */
    public void setDescricaoDefinition(String descricaoDefinition) {
        this.descricaoDefinition = descricaoDefinition;
    }

    /**
     * DESCRIPTION OF DEFINITION
     *
     * @return String
     */
    public String getDescricaoDefinition() {
        return this.descricaoDefinition;
    }
             
         /**
     * DESCRIPTION OF FREQUENCY
     *
     * @param descricaoFrequency
     */
    public void setDescricaoFrequency(String descricaoFrequency) {
        this.descricaoFrequency = descricaoFrequency;
    }

    /**
     * DESCRIPTION OF FREQUENCY
     *
     * @return String
     */
    public String getDescricaoFrequency() {
        return this.descricaoFrequency;
    }
     
}