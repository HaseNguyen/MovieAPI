package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class HeThongRap {
	@Id
	private int HETHONGRAP_ID;
	private String MAHETHONGRAP;
	private String TENHETHONGRAP;
	private String BIDANH;
	private String LOGO;
}
