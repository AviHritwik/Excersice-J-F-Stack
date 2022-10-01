package polymorphismOrg;

public class Manager extends Employee {

	private int salary;
	private int incentive;
	
	public Manager(int salary, int incentive) {
		this.salary = salary;
		this.incentive = incentive;
	}
	
	@Override
	public int getSalary() {
		return salary+incentive;
	}

}
