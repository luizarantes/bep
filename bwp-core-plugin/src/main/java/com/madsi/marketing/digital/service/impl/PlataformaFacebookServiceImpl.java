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

import com.madsi.marketing.digital.data.repository.PlataformaFacebookRepository;
import com.madsi.marketing.digital.model.domain.PlataformaFacebook;
import com.madsi.marketing.digital.model.domain.dto.PlataformaFacebookDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class PlataformaFacebookServiceImpl extends AbstractService<PlataformaFacebookDTO, PlataformaFacebook, Long>  {
    
    @Autowired
    private PlataformaFacebookRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.PlataformaFacebookService#save(java.lang.Object)
	 */
	public PlataformaFacebookDTO save(PlataformaFacebookDTO dto) {
		
		if(dto != null) {
			PlataformaFacebook entity = new PlataformaFacebook();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.PlataformaFacebookService#findOne(java.lang.Object)
	 */
	public PlataformaFacebookDTO findOne(Long id) {
		
		if(id != null) {
			PlataformaFacebookDTO dto = new PlataformaFacebookDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.PlataformaFacebookService#findAll(java.lang.Object)
	 */
	public Iterable<PlataformaFacebookDTO> findAll() {

		Iterable<PlataformaFacebook> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<PlataformaFacebookDTO> listResult = new ArrayList<PlataformaFacebookDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				PlataformaFacebookDTO dto = new PlataformaFacebookDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}