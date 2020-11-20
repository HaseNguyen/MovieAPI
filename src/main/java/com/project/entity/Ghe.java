package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Ghe {
	@Id
	private int GHE_ID;
	private String MAGHE;
	private String TENGHE;
	private int TINHTRANG;
	private int LOAIGHE;
	private double GIAGHE;
	private int RAP_ID;
}
