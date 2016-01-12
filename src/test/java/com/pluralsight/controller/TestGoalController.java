package com.pluralsight.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.pluralsight.model.Goal;
import com.pluralsight.service.ExerciseService;


public class TestGoalController {
	
	@Mock
	public  ExerciseService exerciseservice;
	
	 @InjectMocks
	 
	 public GoalController goalcontroller=new GoalController();
	 Goal goal;
	 

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		goal=new Goal();
		goal.setMinutes(10);
	}

	@Test
	public void testaddGoal() {
		Model model=mock(Model.class);
		assertEquals("addGoal", goalcontroller.addGoal(model));
		
	}
	
	@Test
	public void testupdateGoal() {
		BindingResult result=mock(BindingResult.class);
		when(result.hasErrors()).thenReturn(true);
		assertEquals("addGoal", goalcontroller.updateGoal(goal, result));
	}

}
