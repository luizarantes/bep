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
	private String descricaoWorkset;


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
     * @param descricaoWorkset
     */
    public void setDescricaoWorkset(String descricaoWorkset) {
        this.descricaoWorkset = descricaoWorkset;
    }

    /**
     * DESCRIPTION OF WORKSET
     *
     * @return String
     */
    public String getDescricaoWorkset() {
        return this.descricaoWorkset;
    }
     
}