/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain.dto;



/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
public class GoalDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * DESCRIPTION OF GOAL
     */
	private String descriptionDescription;

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
     * @param descriptionDescription
     */
    public void setDescriptionDescription(String descriptionDescription) {
        this.descriptionDescription = descriptionDescription;
    }

    /**
     * DESCRIPTION OF GOAL
     *
     * @return String
     */
    public String getDescriptionDescription() {
        return this.descriptionDescription;
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