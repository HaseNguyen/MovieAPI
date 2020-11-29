package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name = "USER")
public class User {
	@Id
	@GeneratedValue
	private int USER_ID;
	private String MAUSER;
	@NotBlank(message = "Vui lòng nhập UserName!")
	private String USERNAME;
	@NotBlank(message = "Vui lòng nhập mật khẩu!")
	private String PASSWORD;
	private String SDT;
	private String HOTEN;
	private String AVATAR;
	
	@Email(message = "Email ko đúng định dạng!")
	private String EMAIL;
	
	private int GIOITINH;
}
