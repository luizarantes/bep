/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bep.startup.data.repository.KeyMemberRepository;
import com.bep.startup.model.domain.KeyMember;
import com.bep.startup.model.domain.dto.KeyMemberDTO;
import com.bep.startup.service.KeyMemberService;


/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping(path = "/api/v1/keyMember", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class KeyMemberController {

	@Autowired
	private KeyMemberService<KeyMemberDTO, KeyMember, Long> service;

	@Autowired
    private KeyMemberRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<KeyMemberDTO>> findAll() {
		return new ResponseEntity<Iterable<KeyMemberDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<KeyMemberDTO> save(@RequestBody KeyMemberDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<KeyMemberDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one/{id}", method = RequestMethod.GET)
	public ResponseEntity<KeyMemberDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<KeyMemberDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.dataRepository.delete(id);
	}

}