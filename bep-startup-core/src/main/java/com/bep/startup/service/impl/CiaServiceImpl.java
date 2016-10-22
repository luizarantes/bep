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

import com.bep.startup.data.repository.CiaRepository;
import com.bep.startup.model.domain.Cia;
import com.bep.startup.model.domain.dto.CiaDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class CiaServiceImpl extends AbstractService<T, E, ID>  {
    
    @Autowired
    private CiaRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.CiaService#save(java.lang.Object)
	 */
	public CiaDTO save(CiaDTO dto) {
		
		if(dto != null) {
			Cia entity = new Cia();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.CiaService#findOne(java.lang.Object)
	 */
	public CiaDTO findOne(Long id) {
		
		if(id != null) {
			CiaDTO dto = new CiaDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.CiaService#findAll(java.lang.Object)
	 */
	public Iterable<CiaDTO> findAll() {

		Iterable<Cia> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<CiaDTO> listResult = new ArrayList<CiaDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				CiaDTO dto = new CiaDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}