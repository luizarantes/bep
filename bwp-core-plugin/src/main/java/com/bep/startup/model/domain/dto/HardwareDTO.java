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
public class HardwareDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * DESCRIPTION OF HARDWARE
     */
	private String descricaoHardware;


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
     * @param descricaoHardware
     */
    public void setDescricaoHardware(String descricaoHardware) {
        this.descricaoHardware = descricaoHardware;
    }

    /**
     * DESCRIPTION OF HARDWARE
     *
     * @return String
     */
    public String getDescricaoHardware() {
        return this.descricaoHardware;
    }
     
}