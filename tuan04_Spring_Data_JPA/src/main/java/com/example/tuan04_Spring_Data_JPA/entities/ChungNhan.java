package com.example.tuan04_Spring_Data_JPA.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
@Entity
@IdClass(ChungNhanPK.class)
@Table(name = "chungnhan")
public class ChungNhan implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name = "MaNV")
	private NhanVien manv;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "MaMB")
	private MayBay mamb;

	public NhanVien getManv() {
		return manv;
	}

	public void setManv(NhanVien manv) {
		this.manv = manv;
	}

	public MayBay getMamb() {
		return mamb;
	}

	public void setMamb(MayBay mamb) {
		this.mamb = mamb;
	}

	public ChungNhan(NhanVien manv, MayBay mamb) {
		super();
		this.manv = manv;
		this.mamb = mamb;
	}

	public ChungNhan() {
		super();
	}

	@Override
	public String toString() {
		return "ChungNhan [manv=" + manv + ", mamb=" + mamb + "]";
	}

	
	
}
