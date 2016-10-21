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
@Table(name = "TB_SOFTWARE")
public class Software extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_SOFTWARE", nullable = false, updatable = false, precision = 12)
    @SequenceGenerator(name = "sqSoftware", sequenceName = "SQ_SOFTWARE", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sqSoftware", strategy = GenerationType.SEQUENCE)
    private Long id;
            
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
     * DESCRIPTION OF SOFTWARE
     */
    
	@Column(name = "DS_DESCRIPTION", length = 255)
    private String descricaoDescription;
            
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
     * @param descricaoDescription
     */
    public void setDescricaoDescription(String descricaoDescription) {
        this.descricaoDescription = descricaoDescription;
    }

    /**
     * DESCRIPTION OF SOFTWARE
     *
     * @return String
     */
    public String getDescricaoDescription() {
        return this.descricaoDescription;
    }
    
}