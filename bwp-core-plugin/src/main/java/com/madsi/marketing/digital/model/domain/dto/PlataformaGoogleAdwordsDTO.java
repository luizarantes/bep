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
public class PlataformaGoogleAdwordsDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * PERCENTUAL DE CLIQUE IMPRESSO E CLICADO
     */
	private Double percentualCtr;

  	/*
     * PERCENTUAL DE CLIQUE
     */
	private Double percentualClique;

  	/*
     * PERCENTUAL DE ALCANCE
     */
	private Double percentualAlcance;

  	/*
     * PERCENTUAL DE CLIQUE CONVERTIDO
     */
	private Double percentualCliqueConvertido;


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
     * @param percentualCtr
     */
    public void setPercentualCtr(Double percentualCtr) {
        this.percentualCtr = percentualCtr;
    }

    /**
     * PERCENTUAL DE CLIQUE IMPRESSO E CLICADO
     *
     * @return Double
     */
    public Double getPercentualCtr() {
        return this.percentualCtr;
    }
             
         /**
     * PERCENTUAL DE CLIQUE
     *
     * @param percentualClique
     */
    public void setPercentualClique(Double percentualClique) {
        this.percentualClique = percentualClique;
    }

    /**
     * PERCENTUAL DE CLIQUE
     *
     * @return Double
     */
    public Double getPercentualClique() {
        return this.percentualClique;
    }
             
         /**
     * PERCENTUAL DE ALCANCE
     *
     * @param percentualAlcance
     */
    public void setPercentualAlcance(Double percentualAlcance) {
        this.percentualAlcance = percentualAlcance;
    }

    /**
     * PERCENTUAL DE ALCANCE
     *
     * @return Double
     */
    public Double getPercentualAlcance() {
        return this.percentualAlcance;
    }
             
         /**
     * PERCENTUAL DE CLIQUE CONVERTIDO
     *
     * @param percentualCliqueConvertido
     */
    public void setPercentualCliqueConvertido(Double percentualCliqueConvertido) {
        this.percentualCliqueConvertido = percentualCliqueConvertido;
    }

    /**
     * PERCENTUAL DE CLIQUE CONVERTIDO
     *
     * @return Double
     */
    public Double getPercentualCliqueConvertido() {
        return this.percentualCliqueConvertido;
    }
     
}