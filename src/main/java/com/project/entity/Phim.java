package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Phim {
	@Id
	private int Phim_ID;
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
