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
@Table(name = "CUMRAP")
public class CumRap {
	@Id
	@GeneratedValue
	private int CUMRAP_ID;
	private int HETHONGRAP_ID;
	private String TENCUMRAP;
	private String BIDANH;
	private String LOGO;
	private String DIACHI;
	
	@ManyToOne
	@JoinColumn(name = "HETHONGRAP_ID", insertable = false, updatable = false)
	private HeThongRap hethongrap;
	
	@OneToMany(mappedBy = "cumrap", fetch = FetchType.EAGER)
	private Set<Rap> rap;
}
