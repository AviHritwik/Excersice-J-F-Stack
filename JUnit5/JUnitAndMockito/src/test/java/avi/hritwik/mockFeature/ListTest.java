package avi.hritwik.mockFeature;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ListTest {
	
	@Test
	void testListSize() {
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(2);
		assertEquals(listMock.size(),2);
		assertEquals(listMock.size(),2);
	}
	
//	@Test
	void testListSize_ReturnMultipleValue_fail() {
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(listMock.size(),2);
		assertEquals(listMock.size(),2);
	}
	
	@Test
	void testListSize_ReturnMultipleValue() {
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertAll(
				() -> assertEquals(listMock.size(),2),
				() -> assertEquals(listMock.size(),3),
				() -> assertEquals(listMock.size(),3),
				() -> assertEquals(listMock.size(),3),
				() -> assertEquals(listMock.size(),3)

				);
		
	
	}
	
	@Test
	void testListGet() {
		List listMock = mock(List.class);
		
		when(listMock.get(1)).thenReturn("This is the object");
		
		assertEquals("This is the object", listMock.get(1));
	}
	
	@Test
	void testListGet_ForMultipleInput() {
		List listMock = mock(List.class);
		
		when(listMock.get(anyInt())).thenReturn("This is the object");
		
		assertAll(
				() -> assertEquals("This is the object", listMock.get(1)),
				() -> assertEquals("This is the object", listMock.get(2001)),
				() -> assertEquals("This is the object", listMock.get(10)),
				() -> assertEquals("This is the object", listMock.get(4))
				);
//		assertEquals("This is the object", listMock.get(1));
	}
	
	@Test
	void testListGet_ThrowingException() {
		List listMock = mock(List.class);
		when(listMock.get(11)).thenThrow(new NullPointerException("Null pointer Exception raised"));
		
		assertThrows(NullPointerException.class,() -> listMock.get(11));
	}

}