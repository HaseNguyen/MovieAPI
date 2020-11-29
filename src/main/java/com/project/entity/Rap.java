package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "RAP")
public class Rap {
	@Id
	private int RAP_ID;
	private String MARAP;
	private String TENRAP;
	private int CUMRAP_ID;
}
