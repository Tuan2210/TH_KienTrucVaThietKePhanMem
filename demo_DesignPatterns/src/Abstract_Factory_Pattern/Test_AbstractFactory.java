package Abstract_Factory_Pattern;

//link yt: https://www.youtube.com/watch?v=bvmy8i_2rEA&list=PLRoAKls-7kksSBqximU9CjBgCApQVDgmX&index=4

public class Test_AbstractFactory {
	public static void main(String[] args) throws Exception {
		System.out.println("Test abstract factory:");
		
		AbstractFactory factory1 = FactoryProducer.getFactory("Car");
		Car car1 = (Car) factory1.getCar("Honda");
		System.out.println("Car 1: " +car1.getCarName());
		Car car2 = (Car) factory1.getCar("Toyota");
		System.out.println("Car 2: " +car2.getCarName());
//		Car car3 = (Car) factory1.getCar("Huyndai");
//		System.out.println("Car 3: " +car3.getCarName());
		
		System.out.println("====================");
		
		AbstractFactory factory2 = FactoryProducer.getFactory("ColorCar");
		ColorCar colorCar1 = factory2.getColorCar("Red");
		System.out.println("Color car 1: " +colorCar1.getColorCar());
		ColorCar colorCar2 = factory2.getColorCar("Green");
		System.out.println("Color car 2: " +colorCar2.getColorCar());
//		ColorCar colorCar3 = factory2.getColorCar("Blue");
//		System.out.println("Color car 3: " +colorCar3.getColorCar());
	}

}
