package State_Pattern;

public class Test_State {
	public static void main(String[] args) {
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction((javax.naming.Context) context);
		
		System.out.println(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction((javax.naming.Context) context);
		
		System.out.println(context.getState().toString());
	}
}
