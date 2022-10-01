package lambdaAss;

import java.util.function.BiConsumer;

public class Q1 {
    //Using BiConsumer Functional Interface provided by java.lang.function library
    public static void runner(Integer a, Integer b,BiConsumer<Integer, Integer> iml) {
		iml.accept(a, b);
	}
	
	public static void main(String[] args) {
		Integer a= 60;
		Integer b = 30;
		runner(a,b,(x,y)->{
			System.out.println("Addition : "+(a+b));
			int sub = a-b > 0 ? a-b : b-a;
			int div = a>b ? b==0 ? 0 : a/b : a == 0 ? 0 : b/a;
			System.out.println("Substraction : "+ sub);
			System.out.println("Divide : "+ div);
			System.out.println("Multiply : "+(a*b));
		});
	}
}

