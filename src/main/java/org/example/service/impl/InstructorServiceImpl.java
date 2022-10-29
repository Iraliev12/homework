package org.example.service.impl;

import org.example.dao.InstructorDao;
import org.example.dao.impl.InstructorDaoimpl;
import org.example.model.Course;
import org.example.model.Instructor;
import org.example.service.InstructorService;

import java.util.List;

public class InstructorServiceImpl implements InstructorService {

    InstructorDao instructorDao = new InstructorDaoimpl();
    @Override
    public void SaveInstructor(Instructor instructor) {
        instructorDao.SaveInstructor(instructor);
    }
    @Override
    public void UpdateInstructor(Long id, Instructor instructor) {
        instructorDao.UpdateInstructor(id,instructor);
    }
    @Override
    public void getInstructorById(Long id) {
        instructorDao.getInstructorById(id);
    }
    @Override
    public List<Instructor> getInstructorByCourseId(Course id) {
        return instructorDao.getInstructorByCourseId(id.getId());
    }
    @Override
    public void DeleteInstructorById(Long id) {
        instructorDao.DeleteInstructorById(id);
    }
    @Override
    public void assignInstructorToCourse(Long course_id, Long instructor_id) {
        instructorDao.assignInstructorToCourse(course_id, instructor_id);
    }
}
