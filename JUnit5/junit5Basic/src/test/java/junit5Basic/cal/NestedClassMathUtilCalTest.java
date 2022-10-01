package junit5Basic.cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;


@DisplayName(value="In MathUtils class")
class NestedClassMathUtilCalTest {
	
	MathUtilCal utilObj;
	
	@BeforeEach
	void init() {
		utilObj = new MathUtilCal();
	}

	@Test
	@DisplayName(value="While testing add method")
	void testAdd() {
		assertEquals(2, utilObj.add(1, 1));
	}
	
//	@Test
	@DisplayName(value="While testing add method (failure) ")
	void testAddFailure() {
		assertEquals(1, utilObj.add(1, 1),"it should return right addition");
	}
	
	@Nested
	@DisplayName(value = "While testing devide method")
	class DivideTest{
		@Test
		@DisplayName(value="with divide by zero")
		void testDevideByZero() {
			assertThrows(ArithmeticException.class, () -> utilObj.devide(1, 0),"it should throws Arithmetic Exception");
		}
		
//		@Test
		@DisplayName(value="with divide by zero(failure)")
		void testDevideByZeroFailure() {
			assertThrows(NullPointerException.class, () -> utilObj.devide(1, 0),"it should throws Arithmetic Exception");
		}
		
		@Test
		@DisplayName(value="with multiple cases")
		void testDevideMultiple() {
			assertAll(
					() ->assertThrows(ArithmeticException.class, () -> utilObj.devide(1, 0),"Divide by zero throws Arithmetic Exception"),
					() -> assertEquals(-4, utilObj.devide(-4, 1),"negative Numeber ***********"),
					() -> assertEquals(10 , utilObj.devide(100, 10))
					);
		}
		
	}


	@Nested
	@DisplayName(value="While testing circleArea method")
	class CircleAreaTest{
		/*
		 * Example of lazy loading of the string msg
		 */
		@Test
		@DisplayName(value="with radius 2")
		void testCircleArea() {
			assertEquals(12.566370614359172,utilObj.circleArea(2),() -> "it should calculate the area of circle");
		}
		
		/*
		 * Example of Repeated testing and using the repetition information
		 */
		@RepeatedTest(3)
		@DisplayName(value="repeatedly")
		void testCircleAreaRepeat(RepetitionInfo repeatitionInfo) {
			
			if(repeatitionInfo.getCurrentRepetition() == 2)
				fail("failed in "+repeatitionInfo.getCurrentRepetition()+" run");
			assertEquals(12.566370614359172,utilObj.circleArea(2),() -> "it should calculate the area of circle. ");
		}
	}
	
	@Test
	@DisplayName(value="While testing multiply method")
	void testMultiplyMultiple() {
		assertAll(
				() -> assertEquals(10, utilObj.multiply(5, 2)),
				() -> assertEquals(-4, utilObj.multiply(-1, 4)),
				() -> assertEquals(0 , utilObj.multiply(10, 0))
				);
	}
	


}
