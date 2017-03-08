/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain;

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
@Table(name = "TB_BIM_USE")
public class BimUse extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_BIM_USE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF SOFTWARE
     */
    @OneToMany(mappedBy = "bimUse")
    private List<Software> softwares;
                                                
    /*
     * NAME OF BIM USE
     */
    
    @NotNull
        
	@Column(name = "NM_BIM_USE", length = 255, nullable = false)
    private String nomeBimUse;
                        
    /*
     * 
     */
    
	@Column(name = "DS_BIM_USE", length = 255)
    private String descricaoBimUse;
            
    /**
     * @param id
     */
    public BimUse(Long id) {
        super(id);
    }

    public BimUse() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF SOFTWARE
     *
     * @param softwares
     */
    public void setSoftwares(List<Software> softwares) {
        this.softwares = softwares;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF SOFTWARE
     *
     * @return List<Software>
     */
    public List<Software> getSoftwares() {
        return this.softwares;
    }
                    
     
    /**
     * NAME OF BIM USE
     *
     * @param nomeBimUse
     */
    public void setNomeBimUse(String nomeBimUse) {
        this.nomeBimUse = nomeBimUse;
    }

    /**
     * NAME OF BIM USE
     *
     * @return String
     */
    public String getNomeBimUse() {
        return this.nomeBimUse;
    }
                    
     
    /**
     * 
     *
     * @param descricaoBimUse
     */
    public void setDescricaoBimUse(String descricaoBimUse) {
        this.descricaoBimUse = descricaoBimUse;
    }

    /**
     * 
     *
     * @return String
     */
    public String getDescricaoBimUse() {
        return this.descricaoBimUse;
    }
    
}