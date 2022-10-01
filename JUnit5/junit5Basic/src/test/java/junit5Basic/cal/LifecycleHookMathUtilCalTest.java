package junit5Basic.cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//@DisplayName( value = "LifeCycle")
class LifecycleHookMathUtilCalTest {

	MathUtilCal utilObj;
	
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("Instance is not created yet.");
	}
	
	@AfterAll
	static void afterAllCleanUp() {
		System.out.println("Clean up after all the test has run. All the instances have cleaned up");
	}
	
	@BeforeEach
	void init() {
		utilObj = new MathUtilCal();
	}
	
	@AfterEach
	void clean(){
		System.out.println("Clean up After Test run "+utilObj.hashCode());
	}
	
	@Test
	void testAdd() {
		int exp = 3;
		assertEquals(exp, utilObj.add(1, 2));
	}
	
	@Test
	void testCircleArea() {
		double expected = 12.566370614359172;
		double actual = utilObj.circleArea(2);
		assertEquals(expected,actual,"circleArea method is supposed to calculate the area of circle");
	}

}
