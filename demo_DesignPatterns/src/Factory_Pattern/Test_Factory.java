package Factory_Pattern;

//link yt: https://www.youtube.com/watch?v=HjBPCCdDHPo&list=PLRoAKls-7kksSBqximU9CjBgCApQVDgmX&index=3

public class Test_Factory {
	public static void main(String[] args) throws Exception {
		System.out.println("factory pattern:");
		Car car1 = CarFactory.getInfoCar("Honda");
		System.out.println("Car 1: " +car1.getCarName());
		
		System.out.println("====================");
		
		Car car2 = CarFactory.getInfoCar("Nexus");
		System.out.println("Car 2: " +car2.getCarName());
		
		System.out.println("====================");
		
		Car car3 = CarFactory.getInfoCar("Toyota");
		System.out.println("Car 3: " +car3.getCarName());
		
		System.out.println("====================");
		
//		Car car4 = CarFactory.getInfoCar("Huyndai");
//		System.out.println("Car 4: " +car4.getCarName());
//		
//		System.out.println("====================");
//		
//		Car car5 = CarFactory.getInfoCar(null);
//		System.out.println("Car 5: " +car5.getCarName());
//		
//		System.out.println("====================");
		
		Honda car6 = (Honda) CarFactory.getInfoCar("Honda");
		System.out.println("Car 6: " +car6.getCarName());
	}
}
