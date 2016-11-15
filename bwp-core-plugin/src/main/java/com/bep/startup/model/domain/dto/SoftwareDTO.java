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
public class SoftwareDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * DESCRIPTION OF SOFTWARE
     */
	private String descriptionSoftware;


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
     * DESCRIPTION OF SOFTWARE
     *
     * @param descriptionSoftware
     */
    public void setDescriptionSoftware(String descriptionSoftware) {
        this.descriptionSoftware = descriptionSoftware;
    }

    /**
     * DESCRIPTION OF SOFTWARE
     *
     * @return String
     */
    public String getDescriptionSoftware() {
        return this.descriptionSoftware;
    }
     
}