package driverPackage;

import java.util.ArrayList;
import java.util.LinkedList;

import polymorphismOrg.Employee;
import polymorphismOrg.Labour;
import polymorphismOrg.Manager;
import singleton.SingletonClass;

@SuppressWarnings("unused")
public class DriverClass {
	public static void main(String[] s) {
		
		//Driver code for testing Singleton Class
//		SingletonClass s1 = SingletonClass.getSingleton();
//		SingletonClass s2 = SingletonClass.getSingleton();
//
//		SingletonClass s3 = SingletonClass.getSingleton();
//		SingletonClass s4 = SingletonClass.getSingleton();
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println(s4.hashCode());
		
		//Driver code for polymorphism
		Employee labourEmp = new Labour(100, 200);
		Employee managerEmp = new Manager(1000,2000);
		
		System.out.println(labourEmp.getSalary());
		System.out.println(managerEmp.getSalary());
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(managerEmp);
		empList.add(labourEmp);
		System.out.println(labourEmp.totalEmployeeeSalary(empList));
		
	}
}
