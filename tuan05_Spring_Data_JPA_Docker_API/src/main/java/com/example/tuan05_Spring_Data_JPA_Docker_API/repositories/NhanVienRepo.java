package com.example.tuan05_Spring_Data_JPA_Docker_API.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan05_Spring_Data_JPA_Docker_API.entities.NhanVien;

@Repository
public interface NhanVienRepo extends JpaRepository<NhanVien, String>{
	
	@Query(value = "SELECT * FROM kttkpm_qlchuyenbay_db.nhanvien where Luong < 10000;", nativeQuery = true)
	public List<NhanVien> finNhanViensByLuong();
	
	@Query(value = "SELECT sum(Luong) FROM kttkpm_qlchuyenbay_db.nhanvien;", nativeQuery = true)
	public Long sumLuongNV();
	
	@Query(value = " select * from nhanvien n join chungnhan c \n" +
            "on n.MaNV = c.MaNV join maybay m on m.MaMB = c.MaMB\n" +
            "where m.Loai like '%Boeing%'\n" +
            "group by n.MaNV, n.Ten  ", nativeQuery = true)
	public List<NhanVien> findMaPhiCongsLaiBoeing();
	
	@Query(value = " select * from nhanvien n join chungnhan c \n" +
            "on n.MaNV = c.MaNV join maybay m on m.MaMB = c.MaMB\n" +
            "where m.MaMB like '747'\n" +
            "group by n.MaNV, n.Ten  ", nativeQuery = true)
	public List<NhanVien> findPhiCongsLaiMayBayByMa();
}
