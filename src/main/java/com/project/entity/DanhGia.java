package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "DANHGIA")
public class DanhGia {
	@Id
	@Column(name ="DANHGIA_ID")
	private int DANHGIA_ID;
	
	@Column(name ="MADANHGIA")
	private String MADANHGIA;
	
	@Column(name ="NOIDUNGDANHGIA")
	private String NOIDUNGDANHGIA;
	
	@Column(name ="USER_ID")
	private int USER_ID;
	
	@Column(name ="PHIM_ID")
	private int PHIM_ID;

}
