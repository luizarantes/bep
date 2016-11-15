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
@Table(name = "TB_PROJECT_TEAM")
public class ProjectTeam extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_PROJECT_TEAM", nullable = false, updatable = false, precision = 12)
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
     * ENTITY RESPONSIBLE OF INFORMATION OF DISCIPLINE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_DISCIPLINE", referencedColumnName = "ID_DISCIPLINE", nullable = false)
    private Discipline discipline;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF CIA THAT PARTICIPATE ON PROJECT
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_CIA", referencedColumnName = "ID_CIA", nullable = false)
    private Cia cia;
                                                                                            
    /**
     * @param id
     */
    public ProjectTeam(Long id) {
        super(id);
    }

    public ProjectTeam() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF CIA THAT PARTICIPATE ON PROJECT
     *
     * @param cia
     */
    public void setCia(Cia cia) {
        this.cia = cia;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF CIA THAT PARTICIPATE ON PROJECT
     *
     * @return Cia
     */
    public Cia getCia() {
        return this.cia;
    }
    
}