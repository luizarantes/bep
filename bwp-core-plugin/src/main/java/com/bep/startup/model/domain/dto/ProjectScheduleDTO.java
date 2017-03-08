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
	private Date dataEstimateDelivery;

  	/*
     * PERCENT OF PROJECT PHASE
     */
	private Short percentualPhase;


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
     * @param dataEstimateDelivery
     */
    public void setDataEstimateDelivery(Date dataEstimateDelivery) {
        this.dataEstimateDelivery = dataEstimateDelivery;
    }

    /**
     * DATE OF ESTIMATE DELIVERY
     *
     * @return Date
     */
    public Date getDataEstimateDelivery() {
        return this.dataEstimateDelivery;
    }
             
         /**
     * PERCENT OF PROJECT PHASE
     *
     * @param percentualPhase
     */
    public void setPercentualPhase(Short percentualPhase) {
        this.percentualPhase = percentualPhase;
    }

    /**
     * PERCENT OF PROJECT PHASE
     *
     * @return Short
     */
    public Short getPercentualPhase() {
        return this.percentualPhase;
    }
     
}