package org.example.service;

import org.example.model.Course;

import java.util.List;

public interface CourseService {
    void saveCourse(Course course);

    void getCourseById(Long id);

    List<Course> getAllCourse();

    void UpdateCourse(Long id, Course course);

    void deleteCourseById(Long id);

    void getCourseByName(String name);
}
