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
public class HardwareDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * DESCRIPTION OF HARDWARE
     */
	private String descricaoDescription;


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
     * @param descricaoDescription
     */
    public void setDescricaoDescription(String descricaoDescription) {
        this.descricaoDescription = descricaoDescription;
    }

    /**
     * DESCRIPTION OF HARDWARE
     *
     * @return String
     */
    public String getDescricaoDescription() {
        return this.descricaoDescription;
    }
     
}