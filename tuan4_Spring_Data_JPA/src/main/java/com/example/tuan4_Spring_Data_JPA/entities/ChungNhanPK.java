package com.example.tuan4_Spring_Data_JPA.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;

public class ChungNhanPK implements Serializable{
	@Basic
	@Column(name = "MaNV")
	private String maNV;
	
	@Basic(optional = false)
	@Column(name = "MaMB")
	private Integer maMB;
}
