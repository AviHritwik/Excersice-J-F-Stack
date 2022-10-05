package hritwik.avi.shapeImpl;

import hritwik.avi.shape.Shape;

public class Triangle implements Shape {

	private String type;
	public Integer angle;
	
	public Integer getAngle() {
		return angle;
	}

	public void setAngle(Integer angle) {
		this.angle = angle;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	@Override
	public void draw() {
		System.out.println("Draw "+getType()+" Triangle with angle "+getAngle());
	}
}