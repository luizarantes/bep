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
	private Double percentCompartilhamento;

  	/*
     * PERCENTUAL DE CURTIDA DE PAGINA
     */
	private Double percentCurtidaPagina;

  	/*
     * PERCENTUAL DE CURTIDA DE POST
     */
	private Double percentCurtidaPost;


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
     * @param percentCompartilhamento
     */
    public void setPercentCompartilhamento(Double percentCompartilhamento) {
        this.percentCompartilhamento = percentCompartilhamento;
    }

    /**
     * PERCENTUAL DE COMPARTILHAMENTO
     *
     * @return Double
     */
    public Double getPercentCompartilhamento() {
        return this.percentCompartilhamento;
    }
             
         /**
     * PERCENTUAL DE CURTIDA DE PAGINA
     *
     * @param percentCurtidaPagina
     */
    public void setPercentCurtidaPagina(Double percentCurtidaPagina) {
        this.percentCurtidaPagina = percentCurtidaPagina;
    }

    /**
     * PERCENTUAL DE CURTIDA DE PAGINA
     *
     * @return Double
     */
    public Double getPercentCurtidaPagina() {
        return this.percentCurtidaPagina;
    }
             
         /**
     * PERCENTUAL DE CURTIDA DE POST
     *
     * @param percentCurtidaPost
     */
    public void setPercentCurtidaPost(Double percentCurtidaPost) {
        this.percentCurtidaPost = percentCurtidaPost;
    }

    /**
     * PERCENTUAL DE CURTIDA DE POST
     *
     * @return Double
     */
    public Double getPercentCurtidaPost() {
        return this.percentCurtidaPost;
    }
     
}