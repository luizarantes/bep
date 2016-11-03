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

import com.madsi.marketing.digital.model.domain.PlataformaFacebook;
import com.madsi.marketing.digital.model.domain.dto.PlataformaFacebookDTO;
import com.madsi.marketing.digital.service.PlataformaFacebookService;
import com.madsi.marketing.digital.data.repository.PlataformaFacebookRepository;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping(path = "/api/v1/plataformaFacebook", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class PlataformaFacebookController {

	@Autowired
	private PlataformaFacebookService<PlataformaFacebookDTO, PlataformaFacebook, Long> service;

	@Autowired
    private PlataformaFacebookRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<PlataformaFacebookDTO>> findAll() {
		return new ResponseEntity<Iterable<PlataformaFacebookDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<PlataformaFacebookDTO> save(@RequestBody PlataformaFacebookDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<PlataformaFacebookDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one/{id}", method = RequestMethod.GET)
	public ResponseEntity<PlataformaFacebookDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<PlataformaFacebookDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.dataRepository.delete(id);
	}

}