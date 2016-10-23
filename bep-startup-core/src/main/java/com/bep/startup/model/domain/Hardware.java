/**
*
* Copyright BEP STARTUP All Rights Reserved. 
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
 * @author GSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_HARDWARE")
public class Hardware extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_HARDWARE", nullable = false, updatable = false, precision = 12)
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
     * ENTITY RESPONSIBLE OF INFORMATION OF HARDWARE TYPE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_HARDWARE_TYPE", referencedColumnName = "ID_HARDWARE_TYPE", nullable = false)
    private HardwareType hardwareType;
                                                                                                        
    /*
     * DESCRIPTION OF HARDWARE
     */
    
	@Column(name = "DS_DESCRIPTION", length = 255)
    private String descriptionDescription;
            
    /**
     * @param id
     */
    public Hardware(Long id) {
        super(id);
    }

    public Hardware() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF HARDWARE TYPE
     *
     * @param hardwareType
     */
    public void setHardwareType(HardwareType hardwareType) {
        this.hardwareType = hardwareType;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF HARDWARE TYPE
     *
     * @return HardwareType
     */
    public HardwareType getHardwareType() {
        return this.hardwareType;
    }
                    
     
    /**
     * DESCRIPTION OF HARDWARE
     *
     * @param descriptionDescription
     */
    public void setDescriptionDescription(String descriptionDescription) {
        this.descriptionDescription = descriptionDescription;
    }

    /**
     * DESCRIPTION OF HARDWARE
     *
     * @return String
     */
    public String getDescriptionDescription() {
        return this.descriptionDescription;
    }
    
}