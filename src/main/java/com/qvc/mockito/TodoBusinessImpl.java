package com.qvc.mockito;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {

	private TodoService todoService;
	
	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}
	
	public List<String> getTodosBasedOnInput(String input) {
		List<String> resultList = new ArrayList<String>();
		for (String s : todoService.getTodos()) {
			if(s.contains(input)) {
				resultList.add(s);
			}
		}
		return resultList;
	}
}
