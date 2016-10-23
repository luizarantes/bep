/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.model.domain.dto;



/** 
 *
 * @author GSI
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