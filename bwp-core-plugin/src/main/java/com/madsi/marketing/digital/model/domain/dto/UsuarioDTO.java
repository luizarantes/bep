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
public class UsuarioDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * EMAIL DE ACESSO
     */
	private String descriptionEmail;

  	/*
     * SENHA DO USUARIO
     */
	private String descriptionSenha;


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
     * EMAIL DE ACESSO
     *
     * @param descriptionEmail
     */
    public void setDescriptionEmail(String descriptionEmail) {
        this.descriptionEmail = descriptionEmail;
    }

    /**
     * EMAIL DE ACESSO
     *
     * @return String
     */
    public String getDescriptionEmail() {
        return this.descriptionEmail;
    }
             
         /**
     * SENHA DO USUARIO
     *
     * @param descriptionSenha
     */
    public void setDescriptionSenha(String descriptionSenha) {
        this.descriptionSenha = descriptionSenha;
    }

    /**
     * SENHA DO USUARIO
     *
     * @return String
     */
    public String getDescriptionSenha() {
        return this.descriptionSenha;
    }
     
}