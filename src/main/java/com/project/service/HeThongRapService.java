package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.HeThongRap;
import com.project.repository.HeThongRapRepository;

@Service
public class HeThongRapService {
	
	@Autowired
	private HeThongRapRepository heThongRapRepository;
	
	public Object getAllHeThongRap() {
		List<HeThongRap> heThongRap = heThongRapRepository.findAll();
		return heThongRap;
	}
}
