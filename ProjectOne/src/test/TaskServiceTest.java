package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.Task;
import main.TaskService;

public class TaskServiceTest {
	
	@Test
	void testaddTaskService() {
		TaskService service = new TaskService();
		Task task = new Task("1", "taskone", "uncover errors in a mobile application");
		Task task2 = new Task("12", "fixWebsite", "uncover errors in a web application");
		Task task3 = new Task("1", "fixCode", "uncover errors in the code");
		assertEquals(true, service.addTask(task));
		assertEquals(true, service.addTask(task2));
		assertEquals(false, service.addTask(task3));
	}
	
	@Test
	void testdeleteTaskService() {
		TaskService service = new TaskService();
		Task task = new Task("145", "MobileApp", "uncover errors in a mobile application");
		assertEquals(true, service.addTask(task));
		assertEquals(true, service.deleteTask("145"));
	}
	
	@Test
	void testupdateTaskService() {
		TaskService service = new TaskService();
		Task task = new Task("1234", "fixWebsite", "uncover errors in a web application");
		Task task2 = new Task("12345", "fixCode", "uncover errors in the code");
		assertEquals(true, service.addTask(task));
		assertEquals(true, service.addTask(task2));
		assertEquals(true, service.updateTaskName("1234", "WebApp"));
		assertEquals(true, service.updateTaskDescription("12345", "fix errors in the code"));
	}
}
