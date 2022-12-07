package Singleton_Pattern;

public class Test_Singleton {
	//link yt: https://www.youtube.com/watch?v=UxdpuhF56NU&list=PLRoAKls-7kksSBqximU9CjBgCApQVDgmX&index=2
	
	public static void main(String[] args) {
		Eager_Initialization eager1 = Eager_Initialization.getInstance();
		eager1.setName("John");
		System.out.println("Eager1: " +eager1.getName());
		
		Eager_Initialization eager2 = Eager_Initialization.getInstance();
		System.out.println("Eager2: " +eager2.getName());
	}
}
