package Observer_Pattern;

public class HexaObserver extends Observer {
	
	public HexaObserver(Subject subject){
		this.subject = subject;
//		this.subject.attach((java.util.Observer) this);
	}

	@Override
	public void update() {
		System.out.println("Hex String: " +Integer.toHexString(subject.getState()).toUpperCase());
	}

}
