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
public class InviteDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * CODE OF INVITE
     */
	private String codeInvite;


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
     * CODE OF INVITE
     *
     * @param codeInvite
     */
    public void setCodeInvite(String codeInvite) {
        this.codeInvite = codeInvite;
    }

    /**
     * CODE OF INVITE
     *
     * @return String
     */
    public String getCodeInvite() {
        return this.codeInvite;
    }
     
}