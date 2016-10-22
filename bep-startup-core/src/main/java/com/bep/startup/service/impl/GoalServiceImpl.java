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

import com.bep.startup.data.repository.GoalRepository;
import com.bep.startup.model.domain.Goal;
import com.bep.startup.model.domain.dto.GoalDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class GoalServiceImpl extends AbstractService<T, E, ID>  {
    
    @Autowired
    private GoalRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.GoalService#save(java.lang.Object)
	 */
	public GoalDTO save(GoalDTO dto) {
		
		if(dto != null) {
			Goal entity = new Goal();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.GoalService#findOne(java.lang.Object)
	 */
	public GoalDTO findOne(Long id) {
		
		if(id != null) {
			GoalDTO dto = new GoalDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.GoalService#findAll(java.lang.Object)
	 */
	public Iterable<GoalDTO> findAll() {

		Iterable<Goal> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<GoalDTO> listResult = new ArrayList<GoalDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				GoalDTO dto = new GoalDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}