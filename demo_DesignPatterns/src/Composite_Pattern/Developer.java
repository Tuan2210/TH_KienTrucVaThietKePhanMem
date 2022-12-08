package Composite_Pattern;

//node leaf (nhỏ  nhất) ko có  add, remove
public class Developer extends BaseComponent_Employee {
	
	public Developer(int age, String name, double salary) {
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
		System.out.println("Dev: \n");
		System.out.println("name: " +this.name +", " +"age: " +this.age +", " +"salary: " +this.salary);
	}

}
