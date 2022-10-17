package com.example.proplanner;

import com.example.proplanner.Model.Entities.User;
import com.example.proplanner.Model.Services.UserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProPlannerApplicationTests {

    @Autowired
    private UserDAO userDAO;

    @Test
    void addUserTest(){
        User user = new User();
        user.setFirstName("Nadia");
        user.setLastName("Haikal");
        user.setMail("noodle_haikal@gmail.com");
        user.setUsername("Noodle");
        user.setPassword("ElmosWorld");
        userDAO.save(user);
    }

    @Test
    void getUser(){
        List<User> users = userDAO.getAllUsers();
        System.out.println(users);
    }

}
