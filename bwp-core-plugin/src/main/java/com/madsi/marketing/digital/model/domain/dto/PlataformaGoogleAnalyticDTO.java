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
public class PlataformaGoogleAnalyticDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * PERCENTUAL DE VISITA
     */
	private Double percentVisita;

  	/*
     * PERCENTUAL DE TRAFICO
     */
	private Double percentTrafico;

  	/*
     * PERCENTUAL DE VISITA UNICA
     */
	private Double percentVisitaUnica;

  	/*
     * PERCENTUAL DE RANK PAGINA
     */
	private Double percentRankPagina;


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
     * PERCENTUAL DE VISITA
     *
     * @param percentVisita
     */
    public void setPercentVisita(Double percentVisita) {
        this.percentVisita = percentVisita;
    }

    /**
     * PERCENTUAL DE VISITA
     *
     * @return Double
     */
    public Double getPercentVisita() {
        return this.percentVisita;
    }
             
         /**
     * PERCENTUAL DE TRAFICO
     *
     * @param percentTrafico
     */
    public void setPercentTrafico(Double percentTrafico) {
        this.percentTrafico = percentTrafico;
    }

    /**
     * PERCENTUAL DE TRAFICO
     *
     * @return Double
     */
    public Double getPercentTrafico() {
        return this.percentTrafico;
    }
             
         /**
     * PERCENTUAL DE VISITA UNICA
     *
     * @param percentVisitaUnica
     */
    public void setPercentVisitaUnica(Double percentVisitaUnica) {
        this.percentVisitaUnica = percentVisitaUnica;
    }

    /**
     * PERCENTUAL DE VISITA UNICA
     *
     * @return Double
     */
    public Double getPercentVisitaUnica() {
        return this.percentVisitaUnica;
    }
             
         /**
     * PERCENTUAL DE RANK PAGINA
     *
     * @param percentRankPagina
     */
    public void setPercentRankPagina(Double percentRankPagina) {
        this.percentRankPagina = percentRankPagina;
    }

    /**
     * PERCENTUAL DE RANK PAGINA
     *
     * @return Double
     */
    public Double getPercentRankPagina() {
        return this.percentRankPagina;
    }
     
}