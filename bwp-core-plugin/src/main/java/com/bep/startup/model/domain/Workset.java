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
@Table(name = "TB_WORKSET")
public class Workset extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_WORKSET", nullable = false, updatable = false, precision = 12)
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
     * ENTITY RESPONSIBLE OF WORKSET TYPE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_WORKSET_TYPE", referencedColumnName = "ID_WORKSET_TYPE", nullable = false)
    private WorksetType worksetType;
                                                                                                        
    /*
     * DESCRIPTION OF WORKSET
     */
    
	@Column(name = "DS_WORKSET", length = 255)
    private String descriptionWorkset;
            
    /**
     * @param id
     */
    public Workset(Long id) {
        super(id);
    }

    public Workset() {

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
     * ENTITY RESPONSIBLE OF WORKSET TYPE
     *
     * @param worksetType
     */
    public void setWorksetType(WorksetType worksetType) {
        this.worksetType = worksetType;
    }

    /**
     * ENTITY RESPONSIBLE OF WORKSET TYPE
     *
     * @return WorksetType
     */
    public WorksetType getWorksetType() {
        return this.worksetType;
    }
                    
     
    /**
     * DESCRIPTION OF WORKSET
     *
     * @param descriptionWorkset
     */
    public void setDescriptionWorkset(String descriptionWorkset) {
        this.descriptionWorkset = descriptionWorkset;
    }

    /**
     * DESCRIPTION OF WORKSET
     *
     * @return String
     */
    public String getDescriptionWorkset() {
        return this.descriptionWorkset;
    }
    
}