package com.example.tuan08_EurekaClient_APIGateway.entities;

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
@Table(name = "maybay")
public class MayBay implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mamb")
	private Integer mamb;
	
	@Column(name = "loai")
	private String loai;
	
	@Column(name = "tambay")
	private Integer tambay;

	public Integer getMamb() {
		return mamb;
	}

	public void setMamb(Integer mamb) {
		this.mamb = mamb;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public Integer getTambay() {
		return tambay;
	}

	public void setTambay(Integer tambay) {
		this.tambay = tambay;
	}

	public MayBay(Integer mamb, String loai, Integer tambay) {
		super();
		this.mamb = mamb;
		this.loai = loai;
		this.tambay = tambay;
	}

	public MayBay() {
		super();
	}

	@Override
	public String toString() {
		return "MayBay [mamb=" + mamb + ", loai=" + loai + ", tambay=" + tambay + "]";
	}
	
}
