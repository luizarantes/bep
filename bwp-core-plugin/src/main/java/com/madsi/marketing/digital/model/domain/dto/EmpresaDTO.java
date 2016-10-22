/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain.dto;



/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public class EmpresaDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * ENDERECO DE EMAIL
     */
	private String descriptionEmail;

  	/*
     * NUMERO DO TELEFONE
     */
	private String descriptionTelefone;


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
     * ENDERECO DE EMAIL
     *
     * @param descriptionEmail
     */
    public void setDescriptionEmail(String descriptionEmail) {
        this.descriptionEmail = descriptionEmail;
    }

    /**
     * ENDERECO DE EMAIL
     *
     * @return String
     */
    public String getDescriptionEmail() {
        return this.descriptionEmail;
    }
             
         /**
     * NUMERO DO TELEFONE
     *
     * @param descriptionTelefone
     */
    public void setDescriptionTelefone(String descriptionTelefone) {
        this.descriptionTelefone = descriptionTelefone;
    }

    /**
     * NUMERO DO TELEFONE
     *
     * @return String
     */
    public String getDescriptionTelefone() {
        return this.descriptionTelefone;
    }
     
}