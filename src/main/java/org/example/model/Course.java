package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "courses")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String courseName;
    private int duration;
    private String  imageLink;
    private String description;

    @ManyToMany(cascade = CascadeType.PERSIST,
            fetch = FetchType.LAZY, mappedBy = "courses")
    private List<Instructor> instructors = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "course", fetch = FetchType.LAZY)
    private List<Lesson> lessons = new ArrayList<>();

    public Course(String courseName, int duration, String imageLink, String description) {
        this.courseName = courseName;
        this.duration = duration;
        this.imageLink = imageLink;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                "duration=" + duration +
                "imageLink='" + imageLink + '\'' +
                "description='" + description + '\'' +
                '}';
    }
}

