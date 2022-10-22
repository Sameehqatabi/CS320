package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import main.Task;

public class TaskTest {
	
	@Test
	void testTask() {
		Task task = new Task("12345", "taskone", "uncover errors in a mobile application");
		assertTrue(task.getTaskID().equals("12345"));
		assertTrue(task.getTaskName().equals("taskone"));
		assertTrue(task.getTaskDescription().equals("uncover errors in a mobile application"));
	}
	
	@Test
	void testTaskToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task("99988877745", "taskOneHundredThousandAndNine", "Mobile technical errors are the issues you can experience on your mobile website.");
		});

	}
	
	@Test
	void testNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task(null, null, null);
		});

	}

}
