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

import com.bep.startup.model.domain.MeetingProcedure;
import com.bep.startup.model.domain.dto.MeetingProcedureDTO;
import com.bep.startup.service.MeetingProcedureService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping(path = "/api/v1/meetingProcedure", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class MeetingProcedureController {

	@Autowired
	private MeetingProcedureService<MeetingProcedureDTO, MeetingProcedure, Long> service;

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<MeetingProcedureDTO>> findAll() {
		return new ResponseEntity<Iterable<MeetingProcedureDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<MeetingProcedureDTO> save(@RequestBody MeetingProcedureDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<MeetingProcedureDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<MeetingProcedureDTO> update(@RequestBody MeetingProcedureDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<MeetingProcedureDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<MeetingProcedureDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<MeetingProcedureDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.service.delete(id);
	}

}