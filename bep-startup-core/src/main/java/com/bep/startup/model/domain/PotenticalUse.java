/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
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
 * @author GSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_POTENTICAL_USE")
public class PotenticalUse extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_POTENCIAL_USE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
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
        
	@Column(name = "TX_POTENCIAL_USE", length = 60, nullable = false)
    private String descriptionPotencialUse;
            
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
     * @param descriptionPotencialUse
     */
    public void setDescriptionPotencialUse(String descriptionPotencialUse) {
        this.descriptionPotencialUse = descriptionPotencialUse;
    }

    /**
     * NAME OF POTENCIAL BIM USE
     *
     * @return String
     */
    public String getDescriptionPotencialUse() {
        return this.descriptionPotencialUse;
    }
    
}