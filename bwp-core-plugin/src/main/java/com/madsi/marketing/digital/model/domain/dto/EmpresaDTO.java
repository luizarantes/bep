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
	private String descricaoEmail;

  	/*
     * NUMERO DO TELEFONE
     */
	private String descricaoTelefone;


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
     * @param descricaoEmail
     */
    public void setDescricaoEmail(String descricaoEmail) {
        this.descricaoEmail = descricaoEmail;
    }

    /**
     * ENDERECO DE EMAIL
     *
     * @return String
     */
    public String getDescricaoEmail() {
        return this.descricaoEmail;
    }
             
         /**
     * NUMERO DO TELEFONE
     *
     * @param descricaoTelefone
     */
    public void setDescricaoTelefone(String descricaoTelefone) {
        this.descricaoTelefone = descricaoTelefone;
    }

    /**
     * NUMERO DO TELEFONE
     *
     * @return String
     */
    public String getDescricaoTelefone() {
        return this.descricaoTelefone;
    }
     
}