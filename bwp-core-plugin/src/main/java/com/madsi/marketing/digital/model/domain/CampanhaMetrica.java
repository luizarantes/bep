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
@Table(name = "TB_CAMPANHA_METRICA")
public class CampanhaMetrica extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_CAMPANHA_METRICA", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    /*
     * ENTIDADE CAMPANHA
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_CAMPANHA", referencedColumnName = "ID_CAMPANHA", nullable = false)
    private Campanha campanha;
            
    /*
     * ENTIDADE GENERICA PLATAFORMA
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_PLATAFORMA", referencedColumnName = "ID_PLATAFORMA", nullable = false)
    private Plataforma plataforma;
                                                                    
    /*
     * ENTIDADE ALERTA
     */
    @OneToMany(mappedBy = "campanhaMetrica")
    private List<Meta> metas;
                                    
    /**
     * @param id
     */
    public CampanhaMetrica(Long id) {
        super(id);
    }

    public CampanhaMetrica() {

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
     * @param campanha
     */
    public void setCampanha(Campanha campanha) {
        this.campanha = campanha;
    }

    /**
     * ENTIDADE CAMPANHA
     *
     * @return Campanha
     */
    public Campanha getCampanha() {
        return this.campanha;
    }
                    
     
    /**
     * ENTIDADE GENERICA PLATAFORMA
     *
     * @param plataforma
     */
    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    /**
     * ENTIDADE GENERICA PLATAFORMA
     *
     * @return Plataforma
     */
    public Plataforma getPlataforma() {
        return this.plataforma;
    }
                    
     
    /**
     * ENTIDADE ALERTA
     *
     * @param metas
     */
    public void setMetas(List<Meta> metas) {
        this.metas = metas;
    }

    /**
     * ENTIDADE ALERTA
     *
     * @return List<Meta>
     */
    public List<Meta> getMetas() {
        return this.metas;
    }
    
}