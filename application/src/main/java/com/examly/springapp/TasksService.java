package com.examly.springapp;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TasksService {
    @Autowired    
    TasksRepository tasksRepository;
    
    public void saveTasks(Tasks tasks) {
        tasksRepository.save(tasks);
    }
    
    public void updateTaskStatus(int taskId, String status) {
        Optional<Tasks> task = tasksRepository.findById(taskId);
        if(task.isPresent()) {
            Tasks t = task.get();
            t.setTaskStatus(status);
            tasksRepository.save(t);
        }
    }
    
    public void delete(int id) {
        tasksRepository.deleteById(id);
    }
    
    public List<Tasks> getAllTasks() {
        List<Tasks> tasks = new ArrayList<>();
        tasksRepository.findAll().forEach(tasks::add);
        return tasks;
    }
    
    public Tasks getTaskById(int id) {
        Optional<Tasks> task = tasksRepository.findById(id);
        if(task.isPresent()) {
            return task.get();
        } else {
            throw new TaskNotFoundException("Task not found with id: " + id);
        }
    }
}
