package hritwik.avi.shapeImpl;

import hritwik.avi.shape.Shape;

public class Rectangle implements Shape{
	
	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle with l : "+this.length+" and b : "+this.breadth);
	}

}
