/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.dto;


import com.btg.pactual.dto.DataTransferObject;

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
	private String nomeFaixaEtaria;

  	/*
     * NUMERO DA FAIXA INICIAL
     */
	private Short numeroFaixaInicial;

  	/*
     * NUMERO DA FAIXA FINAL
     */
	private Short numeroFaixaFinal;


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
     * @param nomeFaixaEtaria
     */
    public void setNomeFaixaEtaria(String nomeFaixaEtaria) {
        this.nomeFaixaEtaria = nomeFaixaEtaria;
    }

    /**
     * NOME DA FAIXA ETARIA
     *
     * @return String
     */
    public String getNomeFaixaEtaria() {
        return this.nomeFaixaEtaria;
    }
             
         /**
     * NUMERO DA FAIXA INICIAL
     *
     * @param numeroFaixaInicial
     */
    public void setNumeroFaixaInicial(Short numeroFaixaInicial) {
        this.numeroFaixaInicial = numeroFaixaInicial;
    }

    /**
     * NUMERO DA FAIXA INICIAL
     *
     * @return Short
     */
    public Short getNumeroFaixaInicial() {
        return this.numeroFaixaInicial;
    }
             
         /**
     * NUMERO DA FAIXA FINAL
     *
     * @param numeroFaixaFinal
     */
    public void setNumeroFaixaFinal(Short numeroFaixaFinal) {
        this.numeroFaixaFinal = numeroFaixaFinal;
    }

    /**
     * NUMERO DA FAIXA FINAL
     *
     * @return Short
     */
    public Short getNumeroFaixaFinal() {
        return this.numeroFaixaFinal;
    }
     
}