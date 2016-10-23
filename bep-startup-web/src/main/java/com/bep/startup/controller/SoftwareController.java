/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
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

import com.bep.startup.model.domain.dto.SoftwareDTO;
import com.bep.startup.service.impl.SoftwareServiceImpl;
import com.bep.startup.data.repository.SoftwareRepository;


/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping(path = "/api/v1/software", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class SoftwareController {

	@Autowired
	private SoftwareServiceImpl service;

	@Autowired
    private SoftwareRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<SoftwareDTO>> findAll() {
		return new ResponseEntity<Iterable<SoftwareDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<SoftwareDTO> save(@RequestBody SoftwareDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<SoftwareDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one/{id}", method = RequestMethod.GET)
	public ResponseEntity<SoftwareDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<SoftwareDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.dataRepository.delete(id);
	}

}