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

import com.bep.startup.model.domain.Goal;
import com.bep.startup.model.domain.dto.GoalDTO;
import com.bep.startup.service.GoalService;
import com.bep.startup.data.repository.GoalRepository;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Controller
@RequestMapping("/api/v1/goal")
public class GoalController {

	@Autowired
	private GoalService<GoalDTO, Goal, Long> service;

	@Autowired
    private GoalRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<GoalDTO>> findAll() {
		return new ResponseEntity<Iterable<GoalDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<GoalDTO> save(GoalDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<GoalDTO>(HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one", method = RequestMethod.GET)
	public ResponseEntity<GoalDTO> findOne(Long id) {
		return new ResponseEntity<GoalDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(Long id) {
		this.dataRepository.delete(id);
		return new ResponseEntity(Boolean.TRUE, HttpStatus.OK);
	}

}