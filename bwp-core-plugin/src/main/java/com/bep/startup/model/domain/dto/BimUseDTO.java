/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain.dto;



/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public class BimUseDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF BIM USE
     */
	private String nomeBimUse;

  	/*
     * 
     */
	private String descricaoBimUse;


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
     * NAME OF BIM USE
     *
     * @param nomeBimUse
     */
    public void setNomeBimUse(String nomeBimUse) {
        this.nomeBimUse = nomeBimUse;
    }

    /**
     * NAME OF BIM USE
     *
     * @return String
     */
    public String getNomeBimUse() {
        return this.nomeBimUse;
    }
             
         /**
     * 
     *
     * @param descricaoBimUse
     */
    public void setDescricaoBimUse(String descricaoBimUse) {
        this.descricaoBimUse = descricaoBimUse;
    }

    /**
     * 
     *
     * @return String
     */
    public String getDescricaoBimUse() {
        return this.descricaoBimUse;
    }
     
}