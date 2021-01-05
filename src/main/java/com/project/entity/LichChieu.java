package com.project.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name = "LICHCHIEU")
public class LichChieu {
	@Id
	@GeneratedValue
	private int LICHCHIEU_ID;
	private String MALICHCHIEU;
	private String THOIGIANBATDAUCHIEU;
	private String THOIGIANKETTHUC;	
	private Double HESOCHENHLECH;

	@OneToMany(mappedBy = "lichchieu", fetch = FetchType.LAZY)
	private List<Ve> ve;
	
	
	private int RAP_ID;
	@ManyToOne
	@JoinColumn(name= "RAP_ID", insertable = false, updatable = false)
	@JsonIgnore
	private Rap rap;
	
	private int PHIM_ID;
	@ManyToOne
	@JoinColumn(name = "PHIM_ID", insertable = false, updatable = false)
	@JsonIgnore
	private Phim phim;
	
	public LichChieu() {
		
	}
	
}
