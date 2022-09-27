package com.example.tuan04_Spring_Data_JPA.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;

public class ChungNhanPK implements Serializable{
	@Basic
	@Column(name = "manv")
	private String maNV;
	
	@Basic(optional = false)
	@Column(name = "mamb")
	private Integer maMB;
}
