/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain.dto;

import java.util.Date;

import com.madsi.marketing.digital.model.domain.type.TipoPlataformaStatusIndicador;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public class PlataformaDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NUMERO DA CONTA
     */
	private String codeConta;

  	/*
     * DATA DE INICIO
     */
	private Date dateInicio;

  	/*
     * DATA DA ATUALIZACAO
     */
	private Date dateAtualizacao;

  	/*
     * INDICATIVO DO TIPO DA PLATAFORMA
     */     
	private TipoPlataformaStatusIndicador inTipoPlataformaStatus;

  	/*
     * CODIGO DA CAMPANHA
     */
	private String codeCampanha;


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
     * NUMERO DA CONTA
     *
     * @param codeConta
     */
    public void setCodeConta(String codeConta) {
        this.codeConta = codeConta;
    }

    /**
     * NUMERO DA CONTA
     *
     * @return String
     */
    public String getCodeConta() {
        return this.codeConta;
    }
             
         /**
     * DATA DE INICIO
     *
     * @param dateInicio
     */
    public void setDateInicio(Date dateInicio) {
        this.dateInicio = dateInicio;
    }

    /**
     * DATA DE INICIO
     *
     * @return Date
     */
    public Date getDateInicio() {
        return this.dateInicio;
    }
             
         /**
     * DATA DA ATUALIZACAO
     *
     * @param dateAtualizacao
     */
    public void setDateAtualizacao(Date dateAtualizacao) {
        this.dateAtualizacao = dateAtualizacao;
    }

    /**
     * DATA DA ATUALIZACAO
     *
     * @return Date
     */
    public Date getDateAtualizacao() {
        return this.dateAtualizacao;
    }
             
     
    /**
     * INDICATIVO DO TIPO DA PLATAFORMA
     *
     * @param inTipoPlataformaStatus
     */
    public void setInTipoPlataformaStatus(TipoPlataformaStatusIndicador inTipoPlataformaStatus) {
        this.inTipoPlataformaStatus = inTipoPlataformaStatus;
    }

    /**
     * INDICATIVO DO TIPO DA PLATAFORMA
     *
     * @return TipoPlataformaStatusIndicador
     */
    public TipoPlataformaStatusIndicador getInTipoPlataformaStatus() {
        return this.inTipoPlataformaStatus;
    }
        
         /**
     * CODIGO DA CAMPANHA
     *
     * @param codeCampanha
     */
    public void setCodeCampanha(String codeCampanha) {
        this.codeCampanha = codeCampanha;
    }

    /**
     * CODIGO DA CAMPANHA
     *
     * @return String
     */
    public String getCodeCampanha() {
        return this.codeCampanha;
    }
     
}