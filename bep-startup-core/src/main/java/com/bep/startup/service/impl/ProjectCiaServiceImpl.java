/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.ProjectCia;
import com.bep.startup.model.domain.dto.ProjectCiaDTO;
import com.bep.startup.service.ProjectCiaService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class ProjectCiaServiceImpl extends AbstractService<ProjectCiaDTO, ProjectCia, Long> implements ProjectCiaService<ProjectCiaDTO, ProjectCia, Long> {
    
     public  ProjectCiaServiceImpl() {
    	super(ProjectCiaDTO.class, ProjectCia.class);
    }
}