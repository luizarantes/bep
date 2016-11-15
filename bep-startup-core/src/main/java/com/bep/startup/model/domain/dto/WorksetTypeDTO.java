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
public class WorksetTypeDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF WORKSET TYPE
     */
	private String nameWorksetType;


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
     * NAME OF WORKSET TYPE
     *
     * @param nameWorksetType
     */
    public void setNameWorksetType(String nameWorksetType) {
        this.nameWorksetType = nameWorksetType;
    }

    /**
     * NAME OF WORKSET TYPE
     *
     * @return String
     */
    public String getNameWorksetType() {
        return this.nameWorksetType;
    }
     
}