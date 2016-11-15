/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.ProjectTeam;
import com.bep.startup.model.domain.dto.ProjectTeamDTO;
import com.bep.startup.service.ProjectTeamService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class ProjectTeamServiceImpl extends AbstractService<ProjectTeamDTO, ProjectTeam, Long> implements ProjectTeamService<ProjectTeamDTO, ProjectTeam, Long> {
    
     public  ProjectTeamServiceImpl() {
    	super(ProjectTeamDTO.class, ProjectTeam.class);
    }
}