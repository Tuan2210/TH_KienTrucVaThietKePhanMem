package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void notifyAllObservers() {
		for (Observer observer : observers)
			observer.update(null, observer);
	}
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
}
