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
public class PlataformaFacebookDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * PERCENTUAL DE COMPARTILHAMENTO
     */
	private Double percentualCompartilhamento;

  	/*
     * PERCENTUAL DE CURTIDA DE PAGINA
     */
	private Double percentualCurtidaPagina;

  	/*
     * PERCENTUAL DE CURTIDA DE POST
     */
	private Double percentualCurtidaPost;


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
     * PERCENTUAL DE COMPARTILHAMENTO
     *
     * @param percentualCompartilhamento
     */
    public void setPercentualCompartilhamento(Double percentualCompartilhamento) {
        this.percentualCompartilhamento = percentualCompartilhamento;
    }

    /**
     * PERCENTUAL DE COMPARTILHAMENTO
     *
     * @return Double
     */
    public Double getPercentualCompartilhamento() {
        return this.percentualCompartilhamento;
    }
             
         /**
     * PERCENTUAL DE CURTIDA DE PAGINA
     *
     * @param percentualCurtidaPagina
     */
    public void setPercentualCurtidaPagina(Double percentualCurtidaPagina) {
        this.percentualCurtidaPagina = percentualCurtidaPagina;
    }

    /**
     * PERCENTUAL DE CURTIDA DE PAGINA
     *
     * @return Double
     */
    public Double getPercentualCurtidaPagina() {
        return this.percentualCurtidaPagina;
    }
             
         /**
     * PERCENTUAL DE CURTIDA DE POST
     *
     * @param percentualCurtidaPost
     */
    public void setPercentualCurtidaPost(Double percentualCurtidaPost) {
        this.percentualCurtidaPost = percentualCurtidaPost;
    }

    /**
     * PERCENTUAL DE CURTIDA DE POST
     *
     * @return Double
     */
    public Double getPercentualCurtidaPost() {
        return this.percentualCurtidaPost;
    }
     
}