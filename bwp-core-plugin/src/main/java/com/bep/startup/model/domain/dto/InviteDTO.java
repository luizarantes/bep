/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.dto;


import com.btg.pactual.dto.DataTransferObject;

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
	private String codigoInvite;


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
     * @param codigoInvite
     */
    public void setCodigoInvite(String codigoInvite) {
        this.codigoInvite = codigoInvite;
    }

    /**
     * CODE OF INVITE
     *
     * @return String
     */
    public String getCodigoInvite() {
        return this.codigoInvite;
    }
     
}