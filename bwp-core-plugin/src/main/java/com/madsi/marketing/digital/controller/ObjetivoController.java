/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.madsi.marketing.digital.model.domain.Objetivo;
import com.madsi.marketing.digital.model.domain.dto.ObjetivoDTO;
import com.madsi.marketing.digital.service.ObjetivoService;
import com.madsi.marketing.digital.data.repository.ObjetivoRepository;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Controller
@RequestMapping("/api/v1/objetivo")
public class ObjetivoController {

	@Autowired
	private ObjetivoService<ObjetivoDTO, Objetivo, Long> service;

	@Autowired
    private ObjetivoRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<ObjetivoDTO>> findAll() {
		return new ResponseEntity<Iterable<ObjetivoDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<ObjetivoDTO> save(ObjetivoDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<ObjetivoDTO>(HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one", method = RequestMethod.GET)
	public ResponseEntity<ObjetivoDTO> findOne(Long id) {
		return new ResponseEntity<ObjetivoDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(Long id) {
		this.dataRepository.delete(id);
		return new ResponseEntity(Boolean.TRUE, HttpStatus.OK);
	}

}