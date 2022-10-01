package studentMarks;

public class Student {
	private int marksA;
	private int marksB;
	private int marksC;
	private boolean promoted;
	public Student(int marksA, int marksB, int marksC) {
		super();
		int count = 0;
		this.marksA = marksA;
		if(this.marksA >=60)
			count++;
		this.marksB = marksB;
		if(this.marksB >= 60)
			count++;
		this.marksC = marksC;
		if(this.marksC >= 60)
			count++;
		this.promoted = count>=2 ? true : false;
	}
	
	
	
//	private int subjectA,subjectB,subjectC;
//
//    public int studentsTotalMarksInAllSubjects(Student[] students) {}
//
//    public double studentsAverageMarksInAllSubjects(Student[] students) {}
//    public int[] subjectWiseMarks(Student[] students,String subjectName) {}
//    public int subjectATotalByStudents(int[] marks) {}
//    public int subjectBTotalByStudents(int[] marks) {}
//    public int subjectCTotalByStudents(int[] marks) {}
//
//   public int subjectTotalByStudents(int[] marks) 
//
//    public double subjectAAverageByStudents(int[] marks) {}
//    public double subjectBAverageByStudents(int[] marks) {}
//    public double subjectCAverageByStudents(int[] marks) {}
	
	
	
	
	public int getMarksA() {
		return marksA;
	}
	public void setMarksA(int marksA) {
		this.marksA = marksA;
	}
	public int getMarksB() {
		return marksB;
	}
	public void setMarksB(int marksB) {
		this.marksB = marksB;
	}
	public int getMarksC() {
		return marksC;
	}
	public void setMarksC(int marksC) {
		this.marksC = marksC;
	}
	public boolean isPromoted() {
		return promoted;
	}
	
	@Override
	public String toString() {
		if(this.promoted) {
			return "Student PROMOTED. \n marksA=" + marksA + ", marksB=" + marksB + ", marksC=" + marksC;
		}
		return "Student not PROMOTED. \n marksA=" + marksA + ", marksB=" + marksB + ", marksC=" + marksC;

	}
}
