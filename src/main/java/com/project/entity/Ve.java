package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="VE")
public class Ve {
	@Id
	private int VE_ID;
	private String MAVE;
	private String TENVE;
	private String MAGHE;
	private Double GIAVE;
	private int TINHTRANGVE;
	private int LICHCHIEU_ID;
}
