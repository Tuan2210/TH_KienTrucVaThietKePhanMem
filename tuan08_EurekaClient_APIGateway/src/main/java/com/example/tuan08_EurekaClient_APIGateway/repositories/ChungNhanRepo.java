package com.example.tuan08_EurekaClient_APIGateway.repositories;
//package com.example.tuan04_Spring_Data_JPA.repositories;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import com.example.tuan04_Spring_Data_JPA.entities.ChungNhan;
//
//@Repository
//public interface ChungNhanRepo extends JpaRepository<ChungNhan, String>{
//	
//	@Query(value = "SELECT chungnhan.MaNV FROM chungnhan "
//		 		+ "INNER JOIN maybay ON chungnhan.MaMB=maybay.MaMB where maybay.Loai like 'Boeing%';", nativeQuery = true)
//	public List<ChungNhan> findMaPhiCongsLaiBoeing();
//}
