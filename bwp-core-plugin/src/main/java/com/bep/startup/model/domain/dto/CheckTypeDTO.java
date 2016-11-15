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
public class CheckTypeDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF CHECK TYPE
     */
	private String nameCheckType;


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
     * NAME OF CHECK TYPE
     *
     * @param nameCheckType
     */
    public void setNameCheckType(String nameCheckType) {
        this.nameCheckType = nameCheckType;
    }

    /**
     * NAME OF CHECK TYPE
     *
     * @return String
     */
    public String getNameCheckType() {
        return this.nameCheckType;
    }
     
}