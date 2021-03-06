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
public class UserDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * MAIL UTILIZED TO LOGIN
     */
	private String descriptionMail;

  	/*
     * PASSWORD OF USER
     */
	private String descriptionPassword;


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
     * MAIL UTILIZED TO LOGIN
     *
     * @param descriptionMail
     */
    public void setDescriptionMail(String descriptionMail) {
        this.descriptionMail = descriptionMail;
    }

    /**
     * MAIL UTILIZED TO LOGIN
     *
     * @return String
     */
    public String getDescriptionMail() {
        return this.descriptionMail;
    }
             
         /**
     * PASSWORD OF USER
     *
     * @param descriptionPassword
     */
    public void setDescriptionPassword(String descriptionPassword) {
        this.descriptionPassword = descriptionPassword;
    }

    /**
     * PASSWORD OF USER
     *
     * @return String
     */
    public String getDescriptionPassword() {
        return this.descriptionPassword;
    }
     
}