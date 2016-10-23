/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
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
 * @author GSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_INVITE")
public class Invite extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_INVITE", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF CONTACT PERSON THAT CAN BE UTILIZED WITH KEY MEMBER OR JUST A INVITED
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_CONTACT_PERSON", referencedColumnName = "ID_CONTACT_PERSON", nullable = false)
    private ContactPerson contactPerson;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_PROJECT", referencedColumnName = "ID_PROJECT", nullable = false)
    private Project project;
                                                                                                        
    /*
     * CODE OF INVITE
     */
    
    @NotNull
        
	@Column(name = "CD_INVITE", length = 6, nullable = false)
    private String codeInvite;
            
    /**
     * @param id
     */
    public Invite(Long id) {
        super(id);
    }

    public Invite() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF CONTACT PERSON THAT CAN BE UTILIZED WITH KEY MEMBER OR JUST A INVITED
     *
     * @param contactPerson
     */
    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF CONTACT PERSON THAT CAN BE UTILIZED WITH KEY MEMBER OR JUST A INVITED
     *
     * @return ContactPerson
     */
    public ContactPerson getContactPerson() {
        return this.contactPerson;
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
     * CODE OF INVITE
     *
     * @param codeInvite
     */
    public void setCodeInvite(String codeInvite) {
        this.codeInvite = codeInvite;
    }

    /**
     * CODE OF INVITE
     *
     * @return String
     */
    public String getCodeInvite() {
        return this.codeInvite;
    }
    
}