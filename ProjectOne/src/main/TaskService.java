package main;

import java.util.ArrayList;



public class TaskService {
	ArrayList<Task> tasks;
	
	public TaskService() {
		tasks = new ArrayList<>();
	}
	
	// add tasks with a unique ID
	public boolean addTask(Task newTask) {
		boolean contains = false;
		for (Task c : tasks) {
			if (c.getTaskID().equalsIgnoreCase(newTask.getTaskID())) {
				contains = true;
				break;
			}
		}

		if (!contains) {
			tasks.add(newTask);
			return true;
		} else {
			return false;
		}
	}
	
	// delete tasks per task ID.
	public boolean deleteTask(String taskID) {
		boolean deleted = false;
		for (Task c : tasks) {
			if (c.getTaskID().equalsIgnoreCase(taskID)) {
				tasks.remove(c);
				deleted = true;
				break;
			}
		}
		return deleted;
	}
	
	// update task Name
	public boolean updateTaskName(String taskID, String newTaskName) {
		boolean updated = false;
		for (Task c : tasks) {
			if (c.getTaskID().equalsIgnoreCase(taskID)) {
				c.setTaskName(newTaskName);
				updated = true;
				break;
			}
		}
		return updated;
	}
	
	// update task Description
	public boolean updateTaskDescription(String taskID, String newTaskDescription) {
		boolean updated = false;
		for (Task c : tasks) {
			if (c.getTaskID().equalsIgnoreCase(taskID)) {
				c.setTaskDescription(newTaskDescription);
				updated = true;
				break;
			}
		}
		return updated;
	}
	
	//print Tasks
	public void displayAllTasks() {
		for(Task c: tasks) {
			System.out.println(c.toString());
		}
	}
}
