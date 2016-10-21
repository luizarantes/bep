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

import com.madsi.marketing.digital.data.repository.FaixaEtariaRepository;
import com.madsi.marketing.digital.model.domain.FaixaEtaria;
import com.madsi.marketing.digital.model.domain.dto.FaixaEtariaDTO;
import com.madsi.marketing.digital.service.FaixaEtariaService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class FaixaEtariaServiceImpl extends AbstractService implements FaixaEtariaService<FaixaEtariaDTO, FaixaEtaria, Long> {
    
    @Autowired
    private FaixaEtariaRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.FaixaEtariaService#save(java.lang.Object)
	 */
	public FaixaEtariaDTO save(FaixaEtariaDTO dto) {
		
		if(dto != null) {
			FaixaEtaria entity = new FaixaEtaria();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.FaixaEtariaService#findOne(java.lang.Object)
	 */
	public FaixaEtariaDTO findOne(Long id) {
		
		if(id != null) {
			FaixaEtariaDTO dto = new FaixaEtariaDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.FaixaEtariaService#findAll(java.lang.Object)
	 */
	public Iterable<FaixaEtariaDTO> findAll() {

		Iterable<FaixaEtaria> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<FaixaEtariaDTO> listResult = new ArrayList<FaixaEtariaDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				FaixaEtariaDTO dto = new FaixaEtariaDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}