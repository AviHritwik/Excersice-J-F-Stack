package hritwik.avi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import hritwik.avi.shape.Shape;
import hritwik.avi.shapeImpl.Circle;
import hritwik.avi.shapeImpl.Hut;
import hritwik.avi.shapeImpl.Triangle;

public class Drawing {
	
	public static void main(String[] args) {		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Shape shape = (Triangle) context.getBean("triangle");
		
		shape.draw();		
		
		shape = (Circle) context.getBean("circle");
		
		shape.draw();
		
		shape=(Circle) context.getBean("circleWithRadius");
		shape.draw();
		
		
		shape=(Circle) context.getBean("circleWithRadiusAndColor");
		shape.draw();
		shape=(Circle) context.getBean("circleWithRadiusAndColorUsingType");
		shape.draw();
		shape=(Circle) context.getBean("circleWithRadiusAndColorUsingIndex");
		shape.draw();
		
		System.out.println("***********************************************");
		
		shape = (Hut) context.getBean("hutWithSetter");
		
		shape.draw();
	}
	
}
