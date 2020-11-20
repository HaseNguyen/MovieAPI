package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CumRap {
	@Id
	private int CUMRAP_ID;
	private int HETHONGRAP_ID;
	private String TENCUMRAP;
	private String BIDANH;
	private String LOGO;
	private String DIACHI;
}
