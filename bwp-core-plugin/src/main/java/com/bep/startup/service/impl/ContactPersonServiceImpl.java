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

import com.bep.startup.data.repository.ContactPersonRepository;
import com.bep.startup.model.domain.ContactPerson;
import com.bep.startup.model.domain.dto.ContactPersonDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class ContactPersonServiceImpl extends AbstractService<ContactPersonDTO, ContactPerson, Long>  {
    
    @Autowired
    private ContactPersonRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.ContactPersonService#save(java.lang.Object)
	 */
	public ContactPersonDTO save(ContactPersonDTO dto) {
		
		if(dto != null) {
			ContactPerson entity = new ContactPerson();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.ContactPersonService#findOne(java.lang.Object)
	 */
	public ContactPersonDTO findOne(Long id) {
		
		if(id != null) {
			ContactPersonDTO dto = new ContactPersonDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.ContactPersonService#findAll(java.lang.Object)
	 */
	public Iterable<ContactPersonDTO> findAll() {

		Iterable<ContactPerson> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<ContactPersonDTO> listResult = new ArrayList<ContactPersonDTO>(); 
			Iterator<HardwareType> iterator   = iterableFindAll.iterator();

			while(iterator.hasNext()) {
				ContactPersonDTO dto = new ContactPersonDTO();
				super.copyProperties(dto, iterator.next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}