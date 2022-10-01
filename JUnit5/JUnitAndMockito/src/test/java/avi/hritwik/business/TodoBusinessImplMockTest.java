package avi.hritwik.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import av.hritwik.business.TodoBusinessImpl;
import av.hritwik.data.api.TodoService;

class TodoBusinessImplMockTest {

	@Test
	void testretrieveTodosRelatedToSpring_withMock() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Jog", "Learn Spring security");
		
		when(todoServiceMock.retrieveTodos("dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		
		List<String> springTodo = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		assertIterableEquals(Arrays.asList("Learn Spring MVC", "Learn Spring security"), springTodo);
	}

	@Test
	public void usingMockito() {
		TodoService todoService = mock(TodoService.class);
		List<String> allTodos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");
		when(todoService.retrieveTodos("Ranga")).thenReturn(allTodos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Ranga");
		assertEquals(2, todos.size());
	}
	
	@Test
	public void usingMockito_argumentCaptor() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> allTodos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");
		when(todoServiceMock.retrieveTodos("Ranga")).thenReturn(allTodos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);
		
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Ranga");
		
		Mockito.verify(todoServiceMock).retrieveTodos(stringArgumentCaptor.capture());
		
		assertEquals("Ranga", stringArgumentCaptor.getValue());
	}

}
