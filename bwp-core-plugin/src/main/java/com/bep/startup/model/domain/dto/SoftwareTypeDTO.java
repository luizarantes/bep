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
public class SoftwareTypeDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF SOFTWARE TYPE
     */
	private String nomeSoftwareType;


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
     * @param nomeSoftwareType
     */
    public void setNomeSoftwareType(String nomeSoftwareType) {
        this.nomeSoftwareType = nomeSoftwareType;
    }

    /**
     * NAME OF SOFTWARE TYPE
     *
     * @return String
     */
    public String getNomeSoftwareType() {
        return this.nomeSoftwareType;
    }
     
}