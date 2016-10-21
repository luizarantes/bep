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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_OBJETIVO")
public class Objetivo extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_OBJETIVO", nullable = false, updatable = false, precision = 12)
    @SequenceGenerator(name = "sqObjetivo", sequenceName = "SQ_OBJETIVO", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sqObjetivo", strategy = GenerationType.SEQUENCE)
    private Long id;
                                                    
    /*
     * ENTIDADE CAMPANHA
     */
    @OneToMany(mappedBy = "objetivo")
    private List<Campanha> campanhas;
                                        
    /*
     * NOME DO OBJETIVO
     */
    
    @NotNull
        
	@Column(name = "NM_OBJETIVO", length = 255, nullable = false)
    private String nomeObjetivo;
            
    /**
     * @param id
     */
    public Objetivo(Long id) {
        super(id);
    }

    public Objetivo() {

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
     * NOME DO OBJETIVO
     *
     * @param nomeObjetivo
     */
    public void setNomeObjetivo(String nomeObjetivo) {
        this.nomeObjetivo = nomeObjetivo;
    }

    /**
     * NOME DO OBJETIVO
     *
     * @return String
     */
    public String getNomeObjetivo() {
        return this.nomeObjetivo;
    }
    
}