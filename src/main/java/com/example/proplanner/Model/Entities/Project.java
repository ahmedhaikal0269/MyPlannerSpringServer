package com.example.proplanner.Model.Entities;

import javax.persistence.*;

@Entity(name = "PROJECTS")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectID;
    @Column
    private String projectTitle;
    @Column
    private int numOfMembers;
    @Column
    private int numOfProjectTasks;

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public int getNumOfMembers() {
        return numOfMembers;
    }

    public void setNumOfMembers(int numOfMembers) {
        this.numOfMembers = numOfMembers;
    }

    public int getNumOfProjectTasks() {
        return numOfProjectTasks;
    }

    public void setNumOfProjectTasks(int numOfProjectTasks) {
        this.numOfProjectTasks = numOfProjectTasks;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectID=" + projectID +
                ", projectTitle='" + projectTitle + '\'' +
                ", numOfMembers=" + numOfMembers +
                ", numOfProjectTasks=" + numOfProjectTasks +
                '}';
    }
}
