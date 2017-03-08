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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "TB_SOFTWARE")
public class Software extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_SOFTWARE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    /*
     * ENTITY RESPONSIBLE OF BIM USE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_BIM_USE", referencedColumnName = "ID_BIM_USE", nullable = false)
    private BimUse bimUse;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_PROJECT", referencedColumnName = "ID_PROJECT", nullable = false)
    private Project project;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF SOFTWARE TYPE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_SOFTWARE_TYPE", referencedColumnName = "ID_SOFTWARE_TYPE", nullable = false)
    private SoftwareType softwareType;
                                                                                                            
    /*
     * ENTITY RESPONSIBLE OF QUALITY CONTROL
     */
    @OneToMany(mappedBy = "software")
    private List<QualityControl> qualityControls;
                                                
    /*
     * DESCRIPTION OF SOFTWARE
     */
    
	@Column(name = "DS_SOFTWARE", length = 255)
    private String descricaoSoftware;
                    
    /**
     * @param id
     */
    public Software(Long id) {
        super(id);
    }

    public Software() {

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
     * ENTITY RESPONSIBLE OF BIM USE
     *
     * @param bimUse
     */
    public void setBimUse(BimUse bimUse) {
        this.bimUse = bimUse;
    }

    /**
     * ENTITY RESPONSIBLE OF BIM USE
     *
     * @return BimUse
     */
    public BimUse getBimUse() {
        return this.bimUse;
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
     * ENTITY RESPONSIBLE OF INFORMATION OF SOFTWARE TYPE
     *
     * @param softwareType
     */
    public void setSoftwareType(SoftwareType softwareType) {
        this.softwareType = softwareType;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF SOFTWARE TYPE
     *
     * @return SoftwareType
     */
    public SoftwareType getSoftwareType() {
        return this.softwareType;
    }
                    
     
    /**
     * DESCRIPTION OF SOFTWARE
     *
     * @param descricaoSoftware
     */
    public void setDescricaoSoftware(String descricaoSoftware) {
        this.descricaoSoftware = descricaoSoftware;
    }

    /**
     * DESCRIPTION OF SOFTWARE
     *
     * @return String
     */
    public String getDescricaoSoftware() {
        return this.descricaoSoftware;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF QUALITY CONTROL
     *
     * @param qualityControls
     */
    public void setQualityControls(List<QualityControl> qualityControls) {
        this.qualityControls = qualityControls;
    }

    /**
     * ENTITY RESPONSIBLE OF QUALITY CONTROL
     *
     * @return List<QualityControl>
     */
    public List<QualityControl> getQualityControls() {
        return this.qualityControls;
    }
    
}