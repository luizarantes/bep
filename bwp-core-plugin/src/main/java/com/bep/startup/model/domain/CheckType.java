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
@Table(name = "TB_CHECK_TYPE")
public class CheckType extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_CHECK_TYPE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                    
    /*
     * ENTITY RESPONSIBLE OF QUALITY CONTROL
     */
    @OneToMany(mappedBy = "checkType")
    private List<QualityControl> qualityControls;
                                        
    /*
     * NAME OF CHECK TYPE
     */
    
	@Column(name = "NM_CHECK_TYPE", length = 255)
    private String nomeCheckType;
            
    /**
     * @param id
     */
    public CheckType(Long id) {
        super(id);
    }

    public CheckType() {

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
                    
     
    /**
     * NAME OF CHECK TYPE
     *
     * @param nomeCheckType
     */
    public void setNomeCheckType(String nomeCheckType) {
        this.nomeCheckType = nomeCheckType;
    }

    /**
     * NAME OF CHECK TYPE
     *
     * @return String
     */
    public String getNomeCheckType() {
        return this.nomeCheckType;
    }
    
}