package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.ClassStGtMeth;

public interface JpaRepo extends JpaRepository<ClassStGtMeth, Integer>{

}
