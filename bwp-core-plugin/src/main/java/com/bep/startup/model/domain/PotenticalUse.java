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
@Table(name = "TB_POTENTICAL_USE")
public class PotenticalUse extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_POTENCIAL_USE", nullable = false, updatable = false, precision = 12)
    @SequenceGenerator(name = "sqPotenticalUse", sequenceName = "SQ_POTENTICAL_USE", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sqPotenticalUse", strategy = GenerationType.SEQUENCE)
    private Long id;
                                                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF GOAL
     */
    @OneToMany(mappedBy = "potencialUse")
    private List<Goal> goalPotencialUses;
                                        
    /*
     * NAME OF POTENCIAL BIM USE
     */
    
    @NotNull
        
	@Column(name = "TX_NAME", length = 60, nullable = false)
    private String descricaoName;
            
    /**
     * @param id
     */
    public PotenticalUse(Long id) {
        super(id);
    }

    public PotenticalUse() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF GOAL
     *
     * @param goalPotencialUses
     */
    public void setGoalPotencialUses(List<Goal> goalPotencialUses) {
        this.goalPotencialUses = goalPotencialUses;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF GOAL
     *
     * @return List<Goal>
     */
    public List<Goal> getGoalPotencialUses() {
        return this.goalPotencialUses;
    }
                    
     
    /**
     * NAME OF POTENCIAL BIM USE
     *
     * @param descricaoName
     */
    public void setDescricaoName(String descricaoName) {
        this.descricaoName = descricaoName;
    }

    /**
     * NAME OF POTENCIAL BIM USE
     *
     * @return String
     */
    public String getDescricaoName() {
        return this.descricaoName;
    }
    
}