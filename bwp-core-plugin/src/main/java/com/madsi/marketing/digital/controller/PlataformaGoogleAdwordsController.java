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

import com.madsi.marketing.digital.model.domain.dto.PlataformaGoogleAdwordsDTO;
import com.madsi.marketing.digital.service.impl.PlataformaGoogleAdwordsServiceImpl;
import com.madsi.marketing.digital.data.repository.PlataformaGoogleAdwordsRepository;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping("/api/v1/plataformaGoogleAdwords", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class PlataformaGoogleAdwordsController {

	@Autowired
	private PlataformaGoogleAdwordsServiceImpl service;

	@Autowired
    private PlataformaGoogleAdwordsRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<PlataformaGoogleAdwordsDTO>> findAll() {
		return new ResponseEntity<Iterable<PlataformaGoogleAdwordsDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<PlataformaGoogleAdwordsDTO> save(@RequestBody PlataformaGoogleAdwordsDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<PlataformaGoogleAdwordsDTO>(HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one/{id}", method = RequestMethod.GET)
	public ResponseEntity<PlataformaGoogleAdwordsDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<PlataformaGoogleAdwordsDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(@PathVariable Long id) {
		this.dataRepository.delete(id);
		return new ResponseEntity(Boolean.TRUE, HttpStatus.OK);
	}

}