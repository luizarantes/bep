/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bep.startup.data.repository.ProjectRepository;
import com.bep.startup.model.domain.Project;
import com.bep.startup.model.domain.dto.ProjectDTO;
import com.bep.startup.service.ProjectService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class ProjectServiceImpl extends AbstractService implements ProjectService<ProjectDTO, Project, Long> {
    
    @Autowired
    private ProjectRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.ProjectService#save(java.lang.Object)
	 */
	public ProjectDTO save(ProjectDTO dto) {
		
		if(dto != null) {
			Project entity = new Project();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.ProjectService#findOne(java.lang.Object)
	 */
	public ProjectDTO findOne(Long id) {
		
		if(id != null) {
			ProjectDTO dto = new ProjectDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.ProjectService#findAll(java.lang.Object)
	 */
	public Iterable<ProjectDTO> findAll() {

		Iterable<Project> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<ProjectDTO> listResult = new ArrayList<ProjectDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				ProjectDTO dto = new ProjectDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}