package com.example.proplanner.Model.Repositories;

import com.example.proplanner.Model.Entities.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface ListRepository extends JpaRepository<ToDoList, Integer> {

    //get all lists for a specific user
    @Transactional
    @Query(value = "SELECT * FROM Lists WHERE userid = ?1", nativeQuery = true )
    List<ToDoList> getAllListsByUserID(int userId);

    //check if there exists a list by the same name for the same user
    @Transactional
    @Query(value = "SELECT * FROM Lists WHERE list_name = ?1 and userid = ?2", nativeQuery = true )
    List<ToDoList> checkIfListExists(String list_name);
}
