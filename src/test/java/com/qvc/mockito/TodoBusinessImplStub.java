package com.qvc.mockito;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;


public class TodoBusinessImplStub {
	
	@Test
	public void printTodos() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> fetchedList;
		fetchedList = todoBusinessImpl.getTodosBasedOnInput("java");
		assertEquals(3, fetchedList.size());
	}
}
