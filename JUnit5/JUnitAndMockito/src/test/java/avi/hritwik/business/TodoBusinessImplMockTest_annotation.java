package avi.hritwik.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import av.hritwik.business.TodoBusinessImpl;
import av.hritwik.data.api.TodoService;

@ExtendWith(MockitoExtension.class)
class TodoBusinessImplMockTest_annotation {

	@Mock
	/*
	 * It injects a mock for the annotated class.
	 * Needs : MockitoExtension
	 */
	TodoService todoServiceMock;

	@InjectMocks
	/*
	 * It checks the dependency of the annotated class,
	 * If the there is some class required class that has a mock
	 * then those mock will be injected and a new instance of the annotated class is injected.
	 * Needs : MockitoExtension
	 */
	TodoBusinessImpl todoBusinessImpl;

	@Captor
	/*
	 * Creates a object for ArgumentCaptor
	 * Needs : MockitoExtension
	 */
	ArgumentCaptor<String> stringArgumentCaptor;

	@Test
	void testretrieveTodosRelatedToSpring_withMock() {
		List<String> todos = Arrays.asList("Learn Spring MVC", "Jog", "Learn Spring security");
		when(todoServiceMock.retrieveTodos("dummy")).thenReturn(todos);
		List<String> springTodo = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		assertIterableEquals(Arrays.asList("Learn Spring MVC", "Learn Spring security"), springTodo);
	}

	@Test
	public void usingMockito() {
		List<String> allTodos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");
		when(todoServiceMock.retrieveTodos("Ranga")).thenReturn(allTodos);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Ranga");
		assertEquals(2, todos.size());
	}

	@Test
	public void usingMockito_argumentCaptor() {
		List<String> allTodos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");
		when(todoServiceMock.retrieveTodos("Ranga")).thenReturn(allTodos);
		ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Ranga");
		Mockito.verify(todoServiceMock).retrieveTodos(stringArgumentCaptor.capture());
		assertEquals("Ranga", stringArgumentCaptor.getValue());
	}

	@Test
	public void usingMockito_argumentCaptor_WithAnnotation() {
		List<String> allTodos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");
		when(todoServiceMock.retrieveTodos("Ranga")).thenReturn(allTodos);
		
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Ranga");
		
		Mockito.verify(todoServiceMock).retrieveTodos(stringArgumentCaptor.capture());
		
		assertEquals("Ranga", stringArgumentCaptor.getValue());
	}


}
