package Observer_Pattern;

public class OctalObserver extends Observer {
	
//	@SuppressWarnings("deprecation")
	public OctalObserver(Subject subject){
		this.subject = subject;
//		this.subject.attach((java.util.Observer) this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: " +Integer.toOctalString(subject.getState()));
	}

}
