package Composite_Pattern;

public abstract class BaseComponent_Employee {
	protected int age;
	protected String name;
	protected double salary;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public BaseComponent_Employee(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	public BaseComponent_Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public abstract void add(BaseComponent_Employee employee);
	public abstract void remove(BaseComponent_Employee employee);
	public abstract void print();
	
}
