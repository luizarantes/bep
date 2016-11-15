/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain.dto;

import java.util.Date;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public class ProjectScheduleDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * DATE OF ESTIMATE DELIVERY
     */
	private Date dateEstimateDelivery;

  	/*
     * PERCENT OF PROJECT PHASE
     */
	private Short percentPhase;


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
     * DATE OF ESTIMATE DELIVERY
     *
     * @param dateEstimateDelivery
     */
    public void setDateEstimateDelivery(Date dateEstimateDelivery) {
        this.dateEstimateDelivery = dateEstimateDelivery;
    }

    /**
     * DATE OF ESTIMATE DELIVERY
     *
     * @return Date
     */
    public Date getDateEstimateDelivery() {
        return this.dateEstimateDelivery;
    }
             
         /**
     * PERCENT OF PROJECT PHASE
     *
     * @param percentPhase
     */
    public void setPercentPhase(Short percentPhase) {
        this.percentPhase = percentPhase;
    }

    /**
     * PERCENT OF PROJECT PHASE
     *
     * @return Short
     */
    public Short getPercentPhase() {
        return this.percentPhase;
    }
     
}