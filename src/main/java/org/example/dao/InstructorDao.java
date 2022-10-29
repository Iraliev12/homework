package org.example.dao;

import org.example.model.Course;
import org.example.model.Instructor;

import java.util.List;

public interface InstructorDao {
    void SaveInstructor(Instructor instructor);


    void UpdateInstructor(Long id, Instructor instructor);




    Instructor getInstructorById(Long id);

    List<Instructor> getInstructorByCourseId(Long id);

    void DeleteInstructorById(Long id);

    void assignInstructorToCourse(Long course_id, Long instructor_id);
}
