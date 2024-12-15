package com.todo.todo.Repository;
import java.util.*;
import org.springframework.stereotype.Repository;
import com.todo.todo.Model.TodoModel;

@Repository
public class TodoRepo {
    private List<TodoModel> list=new ArrayList<>();
    public TodoRepo(){
        System.out.println("Inintializing Repo...");
        list.add(new TodoModel(1,"Frontend Development","Revise all the concept","18-12-2024"));
        list.add(new TodoModel(2,"Frontend Development","Revise all the concept","18-12-2024"));
        list.add(new TodoModel(3,"Frontend Development","Revise all the concept","18-12-2024"));
        list.add(new TodoModel(4,"Frontend Development","Revise all the concept","18-12-2024"));
    }
    public List<TodoModel> getAllData(){ return list;}
    public void addTask(TodoModel task){
        list.add(task);
        System.out.println("Task added Successfully..."+task);
    }
    public void update(TodoModel entity){
        list.forEach(data->{
            if(data.getTodoId()==entity.getTodoId()){
                data.setTodoTitle(entity.getTodoTitle());
                data.setTodoDescription(entity.getTodoDescription());
                data.setDeadLine(entity.getDeadLine());
                System.out.println("Task Updated ...");
            }
            else{
                System.out.println("Data not found...");
            }
        });
    }
    public void delete(int data){
        list.removeIf(item -> item.getTodoId() == data);   
    }
}
