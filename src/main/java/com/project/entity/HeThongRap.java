package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "HETHONGRAP")
public class HeThongRap {
	@Id
	private int HETHONGRAP_ID;
	private String MAHETHONGRAP;
	private String TENHETHONGRAP;
	private String BIDANH;
	private String LOGO;
}
