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
@Table(name = "USER")
public class User extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_USER", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     */
    @OneToMany(mappedBy = "user")
    private List<Project> projects;
                                                
    /*
     * MAIL UTILIZED TO LOGIN
     */
    
    @NotNull
        
	@Column(name = "TX_MAIL", length = 60, nullable = false)
    private String descriptionMail;
                        
    /*
     * PASSWORD OF USER
     */
    
    @NotNull
        
	@Column(name = "TX_PASSWORD", length = 255, nullable = false)
    private String descriptionPassword;
            
    /**
     * @param id
     */
    public User(Long id) {
        super(id);
    }

    public User() {

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
     * @param projects
     */
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     *
     * @return List<Project>
     */
    public List<Project> getProjects() {
        return this.projects;
    }
                    
     
    /**
     * MAIL UTILIZED TO LOGIN
     *
     * @param descriptionMail
     */
    public void setDescriptionMail(String descriptionMail) {
        this.descriptionMail = descriptionMail;
    }

    /**
     * MAIL UTILIZED TO LOGIN
     *
     * @return String
     */
    public String getDescriptionMail() {
        return this.descriptionMail;
    }
                    
     
    /**
     * PASSWORD OF USER
     *
     * @param descriptionPassword
     */
    public void setDescriptionPassword(String descriptionPassword) {
        this.descriptionPassword = descriptionPassword;
    }

    /**
     * PASSWORD OF USER
     *
     * @return String
     */
    public String getDescriptionPassword() {
        return this.descriptionPassword;
    }
    
}