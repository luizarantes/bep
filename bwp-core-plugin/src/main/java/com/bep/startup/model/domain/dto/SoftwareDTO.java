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
	private String descricaoSoftware;


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
     * @param descricaoSoftware
     */
    public void setDescricaoSoftware(String descricaoSoftware) {
        this.descricaoSoftware = descricaoSoftware;
    }

    /**
     * DESCRIPTION OF SOFTWARE
     *
     * @return String
     */
    public String getDescricaoSoftware() {
        return this.descricaoSoftware;
    }
     
}