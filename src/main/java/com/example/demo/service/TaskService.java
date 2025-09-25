package com.example.demo.service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {


    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id){
        return taskRepository.findById(id)
                .orElseThrow(()->new RuntimeException("task no found"));
    }

    public Task createTask (Task task){
        if(task.getTitle().isBlank()){
            throw  new RuntimeException("El titulo esta vacio");
        }
        return taskRepository.save(task);
    }

    public Task updateTask (Task task, Long id){
        Task taskVieja = getTaskById(id);

        if(task.getTitle().isBlank()){
            throw  new RuntimeException("El titulo esta vacio");
        }

        taskVieja.setTitle(task.getTitle());
        taskVieja.setDescription(task.getDescription());
        taskVieja.setCompleted(task.getCompleted());

        return taskRepository.save(taskVieja);
    }

    public void deleteById (Long id){
        Task taskABorrar = getTaskById(id);

        taskRepository.deleteById(id);
    }
}
