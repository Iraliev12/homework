package org.example.dao;

import org.example.model.Lesson;

import java.util.List;

public interface LessonDao {
    void SaveLesson(Lesson lesson);

    void Updatelesson(Long id, Lesson lesson);

    Lesson getLessonById(Long id);

    List<Lesson> getLessonsByCourseId(Long id);
}
