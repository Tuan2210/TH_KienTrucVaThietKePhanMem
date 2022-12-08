package Adapter_Pattern;

public class AdapteeCar {
	public void receive(String info) {
		System.out.println("Đang nhận thông tin từ AdapterCustomer");
		System.out.println(info);
		
//		if(info.equalsIgnoreCase("Honda car")) {
//			HondaCar hondaCar = new HondaCar(1, "Honda City", "500,000,000 vnd", "Tốt", "Nhật Bản");
//			System.out.println(hondaCar);
//		}
		switch (info) {
		case "Honda City car":
			HondaCar hondaCar1 = new HondaCar(1, "Honda City", "500,000,000 vnd", "Tốt", "Nhật Bản");
			System.out.println(hondaCar1);
			break;
		case "Honda Brio car":
			HondaCar hondaCar2 = new HondaCar(1, "Honda Brio", "750,000,000 vnd", "Sang", "Nhật Bản");
			System.out.println(hondaCar2);
			break;
		default:
			System.out.println("Không tìm thấy loại xe hơi này!");
			break;
		}
	}
}
