package main;

public class Task {
	private String taskID;
	private String taskName;
	private String taskDescription;
	
	public Task(String taskId, String tName, String tDescription){
		if(taskId == null || taskId.length() >= 10) {
			throw new IllegalArgumentException("Task ID cannot be longer than 10 characters or empty");
		}
		if (taskId.length() <= 10 && taskId != null ) {
			this.taskID = taskId;
		}
		if(tName.length() >= 20 || tName == null) {
			throw new IllegalArgumentException("Name cannot be longer than 20 characters or empty");
		}
		if(tDescription.length() >= 50 || tDescription == null) {
			throw new IllegalArgumentException("Description cannot be longer than 50 characters or empty");
		}
		this.taskID = taskId;
		this.setTaskName(tName);
		this.setTaskDescription(tDescription);
	}
	
	public void setTaskName(String tName) {
		if(tName.length() <= 20 && tName != null) {
			this.taskName = tName;
		}
	}
	
	public void setTaskDescription(String tDescription) {
		if(tDescription.length() <= 50 && tDescription != null) {
			this.taskDescription = tDescription;
		}
	}
	
	public String getTaskID() {
		return taskID;
	}

	public String getTaskName() {
		return taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

}
