package com.example.tuan4_Spring_Data_JPA.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "chuyenbay")
public class ChuyenBay implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaCB")
	private String maCB;
	
	@Column(name = "GaDi")
	private String gaDi;
	
	@Column(name = "GaDen")
	private String gaDen;
	
	@Column(name = "DoDai")
	private Integer doDai;
	
	@Column(name = "GioDi")
	private Date gioDi;
	
	@Column(name = "GioDen")
	private Date gioDen;
	
	@Column(name = "ChiPhi")
	private Integer chiPhi;
	
}
