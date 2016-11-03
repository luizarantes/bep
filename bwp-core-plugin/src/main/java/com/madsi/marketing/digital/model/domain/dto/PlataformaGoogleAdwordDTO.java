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
public class PlataformaGoogleAdwordDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * PERCENTUAL DE CLIQUE IMPRESSO E CLICADO
     */
	private Double percentCtr;

  	/*
     * PERCENTUAL DE CLIQUE
     */
	private Double percentClique;

  	/*
     * PERCENTUAL DE ALCANCE
     */
	private Double percentAlcance;

  	/*
     * PERCENTUAL DE CLIQUE CONVERTIDO
     */
	private Double percentCliqueConvertido;


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
     * PERCENTUAL DE CLIQUE IMPRESSO E CLICADO
     *
     * @param percentCtr
     */
    public void setPercentCtr(Double percentCtr) {
        this.percentCtr = percentCtr;
    }

    /**
     * PERCENTUAL DE CLIQUE IMPRESSO E CLICADO
     *
     * @return Double
     */
    public Double getPercentCtr() {
        return this.percentCtr;
    }
             
         /**
     * PERCENTUAL DE CLIQUE
     *
     * @param percentClique
     */
    public void setPercentClique(Double percentClique) {
        this.percentClique = percentClique;
    }

    /**
     * PERCENTUAL DE CLIQUE
     *
     * @return Double
     */
    public Double getPercentClique() {
        return this.percentClique;
    }
             
         /**
     * PERCENTUAL DE ALCANCE
     *
     * @param percentAlcance
     */
    public void setPercentAlcance(Double percentAlcance) {
        this.percentAlcance = percentAlcance;
    }

    /**
     * PERCENTUAL DE ALCANCE
     *
     * @return Double
     */
    public Double getPercentAlcance() {
        return this.percentAlcance;
    }
             
         /**
     * PERCENTUAL DE CLIQUE CONVERTIDO
     *
     * @param percentCliqueConvertido
     */
    public void setPercentCliqueConvertido(Double percentCliqueConvertido) {
        this.percentCliqueConvertido = percentCliqueConvertido;
    }

    /**
     * PERCENTUAL DE CLIQUE CONVERTIDO
     *
     * @return Double
     */
    public Double getPercentCliqueConvertido() {
        return this.percentCliqueConvertido;
    }
     
}