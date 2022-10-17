package com.example.proplanner.Model.Services;

import com.example.proplanner.Model.Entities.ToDoList;
import com.example.proplanner.Model.Repositories.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListDAO {

    @Autowired
    ListRepository listRepository;

    // GET lists for a specific user
    public List<ToDoList> getAllListsByUserId(int userId){
        return listRepository.getAllListsByUserID(userId);
    }

    // GET all lists in the database (this will never be used)
    public List<ToDoList> getAllLists() {
        List<ToDoList> all_lists = new ArrayList<>();
        Streamable.of(listRepository.findAll()).forEach(all_lists::add);
        return all_lists;
    }

    // Create a new list
    public ToDoList save(ToDoList toDoList){
        List<ToDoList> checkListExists = listRepository.checkIfListExists(toDoList.getListName());
        if(checkListExists.isEmpty())
            return listRepository.save(toDoList);
        return null;
    }

    // Delete a list for a specific user
    public void deleteList(int listid){
        listRepository.delete(listRepository.getReferenceById(listid));
    }
}
