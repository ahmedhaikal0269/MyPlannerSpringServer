package com.example.proplanner.Model.Services;

import com.example.proplanner.Model.Entities.Project;
import com.example.proplanner.Model.Repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectDAO {

    @Autowired
    private ProjectRepository projectRepository;

    //get all projects
    public List<Project> getAllProjects(){
        List<Project> all_projects = new ArrayList<>();
        Streamable.of(projectRepository.findAll()).forEach(all_projects::add);
        return all_projects;
    }

    //get projects for a specific user
    public List<Project> getProjectsByUserID(int userID){
        return projectRepository.getProjectsByUserId(userID);
    }
}
