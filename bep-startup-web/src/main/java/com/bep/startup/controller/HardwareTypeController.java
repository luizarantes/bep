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

import com.bep.startup.data.repository.HardwareTypeRepository;
import com.bep.startup.model.domain.dto.HardwareTypeDTO;
import com.bep.startup.service.impl.HardwareTypeServiceImpl;


/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping(path = "/api/v1/hardwareType", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class HardwareTypeController {

	@Autowired
	private HardwareTypeServiceImpl service;

	@Autowired
    private HardwareTypeRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<HardwareTypeDTO>> findAll() {
		return new ResponseEntity<Iterable<HardwareTypeDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<HardwareTypeDTO> save(@RequestBody HardwareTypeDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<HardwareTypeDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one/{id}", method = RequestMethod.GET)
	public ResponseEntity<HardwareTypeDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<HardwareTypeDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.dataRepository.delete(id);
	}
}