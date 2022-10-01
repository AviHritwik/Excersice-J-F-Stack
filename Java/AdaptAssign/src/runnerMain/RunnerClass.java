package runnerMain;

import java.util.Scanner;

import armstrongNumber.CheckArmstrong;
import armstrongNumber.ListArmstrong;
import cUILogin.AuthClass;
import interestCal.CalInterest;
import sort.Bubblesort;
import studentMarks.Student;

@SuppressWarnings("unused")
public class RunnerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Runner Code for Armstrong classes
//		System.out.println("Hello World");
//		int number;
//		try (Scanner sc = new Scanner(System.in)) {
//			number = sc.nextInt();
//		}
//		CheckArmstrong checker = new CheckArmstrong();
//		System.out.println(number + " is armstrong : " +checker.check(number));
//		System.out.println("Input Range for armstrong num gen : ");
//		int start,end;
//		try (Scanner sc = new Scanner(System.in)) {
//			start = sc.nextInt();
//			end = sc.nextInt();
//		}
//		ListArmstrong armList = new ListArmstrong(100, 999);
//		System.out.println(armList.getArmList());
		
		//Runner code for interest classes
//		double p,r,t;
//		try (Scanner sc = new Scanner(System.in)) {
//			p = sc.nextDouble();
//			r = sc.nextDouble();
//			t = sc.nextDouble();
//		}
//		System.out.println(p + " " + r +" "+t);
//		
//		CalInterest cal = new CalInterest(p, r, t);
//		System.out.println(cal);
		
		//Runner for Student Class
//		int a,b,c;
//		System.out.println("Enter three integer value : ");
//		try (Scanner sc = new Scanner(System.in)) {
//			a = sc.nextInt();
//			b = sc.nextInt();
//			c = sc.nextInt();
//		}
//		Student st1 = new Student(a, b, c);
//		System.out.println(st1);
		
		//Runner for CUI login
//		String userId,pass;
//		AuthClass auth = new AuthClass("abc","123");
//		int failedAttempt = 0;
//		while(failedAttempt < 3) {
//			System.out.println("Enter User ID : ");
//			userId = sc.next();
//			System.out.println("Enter Password : ");
//			pass = sc.next();
//			failedAttempt=auth.login(userId,pass);
//			if(failedAttempt == 0) {
//				System.out.println("Welcome "+userId);
//				break;
//			}
//			System.out.flush();
//			System.out.println("You have entered wrong credentials ,please enter the right credentials.");
//		}
//		if(failedAttempt >= 3) {
//			System.out.println("You have exceeded maximum retries. Closing Application.");
//		}
//		
//		sc.close();
		
		//Driver Code for bubblesort
		int[] arr = {5,12,14,6,78,19,1,23,26,35,3,7,52,86,47};
		
		Bubblesort obj = new Bubblesort();
		
		obj.bubbleSort(arr);
		for(int e : arr)
			System.out.print(e+" ");
	}

}
