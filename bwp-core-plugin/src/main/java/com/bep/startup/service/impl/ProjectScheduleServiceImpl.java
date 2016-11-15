/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.ProjectSchedule;
import com.bep.startup.model.domain.dto.ProjectScheduleDTO;
import com.bep.startup.service.ProjectScheduleService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class ProjectScheduleServiceImpl extends AbstractService<ProjectScheduleDTO, ProjectSchedule, Long> implements ProjectScheduleService<ProjectScheduleDTO, ProjectSchedule, Long> {
    
     public  ProjectScheduleServiceImpl() {
    	super(ProjectScheduleDTO.class, ProjectSchedule.class);
    }
}