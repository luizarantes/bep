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
public class CiaDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * INFORMATION OF ADDRESS
     */
	private String descriptionAddress;

  	/*
     * NAME OF CITY
     */
	private String nameCity;

  	/*
     * INFORMATION OF ZIP CODE
     */
	private String descriptionZipCode;

  	/*
     * NUMBER OF TIN(TAX PAYER) OR ATIN OR PTIN
     */
	private String descriptionTin;


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
     * INFORMATION OF ADDRESS
     *
     * @param descriptionAddress
     */
    public void setDescriptionAddress(String descriptionAddress) {
        this.descriptionAddress = descriptionAddress;
    }

    /**
     * INFORMATION OF ADDRESS
     *
     * @return String
     */
    public String getDescriptionAddress() {
        return this.descriptionAddress;
    }
             
         /**
     * NAME OF CITY
     *
     * @param nameCity
     */
    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    /**
     * NAME OF CITY
     *
     * @return String
     */
    public String getNameCity() {
        return this.nameCity;
    }
             
         /**
     * INFORMATION OF ZIP CODE
     *
     * @param descriptionZipCode
     */
    public void setDescriptionZipCode(String descriptionZipCode) {
        this.descriptionZipCode = descriptionZipCode;
    }

    /**
     * INFORMATION OF ZIP CODE
     *
     * @return String
     */
    public String getDescriptionZipCode() {
        return this.descriptionZipCode;
    }
             
         /**
     * NUMBER OF TIN(TAX PAYER) OR ATIN OR PTIN
     *
     * @param descriptionTin
     */
    public void setDescriptionTin(String descriptionTin) {
        this.descriptionTin = descriptionTin;
    }

    /**
     * NUMBER OF TIN(TAX PAYER) OR ATIN OR PTIN
     *
     * @return String
     */
    public String getDescriptionTin() {
        return this.descriptionTin;
    }
     
}