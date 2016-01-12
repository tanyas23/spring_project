package com.pluralsight.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.pluralsight.model.Activity;

public class TestExerciseServiceImpl  {
	
		@Mock
		List<Activity> activities;

	 @InjectMocks
	 public ExerciseServiceImpl exerciseserviceimp=new ExerciseServiceImpl();
	Activity e;
	 @Before
	  public void setup() {
			 
	      MockitoAnnotations.initMocks(this);
	       e=new Activity();
			e.setDesc("car");
			
	}
	  
	 
	 @Test
		public void TestfindAllActivities()
	 {
		 
		
		  when(activities.add(e)).thenReturn(true);
		  activities.add(new Activity());
		 System.out.println(activities.size());
		 assertEquals(3,exerciseserviceimp.findAllActivities().size());
		
	 }
	

}
