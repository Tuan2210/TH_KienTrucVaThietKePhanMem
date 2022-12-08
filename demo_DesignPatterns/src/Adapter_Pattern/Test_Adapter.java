package Adapter_Pattern;

//link yt: https://www.youtube.com/watch?v=lJZGUfh-OeM&list=PLRoAKls-7kksSBqximU9CjBgCApQVDgmX&index=7

public class Test_Adapter {
	public static void main(String[] args) {
		TargetCustomer customer1 = new AdapterBusiness(new AdapteeCar());
		customer1.sendRequest("Honda City car");
		
		System.out.println("============");
		
		TargetCustomer customer2 = new AdapterBusiness(new AdapteeCar());
		customer2.sendRequest("Honda Brio car");
		
		System.out.println("============");
		
		TargetCustomer customer3 = new AdapterBusiness(new AdapteeCar());
		customer3.sendRequest("Honda New car");
	}

}
