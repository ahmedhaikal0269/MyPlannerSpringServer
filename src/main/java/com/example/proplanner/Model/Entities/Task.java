package com.example.proplanner.Model.Entities;

import javax.persistence.*;

@Entity(name = "TASKS")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskID;
    @Column
    private String task;
    @Column
    private String taskDate;
    @Column
    private String reminder;
    @Column
    private int listID;
    @Column
    private int userID;
    @Column
    private int status;
    @Column
    private int projectID;
    @Column
    private int checkboxColor;
    @Column
    private String doneBy;

    public Task() {
    }

    public Task(int taskID, String task, String date, String reminder, int listID, int userID, int status, int projectID, int checkboxColor) {
        this.taskID = taskID;
        this.task = task;
        this.taskDate = date;
        this.reminder = reminder;
        this.listID = listID;
        this.userID = userID;
        this.status = status;
        this.projectID = projectID;
        this.checkboxColor = checkboxColor;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public int getListID() {
        return listID;
    }

    public void setListID(int listID) {
        this.listID = listID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public int getCheckboxColor() {
        return checkboxColor;
    }

    public void setCheckboxColor(int checkboxColor) {
        this.checkboxColor = checkboxColor;
    }

    public String getDoneBy(){
        return doneBy;
    }

    public void setDoneBy(String doneBy) {
        this.doneBy = doneBy;
    }
}

