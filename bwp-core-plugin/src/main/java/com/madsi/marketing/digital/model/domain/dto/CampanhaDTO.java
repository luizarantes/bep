/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.dto;

import java.util.Date;

import com.btg.pactual.dto.DataTransferObject;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public class CampanhaDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NOME DA CAMPANHA
     */
	private String nomeCampanha;

  	/*
     * DESCRICACAO DO PROBLEMA
     */
	private String descricaoProblema;

  	/*
     * DATA DE INICIO DA CAMPANHA
     */
	private Date dataInicio;

  	/*
     * DATA DO FIM DA CAMPANHA
     */
	private Date dataFim;


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
     * NOME DA CAMPANHA
     *
     * @param nomeCampanha
     */
    public void setNomeCampanha(String nomeCampanha) {
        this.nomeCampanha = nomeCampanha;
    }

    /**
     * NOME DA CAMPANHA
     *
     * @return String
     */
    public String getNomeCampanha() {
        return this.nomeCampanha;
    }
             
         /**
     * DESCRICACAO DO PROBLEMA
     *
     * @param descricaoProblema
     */
    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    /**
     * DESCRICACAO DO PROBLEMA
     *
     * @return String
     */
    public String getDescricaoProblema() {
        return this.descricaoProblema;
    }
             
         /**
     * DATA DE INICIO DA CAMPANHA
     *
     * @param dataInicio
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * DATA DE INICIO DA CAMPANHA
     *
     * @return Date
     */
    public Date getDataInicio() {
        return this.dataInicio;
    }
             
         /**
     * DATA DO FIM DA CAMPANHA
     *
     * @param dataFim
     */
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * DATA DO FIM DA CAMPANHA
     *
     * @return Date
     */
    public Date getDataFim() {
        return this.dataFim;
    }
     
}