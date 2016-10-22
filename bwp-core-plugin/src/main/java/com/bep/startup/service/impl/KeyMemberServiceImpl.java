/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bep.startup.data.repository.KeyMemberRepository;
import com.bep.startup.model.domain.KeyMember;
import com.bep.startup.model.domain.dto.KeyMemberDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class KeyMemberServiceImpl extends AbstractService<KeyMemberDTO, KeyMember, Long>  {
    
    @Autowired
    private KeyMemberRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.KeyMemberService#save(java.lang.Object)
	 */
	public KeyMemberDTO save(KeyMemberDTO dto) {
		
		if(dto != null) {
			KeyMember entity = new KeyMember();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.KeyMemberService#findOne(java.lang.Object)
	 */
	public KeyMemberDTO findOne(Long id) {
		
		if(id != null) {
			KeyMemberDTO dto = new KeyMemberDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.KeyMemberService#findAll(java.lang.Object)
	 */
	public Iterable<KeyMemberDTO> findAll() {

		Iterable<KeyMember> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<KeyMemberDTO> listResult = new ArrayList<KeyMemberDTO>(); 

			while(iterableFindAll.iterator().hasNext()) {
				KeyMemberDTO dto = new KeyMemberDTO();
				super.copyProperties(dto, iterableFindAll.iterator().next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}