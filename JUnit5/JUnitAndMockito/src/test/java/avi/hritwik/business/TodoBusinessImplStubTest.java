package avi.hritwik.business;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import av.hritwik.business.TodoBusinessImpl;
import av.hritwik.data.api.TodoService;
import avi.hritwik.data.api.TodoServiceStub;

class TodoBusinessImplStubTest {

	@Test
	void testretrieveTodosRelatedToSpring_withStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		
		List<String> springTodo = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertIterableEquals(Arrays.asList("Learn Spring MVC", "Learn Spring security"), springTodo);
	}

}
