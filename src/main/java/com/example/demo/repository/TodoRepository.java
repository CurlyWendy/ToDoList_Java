package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.ToDo;

public interface TodoRepository extends JpaRepository<ToDo, Long> {

}
