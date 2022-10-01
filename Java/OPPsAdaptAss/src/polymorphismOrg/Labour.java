package polymorphismOrg;

public class Labour extends Employee{

	private int salary;
	private int overtime;
	
	public Labour(int salary, int overtime) {
		this.salary = salary;
		this.overtime = overtime;
	}
	
	@Override
	public int getSalary() {
		return salary+overtime;
	}

}
