package com.todo.todo.Model;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TodoModel {
    private int todoId;
    private String todoTitle;
    private String todoDescription;
    private String deadLine;
}

