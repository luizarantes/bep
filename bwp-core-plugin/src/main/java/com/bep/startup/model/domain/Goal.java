/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_GOAL")
public class Goal extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_GOAL", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_PROJECT", referencedColumnName = "ID_PROJECT", nullable = false)
    private Project project;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF PONTENCIAL BIM USE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_POTENCIAL_USE", referencedColumnName = "ID_POTENCIAL_USE", nullable = false)
    private PotenticalUse potencialUse;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF DISCIPLINE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_DISCIPLINE", referencedColumnName = "ID_DISCIPLINE", nullable = false)
    private Discipline discipline;
                                                                                                                                                        
    /*
     * DESCRIPTION OF GOAL
     */
    
    @NotNull
        
	@Column(name = "DS_DESCRIPTION", length = 255, nullable = false)
    private String descriptionDescription;
                        
    /*
     * TYPE OF PRIORITY FOR EXAMPLE: PRIMARY OR SECONDARY
     */
    
	@Column(name = "IN_PRIORITY", length = 255)
    private String inPriority;
            
    /**
     * @param id
     */
    public Goal(Long id) {
        super(id);
    }

    public Goal() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     *
     * @param project
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     *
     * @return Project
     */
    public Project getProject() {
        return this.project;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF PONTENCIAL BIM USE
     *
     * @param potencialUse
     */
    public void setPotencialUse(PotenticalUse potencialUse) {
        this.potencialUse = potencialUse;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF PONTENCIAL BIM USE
     *
     * @return PotenticalUse
     */
    public PotenticalUse getPotencialUse() {
        return this.potencialUse;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF DISCIPLINE
     *
     * @param discipline
     */
    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF DISCIPLINE
     *
     * @return Discipline
     */
    public Discipline getDiscipline() {
        return this.discipline;
    }
                    
     
    /**
     * DESCRIPTION OF GOAL
     *
     * @param descriptionDescription
     */
    public void setDescriptionDescription(String descriptionDescription) {
        this.descriptionDescription = descriptionDescription;
    }

    /**
     * DESCRIPTION OF GOAL
     *
     * @return String
     */
    public String getDescriptionDescription() {
        return this.descriptionDescription;
    }
                    
     
    /**
     * TYPE OF PRIORITY FOR EXAMPLE: PRIMARY OR SECONDARY
     *
     * @param inPriority
     */
    public void setInPriority(String inPriority) {
        this.inPriority = inPriority;
    }

    /**
     * TYPE OF PRIORITY FOR EXAMPLE: PRIMARY OR SECONDARY
     *
     * @return String
     */
    public String getInPriority() {
        return this.inPriority;
    }
    
}