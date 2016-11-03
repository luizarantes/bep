/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_USUARIO")
public class Usuario extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_USUARIO", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                                                    
    /*
     * $field.comment
     */
    @OneToMany(mappedBy = "usuario")
    private List<Token> tokens;
                        
    /*
     * EMAIL DE ACESSO
     */
    
    @NotNull
        
	@Column(name = "TX_EMAIL", length = 60, nullable = false)
    private String descriptionEmail;
                        
    /*
     * SENHA DO USUARIO
     */
    
    @NotNull
        
	@Column(name = "TX_SENHA", length = 255, nullable = false)
    private String descriptionSenha;
                    
    /**
     * @param id
     */
    public Usuario(Long id) {
        super(id);
    }

    public Usuario() {

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
     * EMAIL DE ACESSO
     *
     * @param descriptionEmail
     */
    public void setDescriptionEmail(String descriptionEmail) {
        this.descriptionEmail = descriptionEmail;
    }

    /**
     * EMAIL DE ACESSO
     *
     * @return String
     */
    public String getDescriptionEmail() {
        return this.descriptionEmail;
    }
                    
     
    /**
     * SENHA DO USUARIO
     *
     * @param descriptionSenha
     */
    public void setDescriptionSenha(String descriptionSenha) {
        this.descriptionSenha = descriptionSenha;
    }

    /**
     * SENHA DO USUARIO
     *
     * @return String
     */
    public String getDescriptionSenha() {
        return this.descriptionSenha;
    }
                    
     
    /**
     * $field.comment
     *
     * @param tokens
     */
    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }

    /**
     * $field.comment
     *
     * @return List<Token>
     */
    public List<Token> getTokens() {
        return this.tokens;
    }
    
}