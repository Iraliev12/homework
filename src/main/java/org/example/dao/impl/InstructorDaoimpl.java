package org.example.dao.impl;

import org.example.configuration.Config;
import org.example.dao.InstructorDao;
import org.example.model.Course;
import org.example.model.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;

public class InstructorDaoimpl implements InstructorDao {

    private final SessionFactory sessionFactory = Config.creatSessionFactory();

    @Override
    public void SaveInstructor(Instructor instructor) {
        Session session = Config.creatSessionFactory().openSession();
        session.beginTransaction();
        session.persist(instructor);
        session.getTransaction().commit();
        System.out.println("uspeshno");
        session.close();
    }
    @Override
    public void UpdateInstructor(Long id, Instructor instructor) {
        Session session = Config.creatSessionFactory().openSession();
        session.beginTransaction();
        Instructor instructor1 = session.find(Instructor.class, id);
        instructor1.setFirstname(instructor.getFirstname());
        instructor1.setLastname(instructor.getLastname());
        instructor1.setEmail(instructor.getEmail());
        instructor1.setPhonenumber(instructor.getPhonenumber());
        session.getTransaction();
        session.close();
    }
    @Override
    public Instructor getInstructorById(Long id) {
        Session session = Config.creatSessionFactory().openSession();
        session.beginTransaction();
        Instructor instructor = session.get(Instructor.class,id);
        session.getTransaction().commit();
        session.close();
        return null;
    }
    @Override
    public List<Instructor> getInstructorByCourseId(Long id) {
        Session session = Config.creatSessionFactory().openSession();
        session.beginTransaction();
        Course course = session.find(Course.class,id);
        session.getTransaction().commit();
        session.close();
        return course.getInstructors();
    }
    @Override
    public void DeleteInstructorById(Long id) {
        Session session=Config.creatSessionFactory().openSession();
        session.beginTransaction();
        Instructor instructor = session.find(Instructor.class,id);
        session.delete(instructor);
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public void assignInstructorToCourse(Long course_id, Long instructor_id){
        Session session = Config.creatSessionFactory().openSession();
        session.beginTransaction();
        Course course = session.find(Course.class,course_id);
        Instructor instructor = session.get(Instructor.class, instructor_id);
        instructor.getCourses().add(course);
        session.merge(instructor);

        session.getTransaction().commit();
        session.close();
    }
}



