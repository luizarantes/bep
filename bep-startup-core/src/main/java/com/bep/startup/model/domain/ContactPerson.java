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
@Table(name = "TB_CONTACT_PERSON")
public class ContactPerson extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_CONTACT_PERSON", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                                                                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF KEY MEMBERS OF A PROJECT
     */
    @OneToMany(mappedBy = "contactPerson")
    private List<KeyMember> keyMembers;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF INVITE A KEY MEMBER OR OTHER CONTACT PERSON OF PROJECT
     */
    @OneToMany(mappedBy = "contactPerson")
    private List<Invite> invites;
                                                                
    /*
     * NAME OF CONTACT PERSON
     */
    
    @NotNull
        
	@Column(name = "TX_CONTACT_PERSON", length = 60, nullable = false)
    private String descriptionContactPerson;
                        
    /*
     * MAIL OF CONTACT PERSON
     */
    
    @NotNull
        
	@Column(name = "TX_MAIL", length = 60, nullable = false)
    private String descriptionMail;
                        
    /*
     * NUMBER OF MOBILE
     */
    
	@Column(name = "TX_MOBILE", length = 10)
    private String descriptionMobile;
            
    /**
     * @param id
     */
    public ContactPerson(Long id) {
        super(id);
    }

    public ContactPerson() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF INVITE A KEY MEMBER OR OTHER CONTACT PERSON OF PROJECT
     *
     * @param invites
     */
    public void setInvites(List<Invite> invites) {
        this.invites = invites;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF INVITE A KEY MEMBER OR OTHER CONTACT PERSON OF PROJECT
     *
     * @return List<Invite>
     */
    public List<Invite> getInvites() {
        return this.invites;
    }
                    
     
    /**
     * NAME OF CONTACT PERSON
     *
     * @param descriptionContactPerson
     */
    public void setDescriptionContactPerson(String descriptionContactPerson) {
        this.descriptionContactPerson = descriptionContactPerson;
    }

    /**
     * NAME OF CONTACT PERSON
     *
     * @return String
     */
    public String getDescriptionContactPerson() {
        return this.descriptionContactPerson;
    }
                    
     
    /**
     * MAIL OF CONTACT PERSON
     *
     * @param descriptionMail
     */
    public void setDescriptionMail(String descriptionMail) {
        this.descriptionMail = descriptionMail;
    }

    /**
     * MAIL OF CONTACT PERSON
     *
     * @return String
     */
    public String getDescriptionMail() {
        return this.descriptionMail;
    }
                    
     
    /**
     * NUMBER OF MOBILE
     *
     * @param descriptionMobile
     */
    public void setDescriptionMobile(String descriptionMobile) {
        this.descriptionMobile = descriptionMobile;
    }

    /**
     * NUMBER OF MOBILE
     *
     * @return String
     */
    public String getDescriptionMobile() {
        return this.descriptionMobile;
    }
    
}