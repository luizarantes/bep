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
	private String nameHardwareType;


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
     * @param nameHardwareType
     */
    public void setNameHardwareType(String nameHardwareType) {
        this.nameHardwareType = nameHardwareType;
    }

    /**
     * NAME OF HARDWARE TYPE
     *
     * @return String
     */
    public String getNameHardwareType() {
        return this.nameHardwareType;
    }
     
}