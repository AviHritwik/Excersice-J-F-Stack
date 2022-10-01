package thisReference;

public class ThisReferenceConcept {
	public static void perform(SampleInterface obj) {
		obj.process();
	}
	
	public void performNonStatic() {
		perform(()-> {
			System.out.println("This is labda from non static method");
			System.out.println(this);
		});
	}
	public static void main(String[] args) {
		perform(new SampleInterface() {

			@Override
			public void process() {
				// TODO Auto-generated method stub
				System.out.println("This is inner anonymous class.");
				System.out.println(this + 
						"\n*************************************");
			}
			
			@Override
			public String toString() {
				return "This is the object of inner class";
			}
		});
		
		perform(() -> {
			System.out.println("This is labda inside main : \n\t"
					+ "From here 'this' reference can't be used"
					+ "\n****************************************");
			//System.out.println(this);
		});
		
		ThisReferenceConcept obj = new ThisReferenceConcept();
		obj.performNonStatic();
	}
}

@FunctionalInterface
interface SampleInterface {
	void process();
}
