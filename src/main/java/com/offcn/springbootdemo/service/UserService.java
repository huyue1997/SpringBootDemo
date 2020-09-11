package com.offcn.springbootdemo.service;

import com.offcn.springbootdemo.pojo.User;

import java.util.List;

public interface UserService {
    //新增
    public void add(User user);
    //删除
    public void delete(Long id);
    //修改
    public void update(Long id,User user);
    //根据id获取用户
    public User getById(Long id);
    //查询全部
    public List<User> getAll();
}
