package com.example.demo;

import java.awt.print.Pageable;
import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sun.istack.Nullable;

import antlr.collections.List;

@Repository
public interface userDao extends JpaRepository<user,Integer>{



}
