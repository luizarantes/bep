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

import com.bep.startup.model.domain.Goal;
import com.bep.startup.model.domain.dto.GoalDTO;
import com.bep.startup.service.GoalService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping(path = "/api/v1/goal", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class GoalController {

	@Autowired
	private GoalService<GoalDTO, Goal, Long> service;

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<GoalDTO>> findAll() {
		return new ResponseEntity<Iterable<GoalDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<GoalDTO> save(@RequestBody GoalDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<GoalDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<GoalDTO> update(@RequestBody GoalDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<GoalDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<GoalDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<GoalDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.service.delete(id);
	}

}