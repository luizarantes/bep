/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.controller;

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

import com.madsi.marketing.digital.model.domain.PublicoAlvo;
import com.madsi.marketing.digital.model.domain.dto.PublicoAlvoDTO;
import com.madsi.marketing.digital.service.PublicoAlvoService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping(path = "/api/v1/publicoAlvo", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class PublicoAlvoController {

	@Autowired
	private PublicoAlvoService<PublicoAlvoDTO, PublicoAlvo, Long> service;

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<PublicoAlvoDTO>> findAll() {
		return new ResponseEntity<Iterable<PublicoAlvoDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<PublicoAlvoDTO> save(@RequestBody PublicoAlvoDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<PublicoAlvoDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<PublicoAlvoDTO> update(@RequestBody PublicoAlvoDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<PublicoAlvoDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<PublicoAlvoDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<PublicoAlvoDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.service.delete(id);
	}

}