package avi.hritwik.data.api;

import java.util.Arrays;
import java.util.List;

import av.hritwik.data.api.TodoService;

public class TodoServiceStub implements TodoService{

	@Override
	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring MVC", "Jog", "Learn Spring security");
	}
	

}
