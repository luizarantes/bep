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

import com.bep.startup.data.repository.SoftwareTypeRepository;
import com.bep.startup.model.domain.SoftwareType;
import com.bep.startup.model.domain.dto.SoftwareTypeDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class SoftwareTypeServiceImpl extends AbstractService<T, E, ID>  {
    
    @Autowired
    private SoftwareTypeRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.SoftwareTypeService#save(java.lang.Object)
	 */
	public SoftwareTypeDTO save(SoftwareTypeDTO dto) {
		
		if(dto != null) {
			SoftwareType entity = new SoftwareType();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.SoftwareTypeService#findOne(java.lang.Object)
	 */
	public SoftwareTypeDTO findOne(Long id) {
		
		if(id != null) {
			SoftwareTypeDTO dto = new SoftwareTypeDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.SoftwareTypeService#findAll(java.lang.Object)
	 */
	public Iterable<SoftwareTypeDTO> findAll() {

		Iterable<SoftwareType> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<SoftwareTypeDTO> listResult = new ArrayList<SoftwareTypeDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				SoftwareTypeDTO dto = new SoftwareTypeDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}