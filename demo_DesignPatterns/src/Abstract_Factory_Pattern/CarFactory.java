package Abstract_Factory_Pattern;

public class CarFactory extends AbstractFactory {

	@Override
	Car getCar(String carName) throws Exception {
//		return new Honda();
		switch (carName) {
		case "Honda":
			return new Honda();
		case "Toyota":
			return new Toyota();
		default:
			throw new Exception("Không tìm thấy loại xe hơi này!");
//			return null;
		}
	}

	@Override
	ColorCar getColorCar(String colorName) throws Exception {
		return null;
	}

}
