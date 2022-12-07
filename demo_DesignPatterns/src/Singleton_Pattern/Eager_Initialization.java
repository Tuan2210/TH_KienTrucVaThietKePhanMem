package Singleton_Pattern;

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
