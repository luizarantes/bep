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
public class ObjetivoDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NOME DO OBJETIVO
     */
	private String nomeObjetivo;


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
     * NOME DO OBJETIVO
     *
     * @param nomeObjetivo
     */
    public void setNomeObjetivo(String nomeObjetivo) {
        this.nomeObjetivo = nomeObjetivo;
    }

    /**
     * NOME DO OBJETIVO
     *
     * @return String
     */
    public String getNomeObjetivo() {
        return this.nomeObjetivo;
    }
     
}