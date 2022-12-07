package Abstract_Factory_Pattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(String detailCar) throws Exception {
		switch (detailCar) {
		case "Car":
			return new CarFactory();
		case "ColorCar":
			return new ColorCarFactory();
		default:
			throw new Exception("Không tìm thấy!");
		}
	}
}
