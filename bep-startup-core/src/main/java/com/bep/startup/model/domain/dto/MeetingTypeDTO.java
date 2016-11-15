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
public class MeetingTypeDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * NAME OF MEETING TYPE
     */
	private String nameMeetingType;


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
     * NAME OF MEETING TYPE
     *
     * @param nameMeetingType
     */
    public void setNameMeetingType(String nameMeetingType) {
        this.nameMeetingType = nameMeetingType;
    }

    /**
     * NAME OF MEETING TYPE
     *
     * @return String
     */
    public String getNameMeetingType() {
        return this.nameMeetingType;
    }
     
}