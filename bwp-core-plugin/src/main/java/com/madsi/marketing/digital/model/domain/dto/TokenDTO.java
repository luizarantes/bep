/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain.dto;

import java.util.Date;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public class TokenDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * CODIGO DO TOKEN
     */
	private String codeToken;

  	/*
     * NUMERO DO IP DO USUARIO
     */
	private String descriptionIp;

  	/*
     * USER AGENT DO USUARIO
     */
	private String descriptionUserAgent;

  	/*
     * DATA DE CRIACAO
     */
	private Date dateCriacao;

  	/*
     * INDICATIVO DO STATUS
     */
	private String inStatus;


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
     * CODIGO DO TOKEN
     *
     * @param codeToken
     */
    public void setCodeToken(String codeToken) {
        this.codeToken = codeToken;
    }

    /**
     * CODIGO DO TOKEN
     *
     * @return String
     */
    public String getCodeToken() {
        return this.codeToken;
    }
             
         /**
     * NUMERO DO IP DO USUARIO
     *
     * @param descriptionIp
     */
    public void setDescriptionIp(String descriptionIp) {
        this.descriptionIp = descriptionIp;
    }

    /**
     * NUMERO DO IP DO USUARIO
     *
     * @return String
     */
    public String getDescriptionIp() {
        return this.descriptionIp;
    }
             
         /**
     * USER AGENT DO USUARIO
     *
     * @param descriptionUserAgent
     */
    public void setDescriptionUserAgent(String descriptionUserAgent) {
        this.descriptionUserAgent = descriptionUserAgent;
    }

    /**
     * USER AGENT DO USUARIO
     *
     * @return String
     */
    public String getDescriptionUserAgent() {
        return this.descriptionUserAgent;
    }
             
         /**
     * DATA DE CRIACAO
     *
     * @param dateCriacao
     */
    public void setDateCriacao(Date dateCriacao) {
        this.dateCriacao = dateCriacao;
    }

    /**
     * DATA DE CRIACAO
     *
     * @return Date
     */
    public Date getDateCriacao() {
        return this.dateCriacao;
    }
             
         /**
     * INDICATIVO DO STATUS
     *
     * @param inStatus
     */
    public void setInStatus(String inStatus) {
        this.inStatus = inStatus;
    }

    /**
     * INDICATIVO DO STATUS
     *
     * @return String
     */
    public String getInStatus() {
        return this.inStatus;
    }
     
}