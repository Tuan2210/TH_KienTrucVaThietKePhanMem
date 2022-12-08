package Observer_Pattern;

public class BinaryObserver extends Observer {
	
//	@SuppressWarnings("deprecation")
	public BinaryObserver(Subject subject){
		this.subject = subject;
//		this.subject.attach((java.util.Observer) this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " +Integer.toBinaryString(subject.getState()));
	}

}
