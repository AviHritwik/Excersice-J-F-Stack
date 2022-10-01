package armstrongNumber;

import java.util.ArrayList;
import java.util.List;

public class ListArmstrong {
	private int start;
	private int end;
	private List<Integer> armList;
	

	public ListArmstrong(int start, int end) {
		this.start = start;
		this.end = end;
		this.armList = this.generateArm();
	}

	public List<Integer> generateArm() {
		List<Integer> armList = new ArrayList<>();
		CheckArmstrong checker = new CheckArmstrong();
		for(int i=this.start; i<=this.end; i++) {
			if( checker.check(i) ) {
				armList.add(i);
			}
		}
		return armList;
	}
	
	public List<Integer> getArmList() {
		return armList;
	}
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
	
}
