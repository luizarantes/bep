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
	private Double percentualVisita;

  	/*
     * PERCENTUAL DE TRAFICO
     */
	private Double percentualTrafico;

  	/*
     * PERCENTUAL DE VISITA UNICA
     */
	private Double percentualVisitaUnica;

  	/*
     * PERCENTUAL DE RANK PAGINA
     */
	private Double percentualRankPagina;


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
     * @param percentualVisita
     */
    public void setPercentualVisita(Double percentualVisita) {
        this.percentualVisita = percentualVisita;
    }

    /**
     * PERCENTUAL DE VISITA
     *
     * @return Double
     */
    public Double getPercentualVisita() {
        return this.percentualVisita;
    }
             
         /**
     * PERCENTUAL DE TRAFICO
     *
     * @param percentualTrafico
     */
    public void setPercentualTrafico(Double percentualTrafico) {
        this.percentualTrafico = percentualTrafico;
    }

    /**
     * PERCENTUAL DE TRAFICO
     *
     * @return Double
     */
    public Double getPercentualTrafico() {
        return this.percentualTrafico;
    }
             
         /**
     * PERCENTUAL DE VISITA UNICA
     *
     * @param percentualVisitaUnica
     */
    public void setPercentualVisitaUnica(Double percentualVisitaUnica) {
        this.percentualVisitaUnica = percentualVisitaUnica;
    }

    /**
     * PERCENTUAL DE VISITA UNICA
     *
     * @return Double
     */
    public Double getPercentualVisitaUnica() {
        return this.percentualVisitaUnica;
    }
             
         /**
     * PERCENTUAL DE RANK PAGINA
     *
     * @param percentualRankPagina
     */
    public void setPercentualRankPagina(Double percentualRankPagina) {
        this.percentualRankPagina = percentualRankPagina;
    }

    /**
     * PERCENTUAL DE RANK PAGINA
     *
     * @return Double
     */
    public Double getPercentualRankPagina() {
        return this.percentualRankPagina;
    }
     
}