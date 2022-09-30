package com.example.tuan05_Spring_Data_JPA_Docker_API.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//@Getter
//@Setter
//@ToString
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
@Entity
@Table(name = "nhanvien")
public class NhanVien implements Serializable{
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "manv")
	private String manv;
	
	@Column(name = "ten")
	private String ten;
	
	@Column(name = "luong")
	private Integer luong;

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Integer getLuong() {
		return luong;
	}

	public void setLuong(Integer luong) {
		this.luong = luong;
	}

	public NhanVien(String manv, String ten, Integer luong) {
		super();
		this.manv = manv;
		this.ten = ten;
		this.luong = luong;
	}

	public NhanVien() {
		super();
	}

	@Override
	public String toString() {
		return "NhanVien [manv=" + manv + ", ten=" + ten + ", luong=" + luong + "]";
	}
	
}
