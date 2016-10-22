/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madsi.marketing.digital.data.repository.CampanhaRepository;
import com.madsi.marketing.digital.model.domain.Campanha;
import com.madsi.marketing.digital.model.domain.dto.CampanhaDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class CampanhaServiceImpl extends AbstractService<CampanhaDTO, Campanha, Long>  {
    
    @Autowired
    private CampanhaRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.CampanhaService#save(java.lang.Object)
	 */
	public CampanhaDTO save(CampanhaDTO dto) {
		
		if(dto != null) {
			Campanha entity = new Campanha();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.CampanhaService#findOne(java.lang.Object)
	 */
	public CampanhaDTO findOne(Long id) {
		
		if(id != null) {
			CampanhaDTO dto = new CampanhaDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.CampanhaService#findAll(java.lang.Object)
	 */
	public Iterable<CampanhaDTO> findAll() {

		Iterable<Campanha> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<CampanhaDTO> listResult = new ArrayList<CampanhaDTO>(); 
			Iterator<Campanha> iterator  = iterableFindAll.iterator();

			while(iterator.hasNext()) {
				CampanhaDTO dto = new CampanhaDTO();
				super.copyProperties(dto, iterator.next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}