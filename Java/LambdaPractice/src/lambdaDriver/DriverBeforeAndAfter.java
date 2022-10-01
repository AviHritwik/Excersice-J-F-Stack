package lambdaDriver;

import diffLambda.Before8;
import diffLambda.Printable;
import diffLambda.RunBehaviour;

public class DriverBeforeAndAfter {
	public static void main(String[] args) {
		/*
		 * This can be done before to run different kind of behaviour with the same method
		 *  Step : 
		 *  	1. Implement the function in a class
		 *  	2. Define the function in the customised way
		 *  	3. Pass the object of the class
		 */
		RunBehaviour runBehaviour = new RunBehaviour();
		
		Before8 before8 = new Before8();
		
		runBehaviour.print(before8);
		
		/*
		 * Now after Lambda, we can create a implementation of the function without implementing to a class.
		 * 
		 * Let's implement this function :
		 * 	public void print() { Syso("This is the lambde implementation"); }
		 */
		Printable lambdaImplement = () -> System.out.println("This is the lambda implementation.");
		
		/*
		 * Now we can call the same runBehaviour.print() method
		 */
		runBehaviour.print(lambdaImplement);
	}
}
