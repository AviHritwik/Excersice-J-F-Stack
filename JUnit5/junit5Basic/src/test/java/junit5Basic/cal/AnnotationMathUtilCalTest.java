package junit5Basic.cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName(value="Annotation Example Tests")
class AnnotationMathUtilCalTest {

	
	@Test
	@DisplayName(value="Arithmetic Exp for Divide by Zero")
	void testDevideByZero() {
		MathUtilCal utilObj = new MathUtilCal();
		assertThrows(ArithmeticException.class, () -> utilObj.devide(1, 0),"Divide by zero throws Arithmetic Exception");
	}
	
	@Test
	@Disabled
	@DisplayName(value="Sample Disabled test")
	void testSample() {
	}

}
