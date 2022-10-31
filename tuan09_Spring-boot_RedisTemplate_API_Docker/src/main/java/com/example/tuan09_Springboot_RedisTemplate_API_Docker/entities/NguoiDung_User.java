package com.example.tuan09_Springboot_RedisTemplate_API_Docker.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nguoidung")
public class NguoiDung_User implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "mand")
	private String mand;
	
	@Column(name = "ten")
	private String ten;
	
	@Column(name = "namsinh")
	private String namsinh;

	public String getMand() {
		return mand;
	}

	public void setMand(String mand) {
		this.mand = mand;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
	}

	public NguoiDung_User(String mand, String ten, String namsinh) {
		super();
		this.mand = mand;
		this.ten = ten;
		this.namsinh = namsinh;
	}

	public NguoiDung_User() {
		super();
	}

	@Override
	public String toString() {
		return "NguoiDung_User [mand=" + mand + ", ten=" + ten + ", namsinh=" + namsinh + "]";
	}
	
}
