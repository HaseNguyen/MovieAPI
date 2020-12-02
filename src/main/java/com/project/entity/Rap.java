package com.project.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "RAP")
public class Rap {
	@Id
	@GeneratedValue
	private int RAP_ID;
	private String MARAP;
	private String TENRAP;
	private int CUMRAP_ID;
	
	@OneToMany(mappedBy = "rap" , fetch =FetchType.EAGER)
	private Set<LichChieu> lichchieu;
	
	@OneToMany(mappedBy = "rap", fetch = FetchType.EAGER)
	private Set<Ghe> ghe;
	
	@ManyToOne
	@JoinColumn(name = "CUMRAP_ID", insertable = false, updatable = false)
	private CumRap cumrap;
}
