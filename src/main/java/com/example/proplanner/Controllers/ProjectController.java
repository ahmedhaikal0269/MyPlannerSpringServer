package com.example.proplanner.Controllers;

import com.example.proplanner.Model.Entities.Project;
import com.example.proplanner.Model.Services.ProjectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectDAO projectDAO;

    // get all projects
    @GetMapping("/projects/get-all")
    public List<Project> getAllProjects(){
        return projectDAO.getAllProjects();
    }

    // get all projects for a specific user
    @GetMapping("/projects/get-projects-by-userid/{userid}")
    public List<Project> getProjectsByUserID(@PathVariable int userid){
        return projectDAO.getProjectsByUserID(userid);
    }

}
