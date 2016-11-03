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

import com.madsi.marketing.digital.model.domain.Campanha;
import com.madsi.marketing.digital.model.domain.dto.CampanhaDTO;
import com.madsi.marketing.digital.service.CampanhaService;
import com.madsi.marketing.digital.data.repository.CampanhaRepository;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping(path = "/api/v1/campanha", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class CampanhaController {

	@Autowired
	private CampanhaService<CampanhaDTO, Campanha, Long> service;

	@Autowired
    private CampanhaRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<CampanhaDTO>> findAll() {
		return new ResponseEntity<Iterable<CampanhaDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<CampanhaDTO> save(@RequestBody CampanhaDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<CampanhaDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one/{id}", method = RequestMethod.GET)
	public ResponseEntity<CampanhaDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<CampanhaDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.dataRepository.delete(id);
	}

}