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
@Table(name = "DISCIPLINE")
public class Discipline extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_DISCIPLINE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF KEY MEMBERS OF A PROJECT
     */
    @OneToMany(mappedBy = "discipline")
    private List<KeyMember> keyMembers;
                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF GOAL
     */
    @OneToMany(mappedBy = "discipline")
    private List<Goal> goals;
                                
    /*
     * NAME OF DISCIPLINE
     */
    
    @NotNull
        
	@Column(name = "TX_NAME", length = 30, nullable = false)
    private String descricaoName;
                    
    /**
     * @param id
     */
    public Discipline(Long id) {
        super(id);
    }

    public Discipline() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF KEY MEMBERS OF A PROJECT
     *
     * @param keyMembers
     */
    public void setKeyMembers(List<KeyMember> keyMembers) {
        this.keyMembers = keyMembers;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF KEY MEMBERS OF A PROJECT
     *
     * @return List<KeyMember>
     */
    public List<KeyMember> getKeyMembers() {
        return this.keyMembers;
    }
                    
     
    /**
     * NAME OF DISCIPLINE
     *
     * @param descricaoName
     */
    public void setDescricaoName(String descricaoName) {
        this.descricaoName = descricaoName;
    }

    /**
     * NAME OF DISCIPLINE
     *
     * @return String
     */
    public String getDescricaoName() {
        return this.descricaoName;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF GOAL
     *
     * @param goals
     */
    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF GOAL
     *
     * @return List<Goal>
     */
    public List<Goal> getGoals() {
        return this.goals;
    }
    
}