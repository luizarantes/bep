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

import com.madsi.marketing.digital.data.repository.MetricaRepository;
import com.madsi.marketing.digital.model.domain.Metrica;
import com.madsi.marketing.digital.model.domain.dto.MetricaDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class MetricaServiceImpl extends AbstractService<MetricaDTO, Metrica, Long>  {
    
    @Autowired
    private MetricaRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.MetricaService#save(java.lang.Object)
	 */
	public MetricaDTO save(MetricaDTO dto) {
		
		if(dto != null) {
			Metrica entity = new Metrica();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.MetricaService#findOne(java.lang.Object)
	 */
	public MetricaDTO findOne(Long id) {
		
		if(id != null) {
			MetricaDTO dto = new MetricaDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.MetricaService#findAll(java.lang.Object)
	 */
	public Iterable<MetricaDTO> findAll() {

		Iterable<Metrica> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<MetricaDTO> listResult = new ArrayList<MetricaDTO>(); 
			Iterator<Metrica> iterator  = iterableFindAll.iterator();

			while(iterator.hasNext()) {
				MetricaDTO dto = new MetricaDTO();
				super.copyProperties(dto, iterator.next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}