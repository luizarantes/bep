/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bep.startup.model.domain.ContactPerson;
import com.bep.startup.model.domain.dto.ContactPersonDTO;
import com.bep.startup.service.impl.ContactPersonServiceImpl;
import com.bep.startup.data.repository.ContactPersonRepository;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Controller
@RequestMapping("/api/v1/contactPerson")
public class ContactPersonController {

	@Autowired
	private ContactPersonServiceImpl<ContactPersonDTO, ContactPerson, Long> service;

	@Autowired
    private ContactPersonRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<ContactPersonDTO>> findAll() {
		return new ResponseEntity<Iterable<ContactPersonDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<ContactPersonDTO> save(ContactPersonDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<ContactPersonDTO>(HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one", method = RequestMethod.GET)
	public ResponseEntity<ContactPersonDTO> findOne(Long id) {
		return new ResponseEntity<ContactPersonDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(Long id) {
		this.dataRepository.delete(id);
		return new ResponseEntity(Boolean.TRUE, HttpStatus.OK);
	}

}