package com.example.proplanner.Model.Repositories;

import com.example.proplanner.Model.Entities.Project;
import com.example.proplanner.Model.Entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    // get projects by user ID
    @Transactional
    @Query(value = "SELECT * FROM Projects WHERE userID = ?1", nativeQuery = true)
    List<Project> getProjectsByUserId(int userID);

    // get users by project ID
    @Transactional
    @Query(value = "SELECT * FROM Projects WHERE userID = ?1", nativeQuery = true)
    List<Project> getUsersByProjectsID(int userID);
}
