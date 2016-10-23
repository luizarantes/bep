/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain.dto;



/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
public class SoftwareTypeDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF SOFTWARE TYPE
     */
	private String nameSoftwareType;


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
     * NAME OF SOFTWARE TYPE
     *
     * @param nameSoftwareType
     */
    public void setNameSoftwareType(String nameSoftwareType) {
        this.nameSoftwareType = nameSoftwareType;
    }

    /**
     * NAME OF SOFTWARE TYPE
     *
     * @return String
     */
    public String getNameSoftwareType() {
        return this.nameSoftwareType;
    }
     
}