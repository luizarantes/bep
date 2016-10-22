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

import com.madsi.marketing.digital.data.repository.SegmentoRepository;
import com.madsi.marketing.digital.model.domain.Segmento;
import com.madsi.marketing.digital.model.domain.dto.SegmentoDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class SegmentoServiceImpl extends AbstractService<SegmentoDTO, Segmento, Long>  {
    
    @Autowired
    private SegmentoRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.SegmentoService#save(java.lang.Object)
	 */
	public SegmentoDTO save(SegmentoDTO dto) {
		
		if(dto != null) {
			Segmento entity = new Segmento();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.SegmentoService#findOne(java.lang.Object)
	 */
	public SegmentoDTO findOne(Long id) {
		
		if(id != null) {
			SegmentoDTO dto = new SegmentoDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.SegmentoService#findAll(java.lang.Object)
	 */
	public Iterable<SegmentoDTO> findAll() {

		Iterable<Segmento> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<SegmentoDTO> listResult = new ArrayList<SegmentoDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				SegmentoDTO dto = new SegmentoDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}