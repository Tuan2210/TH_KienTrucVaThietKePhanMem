package iuh.se.training_kiemtra_TH.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NguoiDungServices { //khi services interface phải có class servicesImpl, còn 1 file service thì class
	
	@Autowired
	private NguoiDungRepo nguoiDungRepo;
	
	public List<NguoiDung_User> listNguoiDung_Users() {
		return nguoiDungRepo.findAll();
	}
}
