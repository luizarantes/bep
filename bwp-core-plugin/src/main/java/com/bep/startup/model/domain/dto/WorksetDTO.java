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
public class WorksetDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * DESCRIPTION OF WORKSET
     */
	private String descriptionWorkset;


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
     * DESCRIPTION OF WORKSET
     *
     * @param descriptionWorkset
     */
    public void setDescriptionWorkset(String descriptionWorkset) {
        this.descriptionWorkset = descriptionWorkset;
    }

    /**
     * DESCRIPTION OF WORKSET
     *
     * @return String
     */
    public String getDescriptionWorkset() {
        return this.descriptionWorkset;
    }
     
}