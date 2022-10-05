package hritwik.avi.shapeImpl;

import hritwik.avi.shape.Shape;

public class Hut implements Shape{
	private Rectangle rectangle;
	private Triangle triangle;
	
	
	
	public Hut() {
	}

	public Hut(Rectangle rectangle, Triangle triangle) {
		this.rectangle = rectangle;
		this.triangle = triangle;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	@Override
	public void draw() {
		System.out.println("Put triangle over rectangle : ");
		triangle.draw();
		rectangle.draw();
	}
}
