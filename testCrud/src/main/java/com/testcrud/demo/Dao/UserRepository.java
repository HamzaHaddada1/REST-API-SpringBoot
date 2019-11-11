package com.testcrud.demo.Dao;

import com.testcrud.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findUserByName(String name);
    int countByNameEndingWith(String letter);


@Query(value = "select * from User where name='khalil'",nativeQuery = true)
    List<User> findkhalil();

 }
