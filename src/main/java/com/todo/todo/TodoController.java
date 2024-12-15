package com.todo.todo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.todo.todo.Model.TodoModel;
import com.todo.todo.Service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
public class TodoController {
    @Autowired
    private TodoService service;
    @GetMapping("Todos")
    public List<TodoModel> getAllData() {
        return service.getAllData();
    }
    @PostMapping("add")
    public void addTodo(@RequestBody TodoModel task) {
        //TODO: process POST request
        
        service.addTask(task);
    }
    @PutMapping("update")
    public void updateTask(@RequestBody TodoModel entity) {
        //TODO: process PUT request
        
        service.update(entity);
    }
    @RequestMapping("delete")
    public void deleteTask(@RequestParam String data) {
        int id=Integer.parseInt(data);
        service.delete(id);
    }
    
    
    
}
