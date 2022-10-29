package org.example.dao.impl;

import org.example.configuration.Config;
import org.example.dao.TaskDao;
import org.example.model.Lesson;
import org.example.model.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TaskDaoImpl implements TaskDao {

    private final SessionFactory sessionFactory = Config.creatSessionFactory();

    @Override
    public  void SaveTack(Task task){
        Session session = Config.creatSessionFactory().openSession();
        session.beginTransaction();
        session.persist(task);
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public Task getAllTackByLessonId(Long id){
        Session session = Config.creatSessionFactory().openSession();
        session.beginTransaction();
        Task task = session.find(Task.class,id);
        session.getTransaction().commit();
        session.close();
        return task;
    }
    @Override
    public  void deleteTackById(Long id){
        Session session = Config.creatSessionFactory().openSession();
        session.beginTransaction();
        Task task =session.find(Task.class,id);
        session.remove(task);
        session.getTransaction();
        session.close();
    }
}
