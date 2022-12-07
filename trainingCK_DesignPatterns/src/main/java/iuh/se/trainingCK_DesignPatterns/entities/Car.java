//package iuh.se.trainingCK_DesignPatterns.entities;
//
//import java.io.Serializable;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.DiscriminatorColumn;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Inheritance;
//import jakarta.persistence.InheritanceType;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//import lombok.experimental.SuperBuilder;

//how to use lombok in abstract class: https://www.youtube.com/watch?v=7dBijbBdgbc&t=544s

////@Getter
////@Setter
////@AllArgsConstructor
////@NoArgsConstructor
////@ToString
////@Data
////@SuperBuilder
//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "car_type")
//public abstract class Car implements Serializable {
//	private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	private int id;
//	
//	@Column(name = "ten")
//	private String ten;
//	
//	@Column(name = "gia")
//	private String gia;
//	
//	@Column(name = "cauhinh")
//	private String cauHinh;
//	
//	@Column(name = "nhasanxuat")
//	private String nhaSX;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getTen() {
//		return ten;
//	}
//
//	public void setTen(String ten) {
//		this.ten = ten;
//	}
//
//	public String getGia() {
//		return gia;
//	}
//
//	public void setGia(String gia) {
//		this.gia = gia;
//	}
//
//	public String getCauHinh() {
//		return cauHinh;
//	}
//
//	public void setCauHinh(String cauHinh) {
//		this.cauHinh = cauHinh;
//	}
//
//	public String getNhaSX() {
//		return nhaSX;
//	}
//
//	public void setNhaSX(String nhaSX) {
//		this.nhaSX = nhaSX;
//	}
//
//	public Car(int id, String ten, String gia, String cauHinh, String nhaSX) {
//		super();
//		this.id = id;
//		this.ten = ten;
//		this.gia = gia;
//		this.cauHinh = cauHinh;
//		this.nhaSX = nhaSX;
//	}
//
//	public Car() {
//		super();
//	}
//
//	@Override
//	public String toString() {
//		return "Car [id=" + id + ", ten=" + ten + ", gia=" + gia + ", cauHinh=" + cauHinh + ", nhaSX=" + nhaSX + "]";
//	}
//	
//}
