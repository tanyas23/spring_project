package com.pluralsight.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.validation.BindingResult;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import com.pluralsight.service.ExerciseService;

public class TestMinutesController {
	
	@Mock
	public  ExerciseService exerciseservice;
	
	 @InjectMocks
	 public MinutesController minutescontroller=new MinutesController();
	 Exercise exercise;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		exercise=new Exercise();
		exercise.setActivity("run");
		exercise.setMinutes(10);
	}

	@Test
	public void testgetMinutes() {
		assertEquals("addMinutes", minutescontroller.getMinutes(exercise));
		
	}
	
	@Test
	public void testaddMinutes() {
		BindingResult result=mock(BindingResult.class);
		when(result.hasErrors()).thenReturn(true);
		assertEquals("addMinutes", minutescontroller.addMinutes(exercise, result));
		
	}
	
	@Test
	public void testfindAllActivities() {
		List<Activity> list=new ArrayList<Activity>();
		Activity act=new Activity();
		act.setDesc("desc");
		list.add(act);
		when(exerciseservice.findAllActivities()).thenReturn(list);
		assertNotNull(minutescontroller.findAllActivities());
		
	}

}
