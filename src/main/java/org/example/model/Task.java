package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.LAZY;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    private String deadline;
    private String stringTask;

    @ManyToOne(cascade = {DETACH, MERGE, REFRESH, PERSIST}, fetch = LAZY)
    private Lesson lesson;


    public Task(String name, String deadline, String stringTask) {
        this.name = name;
        this.deadline = deadline;
        this.stringTask = stringTask;
    }
    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", deadline='" + deadline + '\'' +
                ", stringTask='" + stringTask + '\'' +
                '}';
    }

}

