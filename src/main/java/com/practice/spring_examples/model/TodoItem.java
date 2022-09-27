package com.practice.spring_examples.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data       // This annot is used to generate the getter/setter, equals/hashcode and couple other methods that represents the data
@EqualsAndHashCode(of = "id")       // This is used to restrict the equals/hashcode to be generated only for the id field
//@EqualsAndHashCode(of = {"id", "title"})      // In case we want multiple fields
public class TodoItem {

    // == fields ==

    private int id;
    private String title;
    private String details;
    private LocalDate deadline;

    // == constructors ==

    public TodoItem(String title, String details, LocalDate deadline) {
        this.title = title;
        this.details = details;
        this.deadline = deadline;
    }

}
