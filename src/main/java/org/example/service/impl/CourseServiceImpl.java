package org.example.service.impl;

import org.example.dao.CourseDao;
import org.example.dao.impl.CourseDaoImpl;
import org.example.model.Course;
import org.example.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    private CourseDao courseDao = new CourseDaoImpl();

    @Override
    public void saveCourse(Course course) {
        courseDao.saveCourse(course);
    }
    @Override
    public void getCourseById(Long id) {
        courseDao.getCourseById(id);
    }
    @Override
    public List<Course> getAllCourse() {
        return courseDao.getAllCourse();
    }
    @Override
    public void UpdateCourse(Long id, Course course) {
        courseDao.UpdateCourse(id, course);
    }
    @Override
    public void deleteCourseById(Long id) {
        courseDao.deleteCourseById(id);
    }
    @Override
    public void getCourseByName(String name) {
        courseDao.getCourseByName(name);
    }
}
