package com.examly.springapp;

import org.springframework.data.repository.CrudRepository;

public interface TasksRepository extends CrudRepository<Tasks, Integer>
{ 
    
}
