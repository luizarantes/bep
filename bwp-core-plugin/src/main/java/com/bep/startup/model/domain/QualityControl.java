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
@Table(name = "TB_QUALITY_CONTROL")
public class QualityControl extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_QUALITY_CONTROL", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF DISCIPLINE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_DISCIPLINE", referencedColumnName = "ID_DISCIPLINE", nullable = false)
    private Discipline discipline;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF SOFTWARE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_SOFTWARE", referencedColumnName = "ID_SOFTWARE", nullable = false)
    private Software software;
            
    /*
     * ENTITY RESPONSIBLE OF CHECK TYPE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_CHECK_TYPE", referencedColumnName = "ID_CHECK_TYPE", nullable = false)
    private CheckType checkType;
                                                                                                                                                        
    /*
     * DESCRIPTION OF DEFINITION
     */
    
    @NotNull
        
	@Column(name = "DS_DEFINITION", length = 255, nullable = false)
    private String descricaoDefinition;
                        
    /*
     * DESCRIPTION OF FREQUENCY
     */
    
    @NotNull
        
	@Column(name = "DS_FREQUENCY", length = 255, nullable = false)
    private String descricaoFrequency;
            
    /**
     * @param id
     */
    public QualityControl(Long id) {
        super(id);
    }

    public QualityControl() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF SOFTWARE
     *
     * @param software
     */
    public void setSoftware(Software software) {
        this.software = software;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF SOFTWARE
     *
     * @return Software
     */
    public Software getSoftware() {
        return this.software;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF CHECK TYPE
     *
     * @param checkType
     */
    public void setCheckType(CheckType checkType) {
        this.checkType = checkType;
    }

    /**
     * ENTITY RESPONSIBLE OF CHECK TYPE
     *
     * @return CheckType
     */
    public CheckType getCheckType() {
        return this.checkType;
    }
                    
     
    /**
     * DESCRIPTION OF DEFINITION
     *
     * @param descricaoDefinition
     */
    public void setDescricaoDefinition(String descricaoDefinition) {
        this.descricaoDefinition = descricaoDefinition;
    }

    /**
     * DESCRIPTION OF DEFINITION
     *
     * @return String
     */
    public String getDescricaoDefinition() {
        return this.descricaoDefinition;
    }
                    
     
    /**
     * DESCRIPTION OF FREQUENCY
     *
     * @param descricaoFrequency
     */
    public void setDescricaoFrequency(String descricaoFrequency) {
        this.descricaoFrequency = descricaoFrequency;
    }

    /**
     * DESCRIPTION OF FREQUENCY
     *
     * @return String
     */
    public String getDescricaoFrequency() {
        return this.descricaoFrequency;
    }
    
}