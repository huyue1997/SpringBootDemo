package com.offcn.springbootdemo.repository;

import com.offcn.springbootdemo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposity extends JpaRepository<User,Long> {
}
