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
public class CampanhaDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NOME DA CAMPANHA
     */
	private String nameCampanha;

  	/*
     * DESCRICACAO DO PROBLEMA
     */
	private String descriptionProblema;

  	/*
     * DATA DE INICIO DA CAMPANHA
     */
	private Date dateInicio;

  	/*
     * DATA DO FIM DA CAMPANHA
     */
	private Date dateFim;


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
     * @param nameCampanha
     */
    public void setNameCampanha(String nameCampanha) {
        this.nameCampanha = nameCampanha;
    }

    /**
     * NOME DA CAMPANHA
     *
     * @return String
     */
    public String getNameCampanha() {
        return this.nameCampanha;
    }
             
         /**
     * DESCRICACAO DO PROBLEMA
     *
     * @param descriptionProblema
     */
    public void setDescriptionProblema(String descriptionProblema) {
        this.descriptionProblema = descriptionProblema;
    }

    /**
     * DESCRICACAO DO PROBLEMA
     *
     * @return String
     */
    public String getDescriptionProblema() {
        return this.descriptionProblema;
    }
             
         /**
     * DATA DE INICIO DA CAMPANHA
     *
     * @param dateInicio
     */
    public void setDateInicio(Date dateInicio) {
        this.dateInicio = dateInicio;
    }

    /**
     * DATA DE INICIO DA CAMPANHA
     *
     * @return Date
     */
    public Date getDateInicio() {
        return this.dateInicio;
    }
             
         /**
     * DATA DO FIM DA CAMPANHA
     *
     * @param dateFim
     */
    public void setDateFim(Date dateFim) {
        this.dateFim = dateFim;
    }

    /**
     * DATA DO FIM DA CAMPANHA
     *
     * @return Date
     */
    public Date getDateFim() {
        return this.dateFim;
    }
     
}