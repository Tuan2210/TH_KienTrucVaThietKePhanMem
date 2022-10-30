package com.example.tuan08_EurekaClient_APIGateway.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class ChungNhanPK implements Serializable{
//	@Basic
//	@Column(name = "manv")
	private String manv;
	
//	@Basic(optional = false)
//	@Column(name = "mamb")
	private String mamb;
}
