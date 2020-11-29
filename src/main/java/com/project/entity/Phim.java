package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "PHIM")
public class Phim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PHIM_ID;
	private String MAPHIM;
	private String TENPHIM;
	private String BIDANH;
	private String MOTA;
	private String TRAILER;
	private String NGAYKHOICHIEU;
	private String HINHANH;
	private String BANNER;
	private int DANHGIA;
}
