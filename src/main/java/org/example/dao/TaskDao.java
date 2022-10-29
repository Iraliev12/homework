package org.example.dao;

import org.example.model.Task;

public interface TaskDao {
    void SaveTack(Task task);

    Task getAllTackByLessonId(Long id);

    void deleteTackById(Long id);
}
