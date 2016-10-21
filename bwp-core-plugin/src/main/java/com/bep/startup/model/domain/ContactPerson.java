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
import javax.persistence.SequenceGenerator;
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
    @SequenceGenerator(name = "sqContactPerson", sequenceName = "SQ_CONTACT_PERSON", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sqContactPerson", strategy = GenerationType.SEQUENCE)
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
        
	@Column(name = "TX_NAME", length = 60, nullable = false)
    private String descricaoName;
                        
    /*
     * MAIL OF CONTACT PERSON
     */
    
    @NotNull
        
	@Column(name = "TX_MAIL", length = 60, nullable = false)
    private String descricaoMail;
                        
    /*
     * NUMBER OF MOBILE
     */
    
	@Column(name = "TX_MOBILE", length = 10)
    private String descricaoMobile;
            
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
     * @param descricaoName
     */
    public void setDescricaoName(String descricaoName) {
        this.descricaoName = descricaoName;
    }

    /**
     * NAME OF CONTACT PERSON
     *
     * @return String
     */
    public String getDescricaoName() {
        return this.descricaoName;
    }
                    
     
    /**
     * MAIL OF CONTACT PERSON
     *
     * @param descricaoMail
     */
    public void setDescricaoMail(String descricaoMail) {
        this.descricaoMail = descricaoMail;
    }

    /**
     * MAIL OF CONTACT PERSON
     *
     * @return String
     */
    public String getDescricaoMail() {
        return this.descricaoMail;
    }
                    
     
    /**
     * NUMBER OF MOBILE
     *
     * @param descricaoMobile
     */
    public void setDescricaoMobile(String descricaoMobile) {
        this.descricaoMobile = descricaoMobile;
    }

    /**
     * NUMBER OF MOBILE
     *
     * @return String
     */
    public String getDescricaoMobile() {
        return this.descricaoMobile;
    }
    
}