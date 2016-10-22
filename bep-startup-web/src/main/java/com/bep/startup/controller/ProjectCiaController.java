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

import com.bep.startup.model.domain.ProjectCia;
import com.bep.startup.model.domain.dto.ProjectCiaDTO;
import com.bep.startup.service.impl.ProjectCiaServiceImpl;
import com.bep.startup.data.repository.ProjectCiaRepository;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Controller
@RequestMapping("/api/v1/projectCia")
public class ProjectCiaController {

	@Autowired
	private ProjectCiaServiceImpl service;

	@Autowired
    private ProjectCiaRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<ProjectCiaDTO>> findAll() {
		return new ResponseEntity<Iterable<ProjectCiaDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<ProjectCiaDTO> save(ProjectCiaDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<ProjectCiaDTO>(HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one", method = RequestMethod.GET)
	public ResponseEntity<ProjectCiaDTO> findOne(Long id) {
		return new ResponseEntity<ProjectCiaDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(Long id) {
		this.dataRepository.delete(id);
		return new ResponseEntity(Boolean.TRUE, HttpStatus.OK);
	}

}