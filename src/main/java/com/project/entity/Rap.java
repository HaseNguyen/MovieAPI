package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Rap {
	@Id
	private int RAP_ID;
	private String MARAP;
	private String TENRAP;
	private int CUMRAP_ID;
}
