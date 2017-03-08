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
     * ENTITY RESPONSIBLE OF PROJECT SCHEDULE
     */
    @OneToMany(mappedBy = "cia")
    private List<ProjectSchedule> projectSchedules;
            
    /*
     * ENTITY RESPONSIBLE OF PROJECT TEAM
     */
    @OneToMany(mappedBy = "cia")
    private List<ProjectTeam> projectTeams;
                                
    /*
     * INFORMATION OF ADDRESS
     */
    
	@Column(name = "TX_ADDRESS", length = 255)
    private String descricaoAddress;
                        
    /*
     * NAME OF CITY
     */
    
    @NotNull
        
	@Column(name = "NM_CITY", length = 30, nullable = false)
    private String nomeCity;
                        
    /*
     * INFORMATION OF ZIP CODE
     */
    
    @NotNull
        
	@Column(name = "TX_ZIP_CODE", length = 10, nullable = false)
    private String descricaoZipCode;
                        
    /*
     * NUMBER OF TIN(TAX PAYER) OR ATIN OR PTIN
     */
    
	@Column(name = "TX_TIN", length = 10)
    private String descricaoTin;
                                    
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
     * @param descricaoAddress
     */
    public void setDescricaoAddress(String descricaoAddress) {
        this.descricaoAddress = descricaoAddress;
    }

    /**
     * INFORMATION OF ADDRESS
     *
     * @return String
     */
    public String getDescricaoAddress() {
        return this.descricaoAddress;
    }
                    
     
    /**
     * NAME OF CITY
     *
     * @param nomeCity
     */
    public void setNomeCity(String nomeCity) {
        this.nomeCity = nomeCity;
    }

    /**
     * NAME OF CITY
     *
     * @return String
     */
    public String getNomeCity() {
        return this.nomeCity;
    }
                    
     
    /**
     * INFORMATION OF ZIP CODE
     *
     * @param descricaoZipCode
     */
    public void setDescricaoZipCode(String descricaoZipCode) {
        this.descricaoZipCode = descricaoZipCode;
    }

    /**
     * INFORMATION OF ZIP CODE
     *
     * @return String
     */
    public String getDescricaoZipCode() {
        return this.descricaoZipCode;
    }
                    
     
    /**
     * NUMBER OF TIN(TAX PAYER) OR ATIN OR PTIN
     *
     * @param descricaoTin
     */
    public void setDescricaoTin(String descricaoTin) {
        this.descricaoTin = descricaoTin;
    }

    /**
     * NUMBER OF TIN(TAX PAYER) OR ATIN OR PTIN
     *
     * @return String
     */
    public String getDescricaoTin() {
        return this.descricaoTin;
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
     * ENTITY RESPONSIBLE OF PROJECT TEAM
     *
     * @param projectTeams
     */
    public void setProjectTeams(List<ProjectTeam> projectTeams) {
        this.projectTeams = projectTeams;
    }

    /**
     * ENTITY RESPONSIBLE OF PROJECT TEAM
     *
     * @return List<ProjectTeam>
     */
    public List<ProjectTeam> getProjectTeams() {
        return this.projectTeams;
    }
    
}