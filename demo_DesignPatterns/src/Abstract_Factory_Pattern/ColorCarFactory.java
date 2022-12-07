package Abstract_Factory_Pattern;

public class ColorCarFactory extends AbstractFactory {

	@Override
	Car getCar(String carName) throws Exception {
		return null;
	}

	@Override
	ColorCar getColorCar(String colorName) throws Exception {
//		return new RedCar();
		switch (colorName) {
		case "Red":
			return new RedCar();
		case "Green":
			return new GreenCar();
		default:
			throw new Exception("Không tìm thấy màu xe hơi này!");
//			return null;
		}
	}

}
