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
	private String descriptionContactPerson;

  	/*
     * MAIL OF CONTACT PERSON
     */
	private String descriptionMail;

  	/*
     * NUMBER OF MOBILE
     */
	private String descriptionMobile;


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
     * @param descriptionContactPerson
     */
    public void setDescriptionContactPerson(String descriptionContactPerson) {
        this.descriptionContactPerson = descriptionContactPerson;
    }

    /**
     * NAME OF CONTACT PERSON
     *
     * @return String
     */
    public String getDescriptionContactPerson() {
        return this.descriptionContactPerson;
    }
             
         /**
     * MAIL OF CONTACT PERSON
     *
     * @param descriptionMail
     */
    public void setDescriptionMail(String descriptionMail) {
        this.descriptionMail = descriptionMail;
    }

    /**
     * MAIL OF CONTACT PERSON
     *
     * @return String
     */
    public String getDescriptionMail() {
        return this.descriptionMail;
    }
             
         /**
     * NUMBER OF MOBILE
     *
     * @param descriptionMobile
     */
    public void setDescriptionMobile(String descriptionMobile) {
        this.descriptionMobile = descriptionMobile;
    }

    /**
     * NUMBER OF MOBILE
     *
     * @return String
     */
    public String getDescriptionMobile() {
        return this.descriptionMobile;
    }
     
}