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

import com.madsi.marketing.digital.model.domain.PlataformaGoogleAnalytic;
import com.madsi.marketing.digital.model.domain.dto.PlataformaGoogleAnalyticDTO;
import com.madsi.marketing.digital.service.PlataformaGoogleAnalyticService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping(path = "/api/v1/plataformaGoogleAnalytic", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class PlataformaGoogleAnalyticController {

	@Autowired
	private PlataformaGoogleAnalyticService<PlataformaGoogleAnalyticDTO, PlataformaGoogleAnalytic, Long> service;

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<PlataformaGoogleAnalyticDTO>> findAll() {
		return new ResponseEntity<Iterable<PlataformaGoogleAnalyticDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<PlataformaGoogleAnalyticDTO> save(@RequestBody PlataformaGoogleAnalyticDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<PlataformaGoogleAnalyticDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<PlataformaGoogleAnalyticDTO> update(@RequestBody PlataformaGoogleAnalyticDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<PlataformaGoogleAnalyticDTO>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<PlataformaGoogleAnalyticDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<PlataformaGoogleAnalyticDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.service.delete(id);
	}

}