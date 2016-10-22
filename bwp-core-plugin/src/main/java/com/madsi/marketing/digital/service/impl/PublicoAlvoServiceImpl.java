/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madsi.marketing.digital.data.repository.PublicoAlvoRepository;
import com.madsi.marketing.digital.model.domain.PublicoAlvo;
import com.madsi.marketing.digital.model.domain.dto.PublicoAlvoDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class PublicoAlvoServiceImpl extends AbstractService<PublicoAlvoDTO, PublicoAlvo, Long>  {
    
    @Autowired
    private PublicoAlvoRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.PublicoAlvoService#save(java.lang.Object)
	 */
	public PublicoAlvoDTO save(PublicoAlvoDTO dto) {
		
		if(dto != null) {
			PublicoAlvo entity = new PublicoAlvo();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.PublicoAlvoService#findOne(java.lang.Object)
	 */
	public PublicoAlvoDTO findOne(Long id) {
		
		if(id != null) {
			PublicoAlvoDTO dto = new PublicoAlvoDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.PublicoAlvoService#findAll(java.lang.Object)
	 */
	public Iterable<PublicoAlvoDTO> findAll() {

		Iterable<PublicoAlvo> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<PublicoAlvoDTO> listResult = new ArrayList<PublicoAlvoDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				PublicoAlvoDTO dto = new PublicoAlvoDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}