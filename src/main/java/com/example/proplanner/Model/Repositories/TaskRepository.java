package com.example.proplanner.Model.Repositories;

import com.example.proplanner.Model.Entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {

    // get tasks by list ID
    @Transactional
    @Query(value = "SELECT * FROM TASKS WHERE listID = ?1", nativeQuery = true)
    List<Task> getAllTasksByUserId(int listID);


    @Transactional
    @Query(value = "SELECT * FROM TASKS WHERE taskDate = ?1", nativeQuery = true)
    List<Task> getAllTasksByDate(String taskDate);
}
