/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.ProjectPhase;
import com.bep.startup.model.domain.dto.ProjectPhaseDTO;
import com.bep.startup.service.ProjectPhaseService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class ProjectPhaseServiceImpl extends AbstractService<ProjectPhaseDTO, ProjectPhase, Long> implements ProjectPhaseService<ProjectPhaseDTO, ProjectPhase, Long> {
    
     public  ProjectPhaseServiceImpl() {
    	super(ProjectPhaseDTO.class, ProjectPhase.class);
    }
}