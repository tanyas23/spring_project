package com.pluralsight.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.pluralsight.service.ExerciseService;

public class TestHelloController {
	
	@Mock
	public  ExerciseService exerciseservice;
	
	 @InjectMocks
	 public HelloController hellocontroller=new HelloController();

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testsayHello() {
		Model model=mock(Model.class);
		assertEquals("hello", hellocontroller.sayHello(model));
		
	}

}
