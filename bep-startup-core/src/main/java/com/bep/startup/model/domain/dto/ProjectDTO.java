/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain.dto;

import java.util.Date;


/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
public class ProjectDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NUMBER OF VERSION
     */
	private String numberVersion;

  	/*
     * DATE OF LAST UPDATE
     */
	private Date dateLastUpdate;

  	/*
     * DESCRIPTION OF OVERVIEW
     */
	private String descriptionOverview;

  	/*
     * NAME OF PROJECT
     */
	private String descriptionName;

  	/*
     * DESCRIPTION OF LOCATION
     */
	private String descriptionLocation;


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
     * @param numberVersion
     */
    public void setNumberVersion(String numberVersion) {
        this.numberVersion = numberVersion;
    }

    /**
     * NUMBER OF VERSION
     *
     * @return String
     */
    public String getNumberVersion() {
        return this.numberVersion;
    }
             
         /**
     * DATE OF LAST UPDATE
     *
     * @param dateLastUpdate
     */
    public void setDateLastUpdate(Date dateLastUpdate) {
        this.dateLastUpdate = dateLastUpdate;
    }

    /**
     * DATE OF LAST UPDATE
     *
     * @return Date
     */
    public Date getDateLastUpdate() {
        return this.dateLastUpdate;
    }
             
         /**
     * DESCRIPTION OF OVERVIEW
     *
     * @param descriptionOverview
     */
    public void setDescriptionOverview(String descriptionOverview) {
        this.descriptionOverview = descriptionOverview;
    }

    /**
     * DESCRIPTION OF OVERVIEW
     *
     * @return String
     */
    public String getDescriptionOverview() {
        return this.descriptionOverview;
    }
             
         /**
     * NAME OF PROJECT
     *
     * @param descriptionName
     */
    public void setDescriptionName(String descriptionName) {
        this.descriptionName = descriptionName;
    }

    /**
     * NAME OF PROJECT
     *
     * @return String
     */
    public String getDescriptionName() {
        return this.descriptionName;
    }
             
         /**
     * DESCRIPTION OF LOCATION
     *
     * @param descriptionLocation
     */
    public void setDescriptionLocation(String descriptionLocation) {
        this.descriptionLocation = descriptionLocation;
    }

    /**
     * DESCRIPTION OF LOCATION
     *
     * @return String
     */
    public String getDescriptionLocation() {
        return this.descriptionLocation;
    }
     
}