package org.example.dao.impl;

import org.example.configuration.Config;
import org.example.dao.LessonDao;
import org.example.model.Course;
import org.example.model.Lesson;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class LessonDaoImpl implements LessonDao {

//    private final SessionFactory sessionFactory = Config.creatSessionFactory();


    @Override
    public  void SaveLesson(Lesson lesson){
        Session session = Config.creatSessionFactory().openSession();
        session.beginTransaction();
        session.persist(lesson);
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public void Updatelesson(Long id, Lesson lesson){
        Session session = Config.creatSessionFactory().openSession();
        session.beginTransaction();
        Lesson lesson1 = session.find(Lesson.class,id);
        lesson1.setName(lesson.getName());
        lesson1.setVideolink(lesson.getVideolink());
        lesson1.setCourseId(lesson.getCourseId());
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public  Lesson getLessonById(Long id){
        Session session =Config.creatSessionFactory().openSession();
        session.beginTransaction();
        Lesson lesson = session.find(Lesson.class,id);
        session.getTransaction().commit();
        session.close();
        return lesson;
    }
    @Override
    public List<Lesson> getLessonsByCourseId(Long id){
        Session session = Config.creatSessionFactory().openSession();
        session.beginTransaction();
        Course course = session.find(Course.class,id);
        session.getTransaction().commit();
        session.close();
        return null;
    }
}
