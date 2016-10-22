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

import com.bep.startup.data.repository.PotenticalUseRepository;
import com.bep.startup.model.domain.PotenticalUse;
import com.bep.startup.model.domain.dto.PotenticalUseDTO;
import com.bep.startup.service.PotenticalUseService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class PotenticalUseServiceImpl extends AbstractService implements PotenticalUseService<PotenticalUseDTO, PotenticalUse, Long> {
    
    @Autowired
    private PotenticalUseRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.PotenticalUseService#save(java.lang.Object)
	 */
	public PotenticalUseDTO save(PotenticalUseDTO dto) {
		
		if(dto != null) {
			PotenticalUse entity = new PotenticalUse();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.PotenticalUseService#findOne(java.lang.Object)
	 */
	public PotenticalUseDTO findOne(Long id) {
		
		if(id != null) {
			PotenticalUseDTO dto = new PotenticalUseDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.PotenticalUseService#findAll(java.lang.Object)
	 */
	public Iterable<PotenticalUseDTO> findAll() {

		Iterable<PotenticalUse> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<PotenticalUseDTO> listResult = new ArrayList<PotenticalUseDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				PotenticalUseDTO dto = new PotenticalUseDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}