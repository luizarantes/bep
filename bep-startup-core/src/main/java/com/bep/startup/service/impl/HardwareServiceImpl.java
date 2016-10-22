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

import com.bep.startup.data.repository.HardwareRepository;
import com.bep.startup.model.domain.Hardware;
import com.bep.startup.model.domain.dto.HardwareDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class HardwareServiceImpl extends AbstractService<HardwareDTO, Hardware, Long>  {
    
    @Autowired
    private HardwareRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.HardwareService#save(java.lang.Object)
	 */
	public HardwareDTO save(HardwareDTO dto) {
		
		if(dto != null) {
			Hardware entity = new Hardware();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.HardwareService#findOne(java.lang.Object)
	 */
	public HardwareDTO findOne(Long id) {
		
		if(id != null) {
			HardwareDTO dto = new HardwareDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.HardwareService#findAll(java.lang.Object)
	 */
	public Iterable<HardwareDTO> findAll() {

		Iterable<Hardware> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<HardwareDTO> listResult = new ArrayList<HardwareDTO>(); 
			Iterator<HardwareType> iterator   = iterableFindAll.iterator();

			while(iterator.hasNext()) {
				HardwareDTO dto = new HardwareDTO();
				super.copyProperties(dto, iterator.next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}