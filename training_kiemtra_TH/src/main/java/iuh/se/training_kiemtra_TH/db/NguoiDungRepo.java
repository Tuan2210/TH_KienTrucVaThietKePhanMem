package iuh.se.training_kiemtra_TH.db;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NguoiDungRepo extends JpaRepository<NguoiDung_User, String>{
	
//	@Query(value = "SELECT * FROM nguoidung where MaND = ?", nativeQuery = true)
//	public List<NguoiDung_User> findNguoiDungByMaND(String mand);

}
