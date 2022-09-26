package com.example.tuan04_Spring_Data_JPA.entities;

import java.io.Serializable;

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
@Table(name = "maybay")
public class MayBay implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaMB")
	private Integer maMB;
	
	@Column(name = "Loai")
	private String loai;
	
	@Column(name = "TamBay")
	private Integer tamBay;
}
