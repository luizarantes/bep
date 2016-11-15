/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                    
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF USER
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_USER", referencedColumnName = "ID_USER", nullable = false)
    private User user;
            
    /*
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_PROJECT_CONTACT", referencedColumnName = "ID_PROJECT", nullable = false)
    private Project projectContact;
                                                                                                                                                                                                                                                                                                            
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
     * ENTITY RESPONSIBLE OF PROJECT SCHEDULE
     */
    @OneToMany(mappedBy = "project")
    private List<ProjectSchedule> projectSchedules;
            
    /*
     * ENTITY RESPONSIBLE OF PROJECT TEAM
     */
    @OneToMany(mappedBy = "project")
    private List<ProjectTeam> projectTeams;
            
    /*
     * ENTITY RESPONSIBLE OF MEETING PROCEDURE
     */
    @OneToMany(mappedBy = "project")
    private List<MeetingProcedure> meetingProcedures;
            
    /*
     * ENTITY RESPONSIBLE OF WORKSET
     */
    @OneToMany(mappedBy = "project")
    private List<Workset> worksets;
                                                
    /*
     * NUMBER OF VERSION
     */
    
	@Column(name = "NR_VERSION", length = 3)
    private String numberVersion;
                        
    /*
     * DATE OF LAST UPDATE
     */
    
    @NotNull
        
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_LAST_UPDATE", nullable = false)
    private Date dateLastUpdate;
                        
    /*
     * DESCRIPTION OF OVERVIEW
     */
    
    @NotNull
        
	@Column(name = "DS_OVERVIEW", length = 4000, nullable = false)
    private String descriptionOverview;
                        
    /*
     * NAME OF PROJECT
     */
    
    @NotNull
        
	@Column(name = "TX_NAME", length = 60, nullable = false)
    private String descriptionName;
                        
    /*
     * DESCRIPTION OF LOCATION
     */
    
	@Column(name = "TX_LOCATION", length = 255)
    private String descriptionLocation;
                        
    /*
     * ARQUIVO
     */
    
@Lob
    @Basic(fetch = FetchType.LAZY)
	@Column(name = "FL_LOGO", columnDefinition = "BLOB")
    private byte[] fileLogo;
                        
    /*
     * BRIEF OF PROJECT DESCRIPTION
     */
    
	@Column(name = "DS_BRIEF", length = 255)
    private String descriptionBrief;
                                                                                    
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
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     *
     * @param projectContact
     */
    public void setProjectContact(Project projectContact) {
        this.projectContact = projectContact;
    }

    /**
     * ENTITY RESPONSIBLE OF INFORMATION OF A PROJECT
     *
     * @return Project
     */
    public Project getProjectContact() {
        return this.projectContact;
    }
                    
     
    /**
     * NUMBER OF VERSION
     *
     * @param numberVersion
     */
    public void setNumberVersion(String numberVersion) {
        this.numberVersion = numberVersion;
    }

    /**
     * NUMBER OF VERSION
     *
     * @return String
     */
    public String getNumberVersion() {
        return this.numberVersion;
    }
                    
     
    /**
     * DATE OF LAST UPDATE
     *
     * @param dateLastUpdate
     */
    public void setDateLastUpdate(Date dateLastUpdate) {
        this.dateLastUpdate = dateLastUpdate;
    }

    /**
     * DATE OF LAST UPDATE
     *
     * @return Date
     */
    public Date getDateLastUpdate() {
        return this.dateLastUpdate;
    }
                    
     
    /**
     * DESCRIPTION OF OVERVIEW
     *
     * @param descriptionOverview
     */
    public void setDescriptionOverview(String descriptionOverview) {
        this.descriptionOverview = descriptionOverview;
    }

    /**
     * DESCRIPTION OF OVERVIEW
     *
     * @return String
     */
    public String getDescriptionOverview() {
        return this.descriptionOverview;
    }
                    
     
    /**
     * NAME OF PROJECT
     *
     * @param descriptionName
     */
    public void setDescriptionName(String descriptionName) {
        this.descriptionName = descriptionName;
    }

    /**
     * NAME OF PROJECT
     *
     * @return String
     */
    public String getDescriptionName() {
        return this.descriptionName;
    }
                    
     
    /**
     * DESCRIPTION OF LOCATION
     *
     * @param descriptionLocation
     */
    public void setDescriptionLocation(String descriptionLocation) {
        this.descriptionLocation = descriptionLocation;
    }

    /**
     * DESCRIPTION OF LOCATION
     *
     * @return String
     */
    public String getDescriptionLocation() {
        return this.descriptionLocation;
    }
                    
     
    /**
     * ARQUIVO
     *
     * @param fileLogo
     */
    public void setFileLogo(byte[] fileLogo) {
        this.fileLogo = fileLogo;
    }

    /**
     * ARQUIVO
     *
     * @return byte[]
     */
    public byte[] getFileLogo() {
        return this.fileLogo;
    }
                    
     
    /**
     * BRIEF OF PROJECT DESCRIPTION
     *
     * @param descriptionBrief
     */
    public void setDescriptionBrief(String descriptionBrief) {
        this.descriptionBrief = descriptionBrief;
    }

    /**
     * BRIEF OF PROJECT DESCRIPTION
     *
     * @return String
     */
    public String getDescriptionBrief() {
        return this.descriptionBrief;
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
                    
     
    /**
     * ENTITY RESPONSIBLE OF MEETING PROCEDURE
     *
     * @param meetingProcedures
     */
    public void setMeetingProcedures(List<MeetingProcedure> meetingProcedures) {
        this.meetingProcedures = meetingProcedures;
    }

    /**
     * ENTITY RESPONSIBLE OF MEETING PROCEDURE
     *
     * @return List<MeetingProcedure>
     */
    public List<MeetingProcedure> getMeetingProcedures() {
        return this.meetingProcedures;
    }
                    
     
    /**
     * ENTITY RESPONSIBLE OF WORKSET
     *
     * @param worksets
     */
    public void setWorksets(List<Workset> worksets) {
        this.worksets = worksets;
    }

    /**
     * ENTITY RESPONSIBLE OF WORKSET
     *
     * @return List<Workset>
     */
    public List<Workset> getWorksets() {
        return this.worksets;
    }
    
}