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
public class BimUseDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF BIM USE
     */
	private String nameBimUse;

  	/*
     * 
     */
	private String descriptionBimUse;


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
     * NAME OF BIM USE
     *
     * @param nameBimUse
     */
    public void setNameBimUse(String nameBimUse) {
        this.nameBimUse = nameBimUse;
    }

    /**
     * NAME OF BIM USE
     *
     * @return String
     */
    public String getNameBimUse() {
        return this.nameBimUse;
    }
             
         /**
     * 
     *
     * @param descriptionBimUse
     */
    public void setDescriptionBimUse(String descriptionBimUse) {
        this.descriptionBimUse = descriptionBimUse;
    }

    /**
     * 
     *
     * @return String
     */
    public String getDescriptionBimUse() {
        return this.descriptionBimUse;
    }
     
}