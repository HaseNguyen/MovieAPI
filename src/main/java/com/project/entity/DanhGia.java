package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class DanhGia {
	@Id
	private int DANHGIA_ID;
	private String MADANHGIA;
	private String NOIDUNGDANHGIA;
	private int USER_ID;
	private int PHIM_ID;

}
