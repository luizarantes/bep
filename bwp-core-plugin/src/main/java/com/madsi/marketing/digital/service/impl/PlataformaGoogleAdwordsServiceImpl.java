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

import com.madsi.marketing.digital.data.repository.PlataformaGoogleAdwordsRepository;
import com.madsi.marketing.digital.model.domain.PlataformaGoogleAdwords;
import com.madsi.marketing.digital.model.domain.dto.PlataformaGoogleAdwordsDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class PlataformaGoogleAdwordsServiceImpl extends AbstractService<PlataformaGoogleAdwordsDTO, PlataformaGoogleAdwords, Long>  {
    
    @Autowired
    private PlataformaGoogleAdwordsRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.PlataformaGoogleAdwordsService#save(java.lang.Object)
	 */
	public PlataformaGoogleAdwordsDTO save(PlataformaGoogleAdwordsDTO dto) {
		
		if(dto != null) {
			PlataformaGoogleAdwords entity = new PlataformaGoogleAdwords();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.PlataformaGoogleAdwordsService#findOne(java.lang.Object)
	 */
	public PlataformaGoogleAdwordsDTO findOne(Long id) {
		
		if(id != null) {
			PlataformaGoogleAdwordsDTO dto = new PlataformaGoogleAdwordsDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.PlataformaGoogleAdwordsService#findAll(java.lang.Object)
	 */
	public Iterable<PlataformaGoogleAdwordsDTO> findAll() {

		Iterable<PlataformaGoogleAdwords> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<PlataformaGoogleAdwordsDTO> listResult = new ArrayList<PlataformaGoogleAdwordsDTO>(); 
			Iterator<PlataformaGoogleAdwords> iterator  = iterableFindAll.iterator();

			while(iterator.hasNext()) {
				PlataformaGoogleAdwordsDTO dto = new PlataformaGoogleAdwordsDTO();
				super.copyProperties(dto, iterator.next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}