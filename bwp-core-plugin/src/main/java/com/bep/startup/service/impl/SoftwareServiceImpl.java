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

import com.bep.startup.data.repository.SoftwareRepository;
import com.bep.startup.model.domain.Software;
import com.bep.startup.model.domain.dto.SoftwareDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class SoftwareServiceImpl extends AbstractService<SoftwareDTO, Software, Long>  {
    
    @Autowired
    private SoftwareRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.SoftwareService#save(java.lang.Object)
	 */
	public SoftwareDTO save(SoftwareDTO dto) {
		
		if(dto != null) {
			Software entity = new Software();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.SoftwareService#findOne(java.lang.Object)
	 */
	public SoftwareDTO findOne(Long id) {
		
		if(id != null) {
			SoftwareDTO dto = new SoftwareDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.SoftwareService#findAll(java.lang.Object)
	 */
	public Iterable<SoftwareDTO> findAll() {

		Iterable<Software> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<SoftwareDTO> listResult = new ArrayList<SoftwareDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				SoftwareDTO dto = new SoftwareDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}