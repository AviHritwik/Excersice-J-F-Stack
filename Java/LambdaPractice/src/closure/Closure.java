package closure;

public class Closure {
	public static void main(String[] args) {
		
		int a=41;
		//a=78;
		
		process(new FunctInterface()
				{
			
					@Override
					public void printSomthing() {
						// TODO Auto-generated method stub
						//a=45;
						System.out.println("Value from outer class - a : "+a);
					}
			
				});
		/*
		 * Here, we are using anonymous class to implement the interface
		 * 	Inside the method we are using variable 'a' of outer class
		 * 	Now, when we use a outside variable
		 * 		1. Till Java 7 : That variable needs to be declared as final
		 * 		2. From Java 8 : We don't need to exclusively define it as a final variable nut that variable will be final
		 * 				If we try to update the value of 'a' (uncomment line no 7 or 15 ) it will give an error.
		 */
		
		/*
		 * Closure in Lambda : The behaviour seen by anonymous inner class will be replicated by lambda and known as closure
		 */
		
		process(()-> System.out.println("Value fetched from outer class and used in lambda - a : "+a));
		/*
		 * Here, if you see the lambda is being used inside process method - which is not a part of main method containing variable 'a'
		 * What happens is when you use the variable, compiler keeps record of that variable and keeps it associated with the lambda  
		 */
	}
	
	public static void process(FunctInterface behaviour) {
		behaviour.printSomthing();
	}
	
}

@FunctionalInterface
interface FunctInterface {
	void printSomthing();
}