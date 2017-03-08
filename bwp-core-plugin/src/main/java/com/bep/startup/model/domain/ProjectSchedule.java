/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_PROJECT_SCHEDULE")
public class ProjectSchedule extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_PROJECT_SCHEDULE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF CIA THAT PARTICIPATE ON PROJECT
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_CIA", referencedColumnName = "ID_CIA", nullable = false)
    private Cia cia;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_PROJECT", referencedColumnName = "ID_PROJECT", nullable = false)
    private Project project;
            
    /*
     * ENTITY RESPONSIBLE OF PROJECT PHASE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_PROJECT_PHASE", referencedColumnName = "ID_PROJECT_PHASE", nullable = false)
    private ProjectPhase projectPhase;
                                                                                                                                                        
    /*
     * DATE OF ESTIMATE DELIVERY
     */
    
    @NotNull
        
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ESTIMATE_DELIVERY", nullable = false)
    private Date dataEstimateDelivery;
                        
    /*
     * PERCENT OF PROJECT PHASE
     */
    
	@Column(name = "PC_PHASE", precision = 3, nullable = false)
    private Short percentualPhase;
            
    /**
     * @param id
     */
    public ProjectSchedule(Long id) {
        super(id);
    }

    public ProjectSchedule() {

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
     * ENTITY RESPONSIBLE OF PROJECT PHASE
     *
     * @param projectPhase
     */
    public void setProjectPhase(ProjectPhase projectPhase) {
        this.projectPhase = projectPhase;
    }

    /**
     * ENTITY RESPONSIBLE OF PROJECT PHASE
     *
     * @return ProjectPhase
     */
    public ProjectPhase getProjectPhase() {
        return this.projectPhase;
    }
                    
     
    /**
     * DATE OF ESTIMATE DELIVERY
     *
     * @param dataEstimateDelivery
     */
    public void setDataEstimateDelivery(Date dataEstimateDelivery) {
        this.dataEstimateDelivery = dataEstimateDelivery;
    }

    /**
     * DATE OF ESTIMATE DELIVERY
     *
     * @return Date
     */
    public Date getDataEstimateDelivery() {
        return this.dataEstimateDelivery;
    }
                    
     
    /**
     * PERCENT OF PROJECT PHASE
     *
     * @param percentualPhase
     */
    public void setPercentualPhase(Short percentualPhase) {
        this.percentualPhase = percentualPhase;
    }

    /**
     * PERCENT OF PROJECT PHASE
     *
     * @return Short
     */
    public Short getPercentualPhase() {
        return this.percentualPhase;
    }
    
}