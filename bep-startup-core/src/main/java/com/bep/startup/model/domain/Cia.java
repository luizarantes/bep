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
import javax.validation.constraints.NotNull;




/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_CIA")
public class Cia extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_CIA", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                                                                                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF KEY MEMBERS OF A PROJECT
     */
    @OneToMany(mappedBy = "cia")
    private List<KeyMember> keyMembers;
                                            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT AND ONE OR MORE CIA
     */
    @OneToMany(mappedBy = "cia")
    private List<ProjectCia> projectCias;
                                
    /*
     * INFORMATION OF ADDRESS
     */
    
	@Column(name = "TX_ADDRESS", length = 255)
    private String descriptionAddress;
                        
    /*
     * NAME OF CITY
     */
    
    @NotNull
        
	@Column(name = "NM_CITY", length = 30, nullable = false)
    private String nameCity;
                        
    /*
     * INFORMATION OF ZIP CODE
     */
    
    @NotNull
        
	@Column(name = "TX_ZIP_CODE", length = 10, nullable = false)
    private String descriptionZipCode;
                        
    /*
     * NUMBER OF TIN(TAX PAYER) OR ATIN OR PTIN
     */
    
	@Column(name = "TX_TIN", length = 10)
    private String descriptionTin;
                    
    /**
     * @param id
     */
    public Cia(Long id) {
        super(id);
    }

    public Cia() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF KEY MEMBERS OF A PROJECT
     *
     * @param keyMembers
     */
    public void setKeyMembers(List<KeyMember> keyMembers) {
        this.keyMembers = keyMembers;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF KEY MEMBERS OF A PROJECT
     *
     * @return List<KeyMember>
     */
    public List<KeyMember> getKeyMembers() {
        return this.keyMembers;
    }
                    
     
    /**
     * INFORMATION OF ADDRESS
     *
     * @param descriptionAddress
     */
    public void setDescriptionAddress(String descriptionAddress) {
        this.descriptionAddress = descriptionAddress;
    }

    /**
     * INFORMATION OF ADDRESS
     *
     * @return String
     */
    public String getDescriptionAddress() {
        return this.descriptionAddress;
    }
                    
     
    /**
     * NAME OF CITY
     *
     * @param nameCity
     */
    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    /**
     * NAME OF CITY
     *
     * @return String
     */
    public String getNameCity() {
        return this.nameCity;
    }
                    
     
    /**
     * INFORMATION OF ZIP CODE
     *
     * @param descriptionZipCode
     */
    public void setDescriptionZipCode(String descriptionZipCode) {
        this.descriptionZipCode = descriptionZipCode;
    }

    /**
     * INFORMATION OF ZIP CODE
     *
     * @return String
     */
    public String getDescriptionZipCode() {
        return this.descriptionZipCode;
    }
                    
     
    /**
     * NUMBER OF TIN(TAX PAYER) OR ATIN OR PTIN
     *
     * @param descriptionTin
     */
    public void setDescriptionTin(String descriptionTin) {
        this.descriptionTin = descriptionTin;
    }

    /**
     * NUMBER OF TIN(TAX PAYER) OR ATIN OR PTIN
     *
     * @return String
     */
    public String getDescriptionTin() {
        return this.descriptionTin;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT AND ONE OR MORE CIA
     *
     * @param projectCias
     */
    public void setProjectCias(List<ProjectCia> projectCias) {
        this.projectCias = projectCias;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT AND ONE OR MORE CIA
     *
     * @return List<ProjectCia>
     */
    public List<ProjectCia> getProjectCias() {
        return this.projectCias;
    }
    
}