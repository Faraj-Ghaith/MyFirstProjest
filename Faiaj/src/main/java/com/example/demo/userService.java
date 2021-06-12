package com.example.demo;

import java.awt.print.Pageable;
import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.sun.istack.Nullable;
@Service
@Transactional

public class userService {
    @Autowired
    private userDao dao;




    public user saveUser(user u)
    {

        return dao.save(u);
    }
    public Collection<user> getAllUsers()
    {
        return dao.findAll();
    }
    public void removeUser(int id )
    {
        dao.deleteById(id);
    }
    public user updateUser(user u )
    {
        return dao.save(u);
    }

    public long userlength()
    {
        return dao.count();
    }





}