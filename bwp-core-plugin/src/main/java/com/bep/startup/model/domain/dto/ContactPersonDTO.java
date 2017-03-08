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
public class ContactPersonDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF CONTACT PERSON
     */
	private String descricaoContactPerson;

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
     * @param descricaoContactPerson
     */
    public void setDescricaoContactPerson(String descricaoContactPerson) {
        this.descricaoContactPerson = descricaoContactPerson;
    }

    /**
     * NAME OF CONTACT PERSON
     *
     * @return String
     */
    public String getDescricaoContactPerson() {
        return this.descricaoContactPerson;
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