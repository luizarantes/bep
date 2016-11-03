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
     * NOME DA EMPRESA
     */
	private String descriptionEmpresa;

  	/*
     * NUMERO DO TELEFONE
     */
	private String descriptionTelefone;

  	/*
     * ENDERECO DE EMAIL
     */
	private String descriptionEmail;


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
     * NOME DA EMPRESA
     *
     * @param descriptionEmpresa
     */
    public void setDescriptionEmpresa(String descriptionEmpresa) {
        this.descriptionEmpresa = descriptionEmpresa;
    }

    /**
     * NOME DA EMPRESA
     *
     * @return String
     */
    public String getDescriptionEmpresa() {
        return this.descriptionEmpresa;
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
     
}