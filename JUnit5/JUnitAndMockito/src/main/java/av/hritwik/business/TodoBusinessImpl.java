package av.hritwik.business;

import java.util.ArrayList;
import java.util.List;

import av.hritwik.data.api.TodoService;
//TodoBusinessImpl SUT = System under test
//TodoService Dependency
/*
 * Suppose we are interacting with an external service with provides the implementation of the TodoService
 * Now Mockito is here to let us test our Business Impl without service implementation.
 */
public class TodoBusinessImpl {
	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user){
		List<String> filteredTodos = new ArrayList<>();
		List<String> todos = todoService.retrieveTodos(user);
		
		for(String todo : todos) {
			if(todo.contains("Spring"))
				filteredTodos.add(todo);
		}
		
		return filteredTodos;
	}
}
