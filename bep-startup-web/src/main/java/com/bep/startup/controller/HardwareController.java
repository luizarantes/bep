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

import com.bep.startup.data.repository.HardwareRepository;
import com.bep.startup.model.domain.Hardware;
import com.bep.startup.model.domain.dto.HardwareDTO;
import com.bep.startup.service.HardwareService;


/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping(path = "/api/v1/hardware", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class HardwareController {

	@Autowired
	private HardwareService<HardwareDTO, Hardware, Long> service;

	@Autowired
    private HardwareRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<HardwareDTO>> findAll() {
		return new ResponseEntity<Iterable<HardwareDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<HardwareDTO> save(@RequestBody HardwareDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<HardwareDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one/{id}", method = RequestMethod.GET)
	public ResponseEntity<HardwareDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<HardwareDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.dataRepository.delete(id);
	}

}