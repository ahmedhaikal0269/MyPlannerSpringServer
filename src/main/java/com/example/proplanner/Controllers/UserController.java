package com.example.proplanner.Controllers;

import com.example.proplanner.Model.Entities.User;
import com.example.proplanner.Model.Services.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDAO userDAO;

    //get all users
    @GetMapping("/users/get-all")
    public List<User> getAllUsers(){
        return userDAO.getAllUsers();
    }

   //check if a specific user is on the list
    @GetMapping("/users/get-user/{id}")
    public User getOneUser(@PathVariable int id){
        return userDAO.getUserById(id);
    }

    @GetMapping("/users/validate-check-in/{username}")
    public User checkUserExists(@PathVariable String username){
        User user = userDAO.checkUserExists(username);
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        return user;
    }

    @PostMapping("/users/new-user")
    public User addUser(@RequestBody User user){
        return userDAO.save(user);
    }

    @DeleteMapping("users/delete-user/{userid}")
    public void deleteUser(@PathVariable int userid){
        userDAO.delete(userDAO.getUserById(userid));
    }
}
