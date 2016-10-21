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

import com.madsi.marketing.digital.data.repository.EmpresaRepository;
import com.madsi.marketing.digital.model.domain.Empresa;
import com.madsi.marketing.digital.model.domain.dto.EmpresaDTO;
import com.madsi.marketing.digital.service.EmpresaService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class EmpresaServiceImpl extends AbstractService implements EmpresaService<EmpresaDTO, Empresa, Long> {
    
    @Autowired
    private EmpresaRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.EmpresaService#save(java.lang.Object)
	 */
	public EmpresaDTO save(EmpresaDTO dto) {
		
		if(dto != null) {
			Empresa entity = new Empresa();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.EmpresaService#findOne(java.lang.Object)
	 */
	public EmpresaDTO findOne(Long id) {
		
		if(id != null) {
			EmpresaDTO dto = new EmpresaDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.madsi.marketing.digital.service.EmpresaService#findAll(java.lang.Object)
	 */
	public Iterable<EmpresaDTO> findAll() {

		Iterable<Empresa> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<EmpresaDTO> listResult = new ArrayList<EmpresaDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				EmpresaDTO dto = new EmpresaDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}