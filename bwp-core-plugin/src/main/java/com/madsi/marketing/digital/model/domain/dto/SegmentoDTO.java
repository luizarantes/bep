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
public class SegmentoDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NOME DO SEGMENTO
     */
	private String nameSegmento;


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
     * NOME DO SEGMENTO
     *
     * @param nameSegmento
     */
    public void setNameSegmento(String nameSegmento) {
        this.nameSegmento = nameSegmento;
    }

    /**
     * NOME DO SEGMENTO
     *
     * @return String
     */
    public String getNameSegmento() {
        return this.nameSegmento;
    }
     
}