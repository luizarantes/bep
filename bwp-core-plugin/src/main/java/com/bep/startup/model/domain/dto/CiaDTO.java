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
public class CiaDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * INFORMATION OF ADDRESS
     */
	private String descricaoAddress;

  	/*
     * NAME OF CITY
     */
	private String nomeCity;

  	/*
     * INFORMATION OF ZIP CODE
     */
	private String descricaoZipCode;

  	/*
     * NUMBER OF TIN(TAX PAYER) OR ATIN OR PTIN
     */
	private String descricaoTin;


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
     * @param descricaoAddress
     */
    public void setDescricaoAddress(String descricaoAddress) {
        this.descricaoAddress = descricaoAddress;
    }

    /**
     * INFORMATION OF ADDRESS
     *
     * @return String
     */
    public String getDescricaoAddress() {
        return this.descricaoAddress;
    }
             
         /**
     * NAME OF CITY
     *
     * @param nomeCity
     */
    public void setNomeCity(String nomeCity) {
        this.nomeCity = nomeCity;
    }

    /**
     * NAME OF CITY
     *
     * @return String
     */
    public String getNomeCity() {
        return this.nomeCity;
    }
             
         /**
     * INFORMATION OF ZIP CODE
     *
     * @param descricaoZipCode
     */
    public void setDescricaoZipCode(String descricaoZipCode) {
        this.descricaoZipCode = descricaoZipCode;
    }

    /**
     * INFORMATION OF ZIP CODE
     *
     * @return String
     */
    public String getDescricaoZipCode() {
        return this.descricaoZipCode;
    }
             
         /**
     * NUMBER OF TIN(TAX PAYER) OR ATIN OR PTIN
     *
     * @param descricaoTin
     */
    public void setDescricaoTin(String descricaoTin) {
        this.descricaoTin = descricaoTin;
    }

    /**
     * NUMBER OF TIN(TAX PAYER) OR ATIN OR PTIN
     *
     * @return String
     */
    public String getDescricaoTin() {
        return this.descricaoTin;
    }
     
}