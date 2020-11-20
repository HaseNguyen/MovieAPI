package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Admin {
	@Id
	private int ADMIN_ID;
	private String ADMIN_HOTEN;
	private String ADMIN_EMAIL;
	private int ADMIN_GIOITINH;
	private String ADMIN_USERNAME;
	private String ADMIN_PASSWORD;
	private String ADMIN_DIACHI;
	private int ADMIN_CMND;
	private String ADMIN_AVATAR;
	private int ADMIN_TINHTRANG;
	private int ADMIN_SDT;
	private int ADMIN_CHUCVU;
	private String ADMIN_NGAYSINH;
}
