package iuh.se.training_kiemtra_TH.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NguoiDungController {

	@Autowired
	private NguoiDungServices nguoiDungServices;
	
	@GetMapping("/users")
	public List<NguoiDung_User> listNguoiDung_Users() {
		return nguoiDungServices.listNguoiDung_Users();
	}
}
