package Abstract_Factory_Pattern;

public abstract class AbstractFactory {
	abstract Car getCar(String carName) throws Exception;
	abstract ColorCar getColorCar(String colorName) throws Exception;
}
