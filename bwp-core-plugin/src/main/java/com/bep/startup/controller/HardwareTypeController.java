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

import com.bep.startup.model.domain.HardwareType;
import com.bep.startup.model.domain.dto.HardwareTypeDTO;
import com.bep.startup.service.impl.HardwareTypeServiceImpl;
import com.bep.startup.data.repository.HardwareTypeRepository;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Controller
@RequestMapping("/api/v1/hardwareType")
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
	public ResponseEntity<HardwareTypeDTO> save(HardwareTypeDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<HardwareTypeDTO>(HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one", method = RequestMethod.GET)
	public ResponseEntity<HardwareTypeDTO> findOne(Long id) {
		return new ResponseEntity<HardwareTypeDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(Long id) {
		this.dataRepository.delete(id);
		return new ResponseEntity(Boolean.TRUE, HttpStatus.OK);
	}

}