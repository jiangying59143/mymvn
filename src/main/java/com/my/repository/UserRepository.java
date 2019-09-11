package com.my.repository;

import com.my.domain.User;

import java.util.List;

public interface UserRepository {
    int insert(User user);

    List<User> findAll();

    User findById(Integer id);

    User findById2(int id);

    List<User> findByUserAndAge(String userName, Integer age);

    List<User> findByUserAndAge2(String userName, Integer age);

    int deleteById(Integer id);

    int update(User user);
}
