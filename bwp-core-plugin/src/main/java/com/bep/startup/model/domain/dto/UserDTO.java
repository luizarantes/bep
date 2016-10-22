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
	private String descricaoMail;

  	/*
     * PASSWORD OF USER
     */
	private String descricaoPassword;


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
     * @param descricaoMail
     */
    public void setDescricaoMail(String descricaoMail) {
        this.descricaoMail = descricaoMail;
    }

    /**
     * MAIL UTILIZED TO LOGIN
     *
     * @return String
     */
    public String getDescricaoMail() {
        return this.descricaoMail;
    }
             
         /**
     * PASSWORD OF USER
     *
     * @param descricaoPassword
     */
    public void setDescricaoPassword(String descricaoPassword) {
        this.descricaoPassword = descricaoPassword;
    }

    /**
     * PASSWORD OF USER
     *
     * @return String
     */
    public String getDescricaoPassword() {
        return this.descricaoPassword;
    }
     
}