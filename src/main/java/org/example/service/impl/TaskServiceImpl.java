package org.example.service.impl;

import org.example.dao.TaskDao;
import org.example.dao.impl.TaskDaoImpl;
import org.example.model.Task;
import org.example.service.TaskService;

public class TaskServiceImpl implements TaskService {

    TaskDao taskDao = new TaskDaoImpl();
    @Override
    public void SaveTack(Task task) {
        taskDao.SaveTack(task);
    }
    @Override
    public Task getAllTackByLessonId(Long id) {
        return taskDao.getAllTackByLessonId(id);
    }
    @Override
    public void deleteTackById(Long id) {
        taskDao.deleteTackById(id);
    }
}
