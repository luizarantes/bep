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




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_PROJECT_PHASE")
public class ProjectPhase extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_PROJECT_PHASE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                    
    /*
     * ENTITY RESPONSIBLE OF PROJECT SCHEDULE
     */
    @OneToMany(mappedBy = "projectPhase")
    private List<ProjectSchedule> projectSchedules;
                                        
    /*
     * NAME OF PROJECT PHASE
     */
    
	@Column(name = "NM_PROJECT_PHASE", length = 255)
    private String nomeProjectPhase;
            
    /**
     * @param id
     */
    public ProjectPhase(Long id) {
        super(id);
    }

    public ProjectPhase() {

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
     * ENTITY RESPONSIBLE OF PROJECT SCHEDULE
     *
     * @param projectSchedules
     */
    public void setProjectSchedules(List<ProjectSchedule> projectSchedules) {
        this.projectSchedules = projectSchedules;
    }

    /**
     * ENTITY RESPONSIBLE OF PROJECT SCHEDULE
     *
     * @return List<ProjectSchedule>
     */
    public List<ProjectSchedule> getProjectSchedules() {
        return this.projectSchedules;
    }
                    
     
    /**
     * NAME OF PROJECT PHASE
     *
     * @param nomeProjectPhase
     */
    public void setNomeProjectPhase(String nomeProjectPhase) {
        this.nomeProjectPhase = nomeProjectPhase;
    }

    /**
     * NAME OF PROJECT PHASE
     *
     * @return String
     */
    public String getNomeProjectPhase() {
        return this.nomeProjectPhase;
    }
    
}