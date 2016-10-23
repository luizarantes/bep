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
@Table(name = "TB_KEY_MEMBER")
public class KeyMember extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_KEY_MEMBER", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_PROJECT", referencedColumnName = "ID_PROJECT", nullable = false)
    private Project project;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF CONTACT PERSON THAT CAN BE UTILIZED WITH KEY MEMBER OR JUST A INVITED
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_CONTACT_PERSON", referencedColumnName = "ID_CONTACT_PERSON", nullable = false)
    private ContactPerson contactPerson;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF CIA THAT PARTICIPATE ON PROJECT
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_CIA", referencedColumnName = "ID_CIA", nullable = false)
    private Cia cia;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF DISCIPLINE
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_DISCIPLINE", referencedColumnName = "ID_DISCIPLINE", nullable = false)
    private Discipline discipline;
                                                                                                                    
    /**
     * @param id
     */
    public KeyMember(Long id) {
        super(id);
    }

    public KeyMember() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF CIA THAT PARTICIPATE ON PROJECT
     *
     * @param cia
     */
    public void setCia(Cia cia) {
        this.cia = cia;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF CIA THAT PARTICIPATE ON PROJECT
     *
     * @return Cia
     */
    public Cia getCia() {
        return this.cia;
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
    
}