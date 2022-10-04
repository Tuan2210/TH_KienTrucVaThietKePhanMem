package com.example.tuan06_Springboot_JPA_API_Docker_Server.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan06_Springboot_JPA_API_Docker_Server.entities.NhanVien;


@Repository
public interface NhanVienRepo extends JpaRepository<NhanVien, String>{
	
	@Query(value = "SELECT * FROM lab4_kttkpm_quanlychuyenbay_db.nhanvien where Luong < 10000;", nativeQuery = true)
//	@Query(value = "SELECT * FROM kttkpm_qlchuyenbay_db.nhanvien where Luong < 10000;", nativeQuery = true)
	public List<NhanVien> finNhanViensByLuong();
	
	@Query(value = "SELECT sum(Luong) FROM lab4_kttkpm_quanlychuyenbay_db.nhanvien;", nativeQuery = true)
//	@Query(value = "SELECT sum(Luong) FROM kttkpm_qlchuyenbay_db.nhanvien;", nativeQuery = true)
	public Long sumLuongNV();
	
	@Query(value = " select * from nhanvien n join chungnhan c \n" +
            "on n.MaNV = c.MaNV join maybay m on m.MaMB = c.MaMB\n" +
            "where m.Loai like '%Boeing%'\n" +
            "group by n.MaNV, n.Ten  ", nativeQuery = true)
//	@Query(value = " select n.MaNV, n.Ten, n.Luong from nhanvien n join chungnhan c \n" +
//            "on n.MaNV = c.MaNV join maybay m on m.MaMB = c.MaMB\n" +
//            "where m.Loai like '%Boeing%'\n" +
//            "group by n.MaNV, n.Ten  ", nativeQuery = true) // ko dùng * vì api ko cho show 1 colum 1 lần
	public List<NhanVien> findMaPhiCongsLaiBoeing();
	
	@Query(value = " select * from nhanvien n join chungnhan c \n" +
            "on n.MaNV = c.MaNV join maybay m on m.MaMB = c.MaMB\n" +
            "where m.MaMB like '747'\n" +
            "group by n.MaNV, n.Ten  ", nativeQuery = true)
//	@Query(value = " select n.MaNV, n.Ten, n.Luong from nhanvien n join chungnhan c \n" +
//            "on n.MaNV = c.MaNV join maybay m on m.MaMB = c.MaMB\n" +
//            "where m.MaMB like '747'\n" +
//            "group by n.MaNV, n.Ten  ", nativeQuery = true)
	public List<NhanVien> findPhiCongsLaiMayBayByMa();
}
