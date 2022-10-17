package com.example.proplanner.Model.Repositories;

import com.example.proplanner.Model.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Transactional
    @Query (value = "SELECT username " +
            "FROM users " +
            "WHERE userName = ?1", nativeQuery = true )
    List<String> userExists(String userName);

    @Transactional
    @Query (value = "SELECT * FROM users WHERE username = ?1", nativeQuery = true )
    User getUser(String username);

    @Transactional
    @Query (value = "SELECT * " +
            "FROM users " +
            "WHERE userid = ?1", nativeQuery = true )
    User getUserByID(int id);
}
