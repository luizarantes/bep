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

import com.madsi.marketing.digital.data.repository.ObjetivoRepository;
import com.madsi.marketing.digital.model.domain.Objetivo;
import com.madsi.marketing.digital.model.domain.dto.ObjetivoDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class ObjetivoServiceImpl extends AbstractService<ObjetivoDTO, Objetivo, Long>  {
    
    @Autowired
    private ObjetivoRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.ObjetivoService#save(java.lang.Object)
	 */
	public ObjetivoDTO save(ObjetivoDTO dto) {
		
		if(dto != null) {
			Objetivo entity = new Objetivo();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.ObjetivoService#findOne(java.lang.Object)
	 */
	public ObjetivoDTO findOne(Long id) {
		
		if(id != null) {
			ObjetivoDTO dto = new ObjetivoDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.ObjetivoService#findAll(java.lang.Object)
	 */
	public Iterable<ObjetivoDTO> findAll() {

		Iterable<Objetivo> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<ObjetivoDTO> listResult = new ArrayList<ObjetivoDTO>(); 
			Iterator<Objetivo> iterator  = iterableFindAll.iterator();

			while(iterator.hasNext()) {
				ObjetivoDTO dto = new ObjetivoDTO();
				super.copyProperties(dto, iterator.next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}