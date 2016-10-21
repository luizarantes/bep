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
public class SoftwareTypeDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF SOFTWARE TYPE
     */
	private String nomeName;


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
     * @param nomeName
     */
    public void setNomeName(String nomeName) {
        this.nomeName = nomeName;
    }

    /**
     * NAME OF SOFTWARE TYPE
     *
     * @return String
     */
    public String getNomeName() {
        return this.nomeName;
    }
     
}