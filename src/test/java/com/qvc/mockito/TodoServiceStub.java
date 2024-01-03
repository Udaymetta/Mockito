package com.qvc.mockito;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{
	public List<String> getTodos() {
		return Arrays.asList("Learn java","Code java","Test java");
	}

}
