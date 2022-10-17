package com.example.proplanner.Model.Services;

import com.example.proplanner.Model.Entities.User;
import com.example.proplanner.Model.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDAO {

    @Autowired
    private UserRepository repository;

    /*
        check if user exists in the database and if it does, return null
        if user doesn't exist in the database, create a new user
    */
    public User save(User user){
        //List<String> userExists = repository.userExists(user.getUsername());
        //if(userExists.isEmpty())
            return repository.save(user);
        //return null;
    }

    //retrieve one user by ID
    public User getUserById(int id){
        return repository.getUserByID(id);
    }

    public User checkUserExists(String username){
        List<String> userExists = repository.userExists(username);
        if(!userExists.isEmpty())
            return repository.getUser(username);
        return null;
    }

    //retrieve all users from the database and return them in the form of a list
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(users::add);
        return users;
    }

    //delete
    public void delete(User user){
        repository.delete(user);
    }
}

