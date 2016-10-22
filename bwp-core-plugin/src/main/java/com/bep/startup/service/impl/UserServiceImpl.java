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

import com.bep.startup.data.repository.UserRepository;
import com.bep.startup.model.domain.User;
import com.bep.startup.model.domain.dto.UserDTO;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class UserServiceImpl extends AbstractService<UserDTO, User, Long>  {
    
    @Autowired
    private UserRepository dataRepository;
    
    /* (non-Javadoc)
	 * @see com.bep.startup.service.UserService#save(java.lang.Object)
	 */
	public UserDTO save(UserDTO dto) {
		
		if(dto != null) {
			User entity = new User();
			super.copyProperties(entity, dto);
			entity = this.dataRepository.save(entity);
			dto.setId(entity.getId());			
		}
		
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.UserService#findOne(java.lang.Object)
	 */
	public UserDTO findOne(Long id) {
		
		if(id != null) {
			UserDTO dto = new UserDTO();
			super.copyProperties(dto, this.dataRepository.findOne(id));
			return dto;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bep.startup.service.UserService#findAll(java.lang.Object)
	 */
	public Iterable<UserDTO> findAll() {

		Iterable<User> iterableFindAll = this.dataRepository.findAll();
		
		if(iterableFindAll != null) {
		
			List<UserDTO> listResult = new ArrayList<UserDTO>(); 
			Iterator<HardwareType> iterator   = iterableFindAll.iterator();

			while(iterator.hasNext()) {
				UserDTO dto = new UserDTO();
				super.copyProperties(dto, iterator.next());
				listResult.add(dto);
			}

			return listResult;
		}

		return null;
	}

}