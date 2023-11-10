package com.spring.springboottodo.repositories;

import com.spring.springboottodo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("from User u where u.username=:username and u.password=:password")
    User findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
 
