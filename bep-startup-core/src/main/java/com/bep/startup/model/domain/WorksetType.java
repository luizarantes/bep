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
@Table(name = "TB_WORKSET_TYPE")
public class WorksetType extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_WORKSET_TYPE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                            
    /*
     * ENTITY RESPONSIBLE OF WORKSET
     */
    @OneToMany(mappedBy = "worksetType")
    private List<Workset> worksets;
                        
    /*
     * NAME OF WORKSET TYPE
     */
    
    @NotNull
        
	@Column(name = "NM_WORKSET_TYPE", length = 255, nullable = false)
    private String nameWorksetType;
                    
    /**
     * @param id
     */
    public WorksetType(Long id) {
        super(id);
    }

    public WorksetType() {

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
     * NAME OF WORKSET TYPE
     *
     * @param nameWorksetType
     */
    public void setNameWorksetType(String nameWorksetType) {
        this.nameWorksetType = nameWorksetType;
    }

    /**
     * NAME OF WORKSET TYPE
     *
     * @return String
     */
    public String getNameWorksetType() {
        return this.nameWorksetType;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF WORKSET
     *
     * @param worksets
     */
    public void setWorksets(List<Workset> worksets) {
        this.worksets = worksets;
    }

    /**
     * ENTITY RESPONSIBLE OF WORKSET
     *
     * @return List<Workset>
     */
    public List<Workset> getWorksets() {
        return this.worksets;
    }
    
}