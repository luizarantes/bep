/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_PROJECT")
public class Project extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_PROJECT", nullable = false, updatable = false, precision = 12)
    @SequenceGenerator(name = "sqProject", sequenceName = "SQ_PROJECT", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sqProject", strategy = GenerationType.SEQUENCE)
    private Long id;
                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF USER
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_USER", referencedColumnName = "ID_USER", nullable = false)
    private User user;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF CONTACT PERSON THAT CAN BE UTILIZED WITH KEY MEMBER OR JUST A INVITED
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_CONTACT_PERSON_ADMIN", referencedColumnName = "ID_CONTACT_PERSON", nullable = false)
    private ContactPerson contactPersonAdmin;
                                                                                                                                                                                                            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF KEY MEMBERS OF A PROJECT
     */
    @OneToMany(mappedBy = "project")
    private List<KeyMember> keyMembers;
                                                                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF INVITE A KEY MEMBER OR OTHER CONTACT PERSON OF PROJECT
     */
    @OneToMany(mappedBy = "project")
    private List<Invite> invites;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT AND ONE OR MORE CIA
     */
    @OneToMany(mappedBy = "project")
    private List<ProjectCia> projectCias;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF HARDWARE
     */
    @OneToMany(mappedBy = "project")
    private List<Hardware> hardwares;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF SOFTWARE
     */
    @OneToMany(mappedBy = "project")
    private List<Software> softwares;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF GOAL
     */
    @OneToMany(mappedBy = "project")
    private List<Goal> goals;
                                                
    /*
     * NUMBER OF VERSION
     */
    
	@Column(name = "NR_VERSION", length = 3)
    private String numeroVersion;
                        
    /*
     * DATE OF LAST UPDATE
     */
    
    @NotNull
        
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_LAST_UPDATE", nullable = false)
    private Date dataLastUpdate;
                        
    /*
     * DESCRIPTION OF OVERVIEW
     */
    
    @NotNull
        
	@Column(name = "DS_OVERVIEW", length = 4000, nullable = false)
    private String descricaoOverview;
                        
    /*
     * NAME OF PROJECT
     */
    
    @NotNull
        
	@Column(name = "TX_NAME", length = 60, nullable = false)
    private String descricaoName;
                        
    /*
     * DESCRIPTION OF LOCATION
     */
    
	@Column(name = "TX_LOCATION", length = 255)
    private String descricaoLocation;
                                                    
    /**
     * @param id
     */
    public Project(Long id) {
        super(id);
    }

    public Project() {

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
     * ENTITY RESPONSIBLE OF INFORMATION OF USER
     *
     * @param user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF USER
     *
     * @return User
     */
    public User getUser() {
        return this.user;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF CONTACT PERSON THAT CAN BE UTILIZED WITH KEY MEMBER OR JUST A INVITED
     *
     * @param contactPersonAdmin
     */
    public void setContactPersonAdmin(ContactPerson contactPersonAdmin) {
        this.contactPersonAdmin = contactPersonAdmin;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF CONTACT PERSON THAT CAN BE UTILIZED WITH KEY MEMBER OR JUST A INVITED
     *
     * @return ContactPerson
     */
    public ContactPerson getContactPersonAdmin() {
        return this.contactPersonAdmin;
    }
                    
     
    /**
     * NUMBER OF VERSION
     *
     * @param numeroVersion
     */
    public void setNumeroVersion(String numeroVersion) {
        this.numeroVersion = numeroVersion;
    }

    /**
     * NUMBER OF VERSION
     *
     * @return String
     */
    public String getNumeroVersion() {
        return this.numeroVersion;
    }
                    
     
    /**
     * DATE OF LAST UPDATE
     *
     * @param dataLastUpdate
     */
    public void setDataLastUpdate(Date dataLastUpdate) {
        this.dataLastUpdate = dataLastUpdate;
    }

    /**
     * DATE OF LAST UPDATE
     *
     * @return Date
     */
    public Date getDataLastUpdate() {
        return this.dataLastUpdate;
    }
                    
     
    /**
     * DESCRIPTION OF OVERVIEW
     *
     * @param descricaoOverview
     */
    public void setDescricaoOverview(String descricaoOverview) {
        this.descricaoOverview = descricaoOverview;
    }

    /**
     * DESCRIPTION OF OVERVIEW
     *
     * @return String
     */
    public String getDescricaoOverview() {
        return this.descricaoOverview;
    }
                    
     
    /**
     * NAME OF PROJECT
     *
     * @param descricaoName
     */
    public void setDescricaoName(String descricaoName) {
        this.descricaoName = descricaoName;
    }

    /**
     * NAME OF PROJECT
     *
     * @return String
     */
    public String getDescricaoName() {
        return this.descricaoName;
    }
                    
     
    /**
     * DESCRIPTION OF LOCATION
     *
     * @param descricaoLocation
     */
    public void setDescricaoLocation(String descricaoLocation) {
        this.descricaoLocation = descricaoLocation;
    }

    /**
     * DESCRIPTION OF LOCATION
     *
     * @return String
     */
    public String getDescricaoLocation() {
        return this.descricaoLocation;
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
     * ENTITY RESPONSIBLE OF INFORMATION OF GOAL
     *
     * @param goals
     */
    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF GOAL
     *
     * @return List<Goal>
     */
    public List<Goal> getGoals() {
        return this.goals;
    }
    
}