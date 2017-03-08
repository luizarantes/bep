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
public class HardwareTypeDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF HARDWARE TYPE
     */
	private String nomeHardwareType;


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
     * NAME OF HARDWARE TYPE
     *
     * @param nomeHardwareType
     */
    public void setNomeHardwareType(String nomeHardwareType) {
        this.nomeHardwareType = nomeHardwareType;
    }

    /**
     * NAME OF HARDWARE TYPE
     *
     * @return String
     */
    public String getNomeHardwareType() {
        return this.nomeHardwareType;
    }
     
}