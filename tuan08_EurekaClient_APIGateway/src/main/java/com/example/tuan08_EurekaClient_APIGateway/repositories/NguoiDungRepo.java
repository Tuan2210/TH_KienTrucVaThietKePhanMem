package com.example.tuan08_EurekaClient_APIGateway.repositories;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan08_EurekaClient_APIGateway.entities.NguoiDung_User;

@Repository
public interface NguoiDungRepo extends JpaRepository<NguoiDung_User, String>{
	
//	@Query(value = "SELECT * FROM nguoidung where MaND = ?", nativeQuery = true)
//	public List<NguoiDung_User> findNguoiDungByMaND(String mand);

}
