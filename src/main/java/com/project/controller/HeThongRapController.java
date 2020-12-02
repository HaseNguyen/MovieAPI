package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.repository.HeThongRapRepository;
import com.project.service.HeThongRapService;

@RestController
@RequestMapping("api/hethongrap")
public class HeThongRapController {
//	@Autowired	
	private HeThongRapRepository heThongRapRepository;
	
	@Autowired	
	private HeThongRapService heThongRapService;
	
	@GetMapping
	public Object getAllHeThongRap() {
		return ResponseEntity.ok(heThongRapService.getAllHeThongRap());
	}
}
	