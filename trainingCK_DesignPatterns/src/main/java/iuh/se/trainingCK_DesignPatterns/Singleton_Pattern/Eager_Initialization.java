package iuh.se.trainingCK_DesignPatterns.Singleton_Pattern;

//link yt: https://www.youtube.com/watch?v=UxdpuhF56NU&list=PLRoAKls-7kksSBqximU9CjBgCApQVDgmX&index=2

public class Eager_Initialization {
	private String name;
	private static final Eager_Initialization instance = new Eager_Initialization();
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static Eager_Initialization getInstance() {
		return instance;
	}
	
	public Eager_Initialization() {

	}
	
}
