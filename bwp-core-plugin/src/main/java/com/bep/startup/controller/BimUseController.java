/**
*
* Copyright MADSI 2016 All Rights Reserved. 
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

import com.bep.startup.model.domain.BimUse;
import com.bep.startup.model.domain.dto.BimUseDTO;
import com.bep.startup.service.BimUseService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping(path = "/api/v1/bimUse", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class BimUseController {

	@Autowired
	private BimUseService<BimUseDTO, BimUse, Long> service;

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<BimUseDTO>> findAll() {
		return new ResponseEntity<Iterable<BimUseDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<BimUseDTO> save(@RequestBody BimUseDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<BimUseDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<BimUseDTO> update(@RequestBody BimUseDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<BimUseDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<BimUseDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<BimUseDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.service.delete(id);
	}

}