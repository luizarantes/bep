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

import com.bep.startup.model.domain.ProjectSchedule;
import com.bep.startup.model.domain.dto.ProjectScheduleDTO;
import com.bep.startup.service.ProjectScheduleService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping(path = "/api/v1/projectSchedule", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class ProjectScheduleController {

	@Autowired
	private ProjectScheduleService<ProjectScheduleDTO, ProjectSchedule, Long> service;

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<ProjectScheduleDTO>> findAll() {
		return new ResponseEntity<Iterable<ProjectScheduleDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<ProjectScheduleDTO> save(@RequestBody ProjectScheduleDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<ProjectScheduleDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<ProjectScheduleDTO> update(@RequestBody ProjectScheduleDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<ProjectScheduleDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ProjectScheduleDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<ProjectScheduleDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.service.delete(id);
	}

}