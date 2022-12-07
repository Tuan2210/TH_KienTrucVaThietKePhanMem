package Factory_Pattern;

public class CarFactory {

	private CarFactory() {

	}
	
	public static Car getInfoCar(String carName) throws Exception {
		switch (carName) {
		case "Honda":
			return new Honda();
		case "Nexus":
			return new Nexus();
		case "Toyota":
			return new Toyota();
		default:
//			throw new IllegalArgumentException("Không tìm thấy loại xe hơi này!");
			throw new Exception("Không tìm thấy loại xe hơi này!");
//			return null;
		}
	}
	
}
