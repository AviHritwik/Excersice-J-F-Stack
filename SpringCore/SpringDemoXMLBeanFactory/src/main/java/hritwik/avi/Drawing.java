package hritwik.avi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import hritwik.avi.shape.Shape;
import hritwik.avi.shapeImpl.Circle;
import hritwik.avi.shapeImpl.Triangle;

public class Drawing {
	
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Shape shape = (Triangle)factory.getBean("triangle");

		shape.draw();
		
		shape = (Circle) factory.getBean("circle");
		
		shape.draw();
		
	}
	
}
