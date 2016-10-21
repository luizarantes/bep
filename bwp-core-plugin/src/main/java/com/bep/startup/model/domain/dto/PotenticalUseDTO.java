/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.dto;


import com.btg.pactual.dto.DataTransferObject;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public class PotenticalUseDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF POTENCIAL BIM USE
     */
	private String descricaoName;


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
     * @param descricaoName
     */
    public void setDescricaoName(String descricaoName) {
        this.descricaoName = descricaoName;
    }

    /**
     * NAME OF POTENCIAL BIM USE
     *
     * @return String
     */
    public String getDescricaoName() {
        return this.descricaoName;
    }
     
}