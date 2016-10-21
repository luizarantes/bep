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
public class ContactPersonDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF CONTACT PERSON
     */
	private String descricaoName;

  	/*
     * MAIL OF CONTACT PERSON
     */
	private String descricaoMail;

  	/*
     * NUMBER OF MOBILE
     */
	private String descricaoMobile;


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
     * NAME OF CONTACT PERSON
     *
     * @param descricaoName
     */
    public void setDescricaoName(String descricaoName) {
        this.descricaoName = descricaoName;
    }

    /**
     * NAME OF CONTACT PERSON
     *
     * @return String
     */
    public String getDescricaoName() {
        return this.descricaoName;
    }
             
         /**
     * MAIL OF CONTACT PERSON
     *
     * @param descricaoMail
     */
    public void setDescricaoMail(String descricaoMail) {
        this.descricaoMail = descricaoMail;
    }

    /**
     * MAIL OF CONTACT PERSON
     *
     * @return String
     */
    public String getDescricaoMail() {
        return this.descricaoMail;
    }
             
         /**
     * NUMBER OF MOBILE
     *
     * @param descricaoMobile
     */
    public void setDescricaoMobile(String descricaoMobile) {
        this.descricaoMobile = descricaoMobile;
    }

    /**
     * NUMBER OF MOBILE
     *
     * @return String
     */
    public String getDescricaoMobile() {
        return this.descricaoMobile;
    }
     
}