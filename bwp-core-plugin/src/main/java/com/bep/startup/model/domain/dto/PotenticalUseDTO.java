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
public class PotenticalUseDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF POTENCIAL BIM USE
     */
	private String descricaoPotencialUse;


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
     * @param descricaoPotencialUse
     */
    public void setDescricaoPotencialUse(String descricaoPotencialUse) {
        this.descricaoPotencialUse = descricaoPotencialUse;
    }

    /**
     * NAME OF POTENCIAL BIM USE
     *
     * @return String
     */
    public String getDescricaoPotencialUse() {
        return this.descricaoPotencialUse;
    }
     
}