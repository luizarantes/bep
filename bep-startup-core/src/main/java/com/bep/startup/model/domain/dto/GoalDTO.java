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
public class GoalDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * DESCRIPTION OF GOAL
     */
	private String descriptionGoal;

  	/*
     * TYPE OF PRIORITY FOR EXAMPLE: PRIMARY OR SECONDARY
     */
	private String inPriority;


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
     * DESCRIPTION OF GOAL
     *
     * @param descriptionGoal
     */
    public void setDescriptionGoal(String descriptionGoal) {
        this.descriptionGoal = descriptionGoal;
    }

    /**
     * DESCRIPTION OF GOAL
     *
     * @return String
     */
    public String getDescriptionGoal() {
        return this.descriptionGoal;
    }
             
         /**
     * TYPE OF PRIORITY FOR EXAMPLE: PRIMARY OR SECONDARY
     *
     * @param inPriority
     */
    public void setInPriority(String inPriority) {
        this.inPriority = inPriority;
    }

    /**
     * TYPE OF PRIORITY FOR EXAMPLE: PRIMARY OR SECONDARY
     *
     * @return String
     */
    public String getInPriority() {
        return this.inPriority;
    }
     
}