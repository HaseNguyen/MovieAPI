package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "GHE")
public class Ghe {
	@Id
	@GeneratedValue
	private int GHE_ID;
	private String MAGHE;
	private String TENGHE;
	private int TINHTRANG;
	private int LOAIGHE;
	private double GIAGHE;
	
	
	private int RAP_ID;
	
	@ManyToOne
	@JoinColumn(name = "RAP_ID",insertable = false, updatable = false)
	private Rap rap;
}
