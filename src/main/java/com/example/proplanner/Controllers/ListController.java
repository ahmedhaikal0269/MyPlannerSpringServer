package com.example.proplanner.Controllers;

import com.example.proplanner.Model.Entities.ToDoList;
import com.example.proplanner.Model.Services.ListDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ListController {

    @Autowired
    private ListDAO listDAO;

    @GetMapping("/lists/get-all")
    public List<ToDoList> getLists(){
        return listDAO.getAllLists();
    }

    //get all lists for a specific user
    @GetMapping("/lists/get-lists/{userid}")
    public List<ToDoList> getLists(@PathVariable int userid){
        return listDAO.getAllListsByUserId(userid);
    }

    //create a new list
    @PostMapping("/lists/add-new-list")
    public ToDoList addList(@RequestBody ToDoList toDoList){
        return listDAO.save(toDoList);
    }

    //delete a list
    @DeleteMapping("/lists/delete-list/{listid}")
    public void deleteList(@PathVariable int listid){
        listDAO.deleteList(listid);
    }
}
