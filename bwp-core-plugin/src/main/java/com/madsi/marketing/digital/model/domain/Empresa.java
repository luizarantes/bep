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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "TB_EMPRESA")
public class Empresa extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_EMPRESA", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                    
    /*
     * ENTIDADE SEGMENTO
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_SEGMENTO", referencedColumnName = "ID_SEGMENTO", nullable = false)
    private Segmento segmento;
                                                                    
    /*
     * ENTIDADE CAMPANHA
     */
    @OneToMany(mappedBy = "empresa")
    private List<Campanha> campanhas;
                                                                
    /*
     * ENDERECO DE EMAIL
     */
    
    @NotNull
        
	@Column(name = "TX_EMAIL", length = 60, nullable = false)
    private String descriptionEmail;
                        
    /*
     * NUMERO DO TELEFONE
     */
    
    @NotNull
        
	@Column(name = "TX_TELEFONE", length = 11, nullable = false)
    private String descriptionTelefone;
            
    /**
     * @param id
     */
    public Empresa(Long id) {
        super(id);
    }

    public Empresa() {

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
     * ENTIDADE CAMPANHA
     *
     * @param campanhas
     */
    public void setCampanhas(List<Campanha> campanhas) {
        this.campanhas = campanhas;
    }

    /**
     * ENTIDADE CAMPANHA
     *
     * @return List<Campanha>
     */
    public List<Campanha> getCampanhas() {
        return this.campanhas;
    }
                    
     
    /**
     * ENTIDADE SEGMENTO
     *
     * @param segmento
     */
    public void setSegmento(Segmento segmento) {
        this.segmento = segmento;
    }

    /**
     * ENTIDADE SEGMENTO
     *
     * @return Segmento
     */
    public Segmento getSegmento() {
        return this.segmento;
    }
                    
     
    /**
     * ENDERECO DE EMAIL
     *
     * @param descriptionEmail
     */
    public void setDescriptionEmail(String descriptionEmail) {
        this.descriptionEmail = descriptionEmail;
    }

    /**
     * ENDERECO DE EMAIL
     *
     * @return String
     */
    public String getDescriptionEmail() {
        return this.descriptionEmail;
    }
                    
     
    /**
     * NUMERO DO TELEFONE
     *
     * @param descriptionTelefone
     */
    public void setDescriptionTelefone(String descriptionTelefone) {
        this.descriptionTelefone = descriptionTelefone;
    }

    /**
     * NUMERO DO TELEFONE
     *
     * @return String
     */
    public String getDescriptionTelefone() {
        return this.descriptionTelefone;
    }
    
}