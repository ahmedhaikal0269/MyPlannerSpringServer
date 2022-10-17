package com.example.proplanner.Model.Entities;

import javax.persistence.*;

@Entity(name = "LISTS")
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int listID;

    @Column
    private String listName;

    @Column
    private int numberOfTasks;

    @Column
    private int backgroundColor;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private User user;

    public ToDoList(){
        // empty constructor
    }

    public ToDoList(int listID, String listName, int numberOfTasks, int backgroundColor, User user) {
        this.listID = listID;
        this.listName = listName;
        this.numberOfTasks = numberOfTasks;
        this.backgroundColor = backgroundColor;
        this.user = user;
    }


    public int getListID() {
        return listID;
    }

    public void setListID(int listID) {
        this.listID = listID;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    public void setNumberOfTasks(int numberOfTasks) {
        this.numberOfTasks = numberOfTasks;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public int getUserID() {
        return user.getUserID();
    }
}
