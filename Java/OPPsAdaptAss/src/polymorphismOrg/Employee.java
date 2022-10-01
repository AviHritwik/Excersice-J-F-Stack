package polymorphismOrg;

import java.util.ArrayList;

public abstract class Employee {
	public abstract int getSalary();
	
    public Integer totalEmployeeeSalary(ArrayList<Employee> employeeList){
    	
    	Integer totalSalary=0;
    	
    	for(Employee e : employeeList) {
    		totalSalary += e.getSalary();
    	}
    	return totalSalary;
    }
}
