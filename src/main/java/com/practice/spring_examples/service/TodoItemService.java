package com.practice.spring_examples.service;

import com.practice.spring_examples.model.TodoData;
import com.practice.spring_examples.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem todoItem);

    void removeItem(int id);

    TodoItem getItem(int id);

    void updateItem(TodoItem todoItem);

    TodoData getData();
}
