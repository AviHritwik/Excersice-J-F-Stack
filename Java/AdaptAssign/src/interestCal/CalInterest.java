package interestCal;

public class CalInterest {
	private double p;
	private double r;
	private double t;
	private double sI;
	private double cI;
	public CalInterest(double p, double r, double t) {
		super();
		this.p = p;
		this.r = r;
		this.t = t;
		this.sI = this.calSI();
		this.cI = this.calCI();
	}
	
	private double calSI() {
		return (this.p * this.r * this.t)/100;
	}
	
	private double calCI() {
		double temp = Math.pow((1+this.r/100), this.t);
		return (this.p*temp) - this.p;
	}
	
	public double getP() {
		return p;
	}
	public void setP(double p) {
		this.p = p;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getT() {
		return t;
	}
	public void setT(double t) {
		this.t = t;
	}
	public double getsI() {
		return sI;
	}
	
	public double getcI() {
		return cI;
	}

	@Override
	public String toString() {
		return "CalInterest [\nprinciple= " + p + ", \nrate= " + r + ", \ntime= " + t + ", \nSimple Int= " + sI + ", \nCoumpound Interest= " + cI + "\n]";
	}
	
	
}
