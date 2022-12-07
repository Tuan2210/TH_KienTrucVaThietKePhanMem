package iuh.se.trainingCK_DesignPatterns.Singleton_Pattern;

public class Lazy_Initialization {
	private static Lazy_Initialization instance;

	public Lazy_Initialization() {

	}
	
	public static Lazy_Initialization getInstance() {
		if(instance == null)
			instance = new Lazy_Initialization();
		return instance;
	}
	
}
