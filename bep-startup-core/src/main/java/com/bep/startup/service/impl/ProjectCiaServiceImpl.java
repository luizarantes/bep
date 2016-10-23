/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.ProjectCia;
import com.bep.startup.model.domain.dto.ProjectCiaDTO;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class ProjectCiaServiceImpl extends AbstractService<ProjectCiaDTO, ProjectCia, Long>  {
    
	public ProjectCiaServiceImpl() {
    	super(ProjectCiaDTO.class, ProjectCia.class);
    }

}