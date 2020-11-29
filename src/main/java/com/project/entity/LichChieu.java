package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "LICHCHIEU")
public class LichChieu {
	@Id
	private int LICHCHIEU_ID;
	private String MALICHCHIEU;
	private String THOIGIANBATDAUCHIEU;
	private String THOIGIANKETTHUC;
	private Double HESOCHENHLECH;
	private int PHIM_ID;
	private int RAP_ID;
}
