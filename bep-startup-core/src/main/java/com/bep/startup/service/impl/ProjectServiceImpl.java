/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Project;
import com.bep.startup.model.domain.dto.ProjectDTO;
import com.bep.startup.service.ProjectService;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class ProjectServiceImpl extends AbstractService<ProjectDTO, Project, Long> implements ProjectService<ProjectDTO, Project, Long> {
    
	public ProjectServiceImpl() {
    	super(ProjectDTO.class, Project.class);
    }

}