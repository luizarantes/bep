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
@Table(name = "TB_HARDWARE_TYPE")
public class HardwareType extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_HARDWARE_TYPE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF HARDWARE
     */
    @OneToMany(mappedBy = "hardwareType")
    private List<Hardware> hardwares;
                                        
    /*
     * NAME OF HARDWARE TYPE
     */
    
    @NotNull
        
	@Column(name = "NM_NAME", length = 60, nullable = false)
    private String nomeName;
            
    /**
     * @param id
     */
    public HardwareType(Long id) {
        super(id);
    }

    public HardwareType() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF HARDWARE
     *
     * @param hardwares
     */
    public void setHardwares(List<Hardware> hardwares) {
        this.hardwares = hardwares;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF HARDWARE
     *
     * @return List<Hardware>
     */
    public List<Hardware> getHardwares() {
        return this.hardwares;
    }
                    
     
    /**
     * NAME OF HARDWARE TYPE
     *
     * @param nomeName
     */
    public void setNomeName(String nomeName) {
        this.nomeName = nomeName;
    }

    /**
     * NAME OF HARDWARE TYPE
     *
     * @return String
     */
    public String getNomeName() {
        return this.nomeName;
    }
    
}