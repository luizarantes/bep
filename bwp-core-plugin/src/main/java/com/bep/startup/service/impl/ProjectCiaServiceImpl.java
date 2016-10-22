/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bep.startup.data.repository.ProjectCiaRepository;
import com.bep.startup.model.domain.ProjectCia;
import com.bep.startup.model.domain.dto.ProjectCiaDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class ProjectCiaServiceImpl extends AbstractService<ProjectCiaDTO, ProjectCia, Long>  {
    
    @Autowired
    private ProjectCiaRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.ProjectCiaService#save(java.lang.Object)
	 */
	public ProjectCiaDTO save(ProjectCiaDTO dto) {
		
		if(dto != null) {
			ProjectCia entity = new ProjectCia();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.ProjectCiaService#findOne(java.lang.Object)
	 */
	public ProjectCiaDTO findOne(Long id) {
		
		if(id != null) {
			ProjectCiaDTO dto = new ProjectCiaDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.ProjectCiaService#findAll(java.lang.Object)
	 */
	public Iterable<ProjectCiaDTO> findAll() {

		Iterable<ProjectCia> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<ProjectCiaDTO> listResult = new ArrayList<ProjectCiaDTO>(); 
			Iterator<ProjectCia> iterator  = iterableFindAll.iterator();

			while(iterator.hasNext()) {
				ProjectCiaDTO dto = new ProjectCiaDTO();
				super.copyProperties(dto, iterator.next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}