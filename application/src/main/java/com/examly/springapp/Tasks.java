package com.examly.springapp;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tasks")
public class Tasks {
	 
	@Id
	private String taskId;
	private String taskHolderName;
	private String taskDate;
	private String taskName;
	private String taskStatus;
	
	public Tasks() {
	}
	public Tasks(String taskId, String taskHolderName, String taskDate, String taskName, String taskStatus) {
		this.taskId = taskId;
		this.taskHolderName = taskHolderName;
		this.taskDate = taskDate;
		this.taskName = taskName;
		this.taskStatus = taskStatus;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public void setTaskHolderName(String taskHolderName) {
		this.taskHolderName = taskHolderName;
	}
	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskId() {
		return taskId;
	}
	public String getTaskHolderName() {
		return taskHolderName;
	}
	public String getTaskDate() {
		return taskDate;
	}
	public String getTaskName() {
		return taskName;
	}
	public String getTaskStatus() {
		return taskStatus;
    }
}