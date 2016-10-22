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
public class FaixaEtariaDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NOME DA FAIXA ETARIA
     */
	private String nameFaixaEtaria;

  	/*
     * NUMERO DA FAIXA INICIAL
     */
	private Short numberFaixaInicial;

  	/*
     * NUMERO DA FAIXA FINAL
     */
	private Short numberFaixaFinal;


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
     * NOME DA FAIXA ETARIA
     *
     * @param nameFaixaEtaria
     */
    public void setNameFaixaEtaria(String nameFaixaEtaria) {
        this.nameFaixaEtaria = nameFaixaEtaria;
    }

    /**
     * NOME DA FAIXA ETARIA
     *
     * @return String
     */
    public String getNameFaixaEtaria() {
        return this.nameFaixaEtaria;
    }
             
         /**
     * NUMERO DA FAIXA INICIAL
     *
     * @param numberFaixaInicial
     */
    public void setNumberFaixaInicial(Short numberFaixaInicial) {
        this.numberFaixaInicial = numberFaixaInicial;
    }

    /**
     * NUMERO DA FAIXA INICIAL
     *
     * @return Short
     */
    public Short getNumberFaixaInicial() {
        return this.numberFaixaInicial;
    }
             
         /**
     * NUMERO DA FAIXA FINAL
     *
     * @param numberFaixaFinal
     */
    public void setNumberFaixaFinal(Short numberFaixaFinal) {
        this.numberFaixaFinal = numberFaixaFinal;
    }

    /**
     * NUMERO DA FAIXA FINAL
     *
     * @return Short
     */
    public Short getNumberFaixaFinal() {
        return this.numberFaixaFinal;
    }
     
}