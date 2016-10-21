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

import com.madsi.marketing.digital.data.repository.PlataformaGoogleAnalyticRepository;
import com.madsi.marketing.digital.model.domain.PlataformaGoogleAnalytic;
import com.madsi.marketing.digital.model.domain.dto.PlataformaGoogleAnalyticDTO;
import com.madsi.marketing.digital.service.PlataformaGoogleAnalyticService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class PlataformaGoogleAnalyticServiceImpl extends AbstractService implements PlataformaGoogleAnalyticService<PlataformaGoogleAnalyticDTO, PlataformaGoogleAnalytic, Long> {
    
    @Autowired
    private PlataformaGoogleAnalyticRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.PlataformaGoogleAnalyticService#save(java.lang.Object)
	 */
	public PlataformaGoogleAnalyticDTO save(PlataformaGoogleAnalyticDTO dto) {
		
		if(dto != null) {
			PlataformaGoogleAnalytic entity = new PlataformaGoogleAnalytic();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.PlataformaGoogleAnalyticService#findOne(java.lang.Object)
	 */
	public PlataformaGoogleAnalyticDTO findOne(Long id) {
		
		if(id != null) {
			PlataformaGoogleAnalyticDTO dto = new PlataformaGoogleAnalyticDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.PlataformaGoogleAnalyticService#findAll(java.lang.Object)
	 */
	public Iterable<PlataformaGoogleAnalyticDTO> findAll() {

		Iterable<PlataformaGoogleAnalytic> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<PlataformaGoogleAnalyticDTO> listResult = new ArrayList<PlataformaGoogleAnalyticDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				PlataformaGoogleAnalyticDTO dto = new PlataformaGoogleAnalyticDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}