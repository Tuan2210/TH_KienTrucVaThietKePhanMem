package com.example.tuan09_Springboot_RedisTemplate_API_Docker.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//@Value
//@Getter(AccessLevel.NONE)
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Data
//@Builder
@Entity
@Table(name = "chuyenbay")
public class ChuyenBay implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "macb")
	private String macb;
	
	@Column(name = "gadi")
	private String gadi;
	
	@Column(name = "gaden")
	private String gaden;
	
	@Column(name = "dodai")
	private Integer dodai;
	
	@Column(name = "giodi")
	private Date giodi;
	
	@Column(name = "gioden")
	private Date gioden;
	
	@Column(name = "chiphi")
	private Integer chiphi;

	public String getMacb() {
		return macb;
	}

	public void setMacb(String macb) {
		this.macb = macb;
	}

	public String getGadi() {
		return gadi;
	}

	public void setGadi(String gadi) {
		this.gadi = gadi;
	}

	public String getGaden() {
		return gaden;
	}

	public void setGaden(String gaden) {
		this.gaden = gaden;
	}

	public Integer getDodai() {
		return dodai;
	}

	public void setDodai(Integer dodai) {
		this.dodai = dodai;
	}

	public Date getGiodi() {
		return giodi;
	}

	public void setGiodi(Date giodi) {
		this.giodi = giodi;
	}

	public Date getGioden() {
		return gioden;
	}

	public void setGioden(Date gioden) {
		this.gioden = gioden;
	}

	public Integer getChiphi() {
		return chiphi;
	}

	public void setChiphi(Integer chiphi) {
		this.chiphi = chiphi;
	}

	public ChuyenBay(String macb, String gadi, String gaden, Integer dodai, Date giodi, Date gioden, Integer chiphi) {
		super();
		this.macb = macb;
		this.gadi = gadi;
		this.gaden = gaden;
		this.dodai = dodai;
		this.giodi = giodi;
		this.gioden = gioden;
		this.chiphi = chiphi;
	}

	public ChuyenBay() {
		super();
	}

	@Override
	public String toString() {
		return "ChuyenBay [macb=" + macb + ", gadi=" + gadi + ", gaden=" + gaden + ", dodai=" + dodai + ", giodi="
				+ giodi + ", gioden=" + gioden + ", chiphi=" + chiphi + "]";
	}
	
	
}
