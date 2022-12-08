package Composite_Pattern;

public class Business extends BaseComponent_Employee {
	
	public Business(int age, String name, double salary) {
		super(age, name, salary);
	}

	@Override
	public void add(BaseComponent_Employee employee) {
		
	}

	@Override
	public void remove(BaseComponent_Employee employee) {
		
	}

	@Override
	public void print() {
		System.out.println("===============");
		System.out.println("Business: \n");
		System.out.println("name: " +this.name +", " +"age: " +this.age +", " +"salary: " +this.salary);
	}

}
