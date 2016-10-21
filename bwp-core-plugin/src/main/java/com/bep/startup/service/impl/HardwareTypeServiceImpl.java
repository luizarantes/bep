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

import com.bep.startup.data.repository.HardwareTypeRepository;
import com.bep.startup.model.domain.HardwareType;
import com.bep.startup.model.domain.dto.HardwareTypeDTO;
import com.bep.startup.service.HardwareTypeService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class HardwareTypeServiceImpl extends AbstractService implements HardwareTypeService<HardwareTypeDTO, HardwareType, Long> {
    
    @Autowired
    private HardwareTypeRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.HardwareTypeService#save(java.lang.Object)
	 */
	public HardwareTypeDTO save(HardwareTypeDTO dto) {
		
		if(dto != null) {
			HardwareType entity = new HardwareType();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.HardwareTypeService#findOne(java.lang.Object)
	 */
	public HardwareTypeDTO findOne(Long id) {
		
		if(id != null) {
			HardwareTypeDTO dto = new HardwareTypeDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.HardwareTypeService#findAll(java.lang.Object)
	 */
	public Iterable<HardwareTypeDTO> findAll() {

		Iterable<HardwareType> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<HardwareTypeDTO> listResult = new ArrayList<HardwareTypeDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				HardwareTypeDTO dto = new HardwareTypeDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}