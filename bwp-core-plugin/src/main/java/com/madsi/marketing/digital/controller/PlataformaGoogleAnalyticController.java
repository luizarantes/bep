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

import com.madsi.marketing.digital.model.domain.dto.PlataformaGoogleAnalyticDTO;
import com.madsi.marketing.digital.service.impl.PlataformaGoogleAnalyticServiceImpl;
import com.madsi.marketing.digital.data.repository.PlataformaGoogleAnalyticRepository;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@RestController
@RequestMapping("/api/v1/plataformaGoogleAnalytic")
public class PlataformaGoogleAnalyticController {

	@Autowired
	private PlataformaGoogleAnalyticServiceImpl service;

	@Autowired
    private PlataformaGoogleAnalyticRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<PlataformaGoogleAnalyticDTO>> findAll() {
		return new ResponseEntity<Iterable<PlataformaGoogleAnalyticDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<PlataformaGoogleAnalyticDTO> save(@RequestBody PlataformaGoogleAnalyticDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<PlataformaGoogleAnalyticDTO>(HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one/{id}", method = RequestMethod.GET)
	public ResponseEntity<PlataformaGoogleAnalyticDTO> findOne(@PathVariable Long id) {
		return new ResponseEntity<PlataformaGoogleAnalyticDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(@PathVariable Long id) {
		this.dataRepository.delete(id);
		return new ResponseEntity(Boolean.TRUE, HttpStatus.OK);
	}

}