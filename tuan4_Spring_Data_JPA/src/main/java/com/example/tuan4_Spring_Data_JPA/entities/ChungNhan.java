package com.example.tuan4_Spring_Data_JPA.entities;

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
	@JoinColumn(name = "MaNV", referencedColumnName = "MaNV", insertable = false, updatable = false)
	private NhanVien nhanVien;
	
	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "MaMB", referencedColumnName = "MaMB", insertable = false, updatable = false)
	private MayBay mayBay;
}
