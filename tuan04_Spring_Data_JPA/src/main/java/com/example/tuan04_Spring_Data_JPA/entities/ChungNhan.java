package com.example.tuan04_Spring_Data_JPA.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Getter
@Setter
@ToString
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "chungnhan")
public class ChungNhan implements Serializable{
	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "manv", referencedColumnName = "manv", insertable = false, updatable = false)
	private NhanVien nhanVien;
	
	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "mamb", referencedColumnName = "mamb", insertable = false, updatable = false)
	private MayBay mayBay;
}
