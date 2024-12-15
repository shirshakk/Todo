package com.todo.todo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.todo.Model.TodoModel;
import com.todo.todo.Repository.TodoRepo;

@Service
public class TodoService {
    @Autowired
    private TodoRepo repo;

    public List<TodoModel> getAllData(){
        List<TodoModel>tasks= repo.getAllData();
        System.out.println("Fetched item"+tasks.size());
        return tasks;
    }
    public void addTask(TodoModel task){
        repo.addTask(task);
    }
    public void update(TodoModel entity){
        repo.update(entity);
    }
    public void delete(int data){
        repo.delete(data);
    }
}
