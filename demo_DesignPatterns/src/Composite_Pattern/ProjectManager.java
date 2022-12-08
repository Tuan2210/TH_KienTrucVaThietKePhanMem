package Composite_Pattern;

import java.util.ArrayList;

public class ProjectManager extends BaseComponent_Employee {
	private ArrayList<BaseComponent_Employee> employees = new ArrayList<>();
	
	public ProjectManager(int age, String name, double salary) {
		super(age, name, salary);
	}

	@Override
	public void add(BaseComponent_Employee employee) {
		employees.add(employee);
	}

	@Override
	public void remove(BaseComponent_Employee employee) {
		employees.remove(employee);
	}

	@Override
	public void print() {
		System.out.println("===============");
		System.out.println("PM: \n");
		System.out.println("name: " +this.name +", " +"age: " +this.age +", " +"salary: " +this.salary);
		for(BaseComponent_Employee employee : employees)
			employee.print();
	}

}
