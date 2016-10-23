/**
*
* Copyright BEP STARTUP All Rights Reserved. 
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
 * @author GSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_SOFTWARE_TYPE")
public class SoftwareType extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_SOFTWARE_TYPE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF SOFTWARE
     */
    @OneToMany(mappedBy = "softwareType")
    private List<Software> softwares;
                                        
    /*
     * NAME OF SOFTWARE TYPE
     */
    
	@Column(name = "NM_SOFTWARE_TYPE", length = 255)
    private String nameSoftwareType;
            
    /**
     * @param id
     */
    public SoftwareType(Long id) {
        super(id);
    }

    public SoftwareType() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF SOFTWARE
     *
     * @param softwares
     */
    public void setSoftwares(List<Software> softwares) {
        this.softwares = softwares;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF SOFTWARE
     *
     * @return List<Software>
     */
    public List<Software> getSoftwares() {
        return this.softwares;
    }
                    
     
    /**
     * NAME OF SOFTWARE TYPE
     *
     * @param nameSoftwareType
     */
    public void setNameSoftwareType(String nameSoftwareType) {
        this.nameSoftwareType = nameSoftwareType;
    }

    /**
     * NAME OF SOFTWARE TYPE
     *
     * @return String
     */
    public String getNameSoftwareType() {
        return this.nameSoftwareType;
    }
    
}