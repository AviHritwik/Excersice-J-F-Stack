/**
 * 
 */
package armstrongNumber;

/**
 * @author Avi
 *
 */
public class CheckArmstrong {
	public boolean check(int number) {
		int sum=0,temp=number;
		while(temp!=0) {
			sum+= (int) Math.pow(temp%10,3);
			temp/=10;
		}
		return sum==number;
		
	}
}
