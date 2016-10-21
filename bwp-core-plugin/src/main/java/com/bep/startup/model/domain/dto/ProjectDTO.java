/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.dto;

import java.util.Date;

import com.btg.pactual.dto.DataTransferObject;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public class ProjectDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NUMBER OF VERSION
     */
	private Short numeroVersion;

  	/*
     * DATE OF LAST UPDATE
     */
	private Date dataLastUpdate;

  	/*
     * DESCRIPTION OF OVERVIEW
     */
	private String descricaoOverview;


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
     * NUMBER OF VERSION
     *
     * @param numeroVersion
     */
    public void setNumeroVersion(Short numeroVersion) {
        this.numeroVersion = numeroVersion;
    }

    /**
     * NUMBER OF VERSION
     *
     * @return Short
     */
    public Short getNumeroVersion() {
        return this.numeroVersion;
    }
             
         /**
     * DATE OF LAST UPDATE
     *
     * @param dataLastUpdate
     */
    public void setDataLastUpdate(Date dataLastUpdate) {
        this.dataLastUpdate = dataLastUpdate;
    }

    /**
     * DATE OF LAST UPDATE
     *
     * @return Date
     */
    public Date getDataLastUpdate() {
        return this.dataLastUpdate;
    }
             
         /**
     * DESCRIPTION OF OVERVIEW
     *
     * @param descricaoOverview
     */
    public void setDescricaoOverview(String descricaoOverview) {
        this.descricaoOverview = descricaoOverview;
    }

    /**
     * DESCRIPTION OF OVERVIEW
     *
     * @return String
     */
    public String getDescricaoOverview() {
        return this.descricaoOverview;
    }
     
}