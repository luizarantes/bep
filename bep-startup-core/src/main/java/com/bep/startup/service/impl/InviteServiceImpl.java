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

import com.bep.startup.data.repository.InviteRepository;
import com.bep.startup.model.domain.Invite;
import com.bep.startup.model.domain.dto.InviteDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class InviteServiceImpl extends AbstractService<InviteDTO, Invite, Long>  {
    
    @Autowired
    private InviteRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.InviteService#save(java.lang.Object)
	 */
	public InviteDTO save(InviteDTO dto) {
		
		if(dto != null) {
			Invite entity = new Invite();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.InviteService#findOne(java.lang.Object)
	 */
	public InviteDTO findOne(Long id) {
		
		if(id != null) {
			InviteDTO dto = new InviteDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.InviteService#findAll(java.lang.Object)
	 */
	public Iterable<InviteDTO> findAll() {

		Iterable<Invite> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<InviteDTO> listResult = new ArrayList<InviteDTO>(); 
			Iterator<HardwareType> iterator   = iterableFindAll.iterator();

			while(iterator.hasNext()) {
				InviteDTO dto = new InviteDTO();
				super.copyProperties(dto, iterator.next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}