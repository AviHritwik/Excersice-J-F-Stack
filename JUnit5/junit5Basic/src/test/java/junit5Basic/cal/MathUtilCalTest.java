package junit5Basic.cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilCalTest {

	@Test
	void testAdd() {
		MathUtilCal utilCal = new MathUtilCal();
		
		int expected = 2;
		int actual = utilCal.add(1, 1);
		assertEquals(expected, actual);
	}

//	@Test
	void testAddFailure() {
		MathUtilCal utilCal = new MathUtilCal();
		
		int expected = 1;
		int actual = utilCal.add(1, 1);
		assertEquals(expected, actual,"Add method is supposed to do addition");
	}

	@Test
	void testCircleArea() {
		MathUtilCal utilObj = new MathUtilCal();
		
		double expected = 12.566370614359172;
		double actual = utilObj.circleArea(2);
		
		assertEquals(expected,actual,"circleArea method is supposed to calculate the area of circle");
	}
	
	@Test
	void testDevideByZero() {
		MathUtilCal utilObj = new MathUtilCal();
		assertThrows(ArithmeticException.class, () -> utilObj.devide(1, 0),"Divide by zero throws Arithmetic Exception");
	}
	
//	@Test
	void testDevideByZeroFailure() {
		MathUtilCal utilObj = new MathUtilCal();
		assertThrows(NullPointerException.class, () -> utilObj.devide(1, 0),"Divide by zero throws Arithmetic Exception");
	}
	
	@Test
	void testMultiplyMultiple() {
		MathUtilCal utilObj = new MathUtilCal();
		assertAll(
				() -> assertEquals(10, utilObj.multiply(5, 2)),
				() -> assertEquals(-4, utilObj.multiply(-1, 4)),
				() -> assertEquals(0 , utilObj.multiply(10, 0))
				);
	}
	
	@Test
	void testDevideMultiple() {
		MathUtilCal utilObj = new MathUtilCal();
		assertAll(
				() ->assertThrows(ArithmeticException.class, () -> utilObj.devide(1, 0),"Divide by zero throws Arithmetic Exception"),
				() -> assertEquals(-4, utilObj.devide(-4, 1),"negative Numeber ***********"),
				() -> assertEquals(10 , utilObj.devide(100, 10))
				);
	}

}
