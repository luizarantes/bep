/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain.dto;



/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
public class HardwareDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * DESCRIPTION OF HARDWARE
     */
	private String descriptionDescription;


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
     * DESCRIPTION OF HARDWARE
     *
     * @param descriptionDescription
     */
    public void setDescriptionDescription(String descriptionDescription) {
        this.descriptionDescription = descriptionDescription;
    }

    /**
     * DESCRIPTION OF HARDWARE
     *
     * @return String
     */
    public String getDescriptionDescription() {
        return this.descriptionDescription;
    }
     
}