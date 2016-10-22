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

import com.bep.startup.data.repository.DisciplineRepository;
import com.bep.startup.model.domain.Discipline;
import com.bep.startup.model.domain.dto.DisciplineDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class DisciplineServiceImpl extends AbstractService<DisciplineDTO, Discipline, Long>  {
    
    @Autowired
    private DisciplineRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.DisciplineService#save(java.lang.Object)
	 */
	public DisciplineDTO save(DisciplineDTO dto) {
		
		if(dto != null) {
			Discipline entity = new Discipline();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.DisciplineService#findOne(java.lang.Object)
	 */
	public DisciplineDTO findOne(Long id) {
		
		if(id != null) {
			DisciplineDTO dto = new DisciplineDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.DisciplineService#findAll(java.lang.Object)
	 */
	public Iterable<DisciplineDTO> findAll() {

		Iterable<Discipline> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<DisciplineDTO> listResult = new ArrayList<DisciplineDTO>(); 
			Iterator<Discipline> iterator  = iterableFindAll.iterator();

			while(iterator.hasNext()) {
				DisciplineDTO dto = new DisciplineDTO();
				super.copyProperties(dto, iterator.next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}