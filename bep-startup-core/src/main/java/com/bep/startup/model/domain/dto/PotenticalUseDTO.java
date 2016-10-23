/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.model.domain.dto;



/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
public class PotenticalUseDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF POTENCIAL BIM USE
     */
	private String descriptionPotencialUse;


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
     * NAME OF POTENCIAL BIM USE
     *
     * @param descriptionPotencialUse
     */
    public void setDescriptionPotencialUse(String descriptionPotencialUse) {
        this.descriptionPotencialUse = descriptionPotencialUse;
    }

    /**
     * NAME OF POTENCIAL BIM USE
     *
     * @return String
     */
    public String getDescriptionPotencialUse() {
        return this.descriptionPotencialUse;
    }
     
}