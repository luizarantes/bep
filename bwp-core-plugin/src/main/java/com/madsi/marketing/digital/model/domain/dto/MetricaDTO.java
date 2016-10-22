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
public class MetricaDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NOME DA METRICA
     */
	private String nameMetrica;


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
     * NOME DA METRICA
     *
     * @param nameMetrica
     */
    public void setNameMetrica(String nameMetrica) {
        this.nameMetrica = nameMetrica;
    }

    /**
     * NOME DA METRICA
     *
     * @return String
     */
    public String getNameMetrica() {
        return this.nameMetrica;
    }
     
}