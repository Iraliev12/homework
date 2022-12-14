package org.example.dao.impl;

import org.example.configuration.Config;
import org.example.dao.CourseDao;
import org.example.model.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;
public class CourseDaoImpl implements CourseDao {

    private final SessionFactory sessionFactory = Config.creatSessionFactory();
    @Override
    public void saveCourse(Course course) {
        Session session=Config.creatSessionFactory().openSession();
        session.beginTransaction();
        session.persist(course);
        session.getTransaction().commit();
        System.out.println("course save successfully");
        session.close();
    }
    @Override
    public Course getCourseById(Long id) {
        Session session = Config.creatSessionFactory().openSession();
        session.beginTransaction();
        Course course = session.find(Course.class,id);
        session.getTransaction().commit();
        System.out.println("Course find by id successfully!");
        session.close();
        return course;
    }
    @Override
    public List<Course> getAllCourse() {
        Session session = Config.creatSessionFactory().openSession();
        session.getTransaction().begin();
        List<Course> course = session.createQuery("Select c from Course c ORDER BY c.imageLink",Course.class)
                .getResultList();
        session.getTransaction().commit();
        session.close();
        return course;
    }
    @Override
    public void UpdateCourse(Long id, Course course) {
        Session session = Config.creatSessionFactory().openSession();
        session.getTransaction().begin();
        Course courses = session.find(Course.class,id);
        courses.setCourseName(course.getDescription());
        courses.setDescription(course.getDescription());
        courses.setImageLink(course.getImageLink());
        courses.setDuration(course.getDuration());
        courses.setImageLink(course.getImageLink());
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public void deleteCourseById(Long id) {
        Session session = Config.creatSessionFactory().openSession();
        session.getTransaction().begin();
        Course course = session.find(Course.class,id);
            session.delete(course);
        session.getTransaction().commit();
        System.out.println("idealno  ' _ ' ");
    }
    @Override
    public Course  getCourseByName(String name) {
        Session session = Config.creatSessionFactory().openSession();
        session.getTransaction().begin();
        List<Course> courses = session.createQuery("select c from Course c", Course.class).list();
        session.getTransaction().commit();
        session.close();
        return null;
    }


}


