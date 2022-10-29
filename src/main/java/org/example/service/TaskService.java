package org.example.service;

import org.example.model.Task;


public interface TaskService {
    void SaveTack(Task task);
    Task getAllTackByLessonId(Long id);
    void deleteTackById(Long id);
}
