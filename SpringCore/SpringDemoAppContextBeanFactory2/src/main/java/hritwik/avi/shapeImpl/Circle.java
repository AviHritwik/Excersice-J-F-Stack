package hritwik.avi.shapeImpl;

import hritwik.avi.shape.Shape;

public class Circle implements Shape {
	
	private double radius;
	private String color;
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(String color) {
		this.color = color;
	}
	
	public Circle(double radius,String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return this.radius;
	}
	
	public String getColor() {
		return this.color;
	}

	@Override
	public void draw() {
		System.out.println(getColor()+" circle with radius "+getRadius());
	}
}
