package com.offcn.springbootdemo.service.impl;

import com.offcn.springbootdemo.pojo.User;
import com.offcn.springbootdemo.repository.UserReposity;
import com.offcn.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserReposity userReposity;

    @Override
    public void add(User user) {
        userReposity.save(user);
    }

    @Override
    public void delete(Long id) {
        userReposity.deleteById(id);
    }

    @Override
    public void update(Long id, User user) {
        user.setId(id);
        userReposity.saveAndFlush(user);
    }

    @Override
    public User getById(Long id) {
        return userReposity.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return userReposity.findAll();
    }
}
