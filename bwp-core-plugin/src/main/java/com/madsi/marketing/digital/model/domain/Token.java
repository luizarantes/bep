/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_TOKEN")
public class Token extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_TOKEN", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    /*
     * $field.comment
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_USUARIO", referencedColumnName = "ID_USUARIO", nullable = false)
    private Usuario usuario;
                                                                                                                                                                                
    /*
     * CODIGO DO TOKEN
     */
    
    @NotNull
        
	@Column(name = "CD_TOKEN", length = 255, nullable = false)
    private String codeToken;
                        
    /*
     * NUMERO DO IP DO USUARIO
     */
    
    @NotNull
        
	@Column(name = "TX_IP", length = 24, nullable = false)
    private String descriptionIp;
                        
    /*
     * USER AGENT DO USUARIO
     */
    
    @NotNull
        
	@Column(name = "TX_USER_AGENT", length = 255, nullable = false)
    private String descriptionUserAgent;
                        
    /*
     * DATA DE CRIACAO
     */
    
    @NotNull
        
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_CRIACAO", nullable = false)
    private Date dateCriacao;
                        
    /*
     * INDICATIVO DO STATUS
     */
    
	@Column(name = "IN_STATUS", length = 255)
    private String inStatus;
            
    /**
     * @param id
     */
    public Token(Long id) {
        super(id);
    }

    public Token() {

    }

    /**
     * @return Long
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }
                    
     
    /**
     * $field.comment
     *
     * @param usuario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * $field.comment
     *
     * @return Usuario
     */
    public Usuario getUsuario() {
        return this.usuario;
    }
                    
     
    /**
     * CODIGO DO TOKEN
     *
     * @param codeToken
     */
    public void setCodeToken(String codeToken) {
        this.codeToken = codeToken;
    }

    /**
     * CODIGO DO TOKEN
     *
     * @return String
     */
    public String getCodeToken() {
        return this.codeToken;
    }
                    
     
    /**
     * NUMERO DO IP DO USUARIO
     *
     * @param descriptionIp
     */
    public void setDescriptionIp(String descriptionIp) {
        this.descriptionIp = descriptionIp;
    }

    /**
     * NUMERO DO IP DO USUARIO
     *
     * @return String
     */
    public String getDescriptionIp() {
        return this.descriptionIp;
    }
                    
     
    /**
     * USER AGENT DO USUARIO
     *
     * @param descriptionUserAgent
     */
    public void setDescriptionUserAgent(String descriptionUserAgent) {
        this.descriptionUserAgent = descriptionUserAgent;
    }

    /**
     * USER AGENT DO USUARIO
     *
     * @return String
     */
    public String getDescriptionUserAgent() {
        return this.descriptionUserAgent;
    }
                    
     
    /**
     * DATA DE CRIACAO
     *
     * @param dateCriacao
     */
    public void setDateCriacao(Date dateCriacao) {
        this.dateCriacao = dateCriacao;
    }

    /**
     * DATA DE CRIACAO
     *
     * @return Date
     */
    public Date getDateCriacao() {
        return this.dateCriacao;
    }
                    
     
    /**
     * INDICATIVO DO STATUS
     *
     * @param inStatus
     */
    public void setInStatus(String inStatus) {
        this.inStatus = inStatus;
    }

    /**
     * INDICATIVO DO STATUS
     *
     * @return String
     */
    public String getInStatus() {
        return this.inStatus;
    }
    
}