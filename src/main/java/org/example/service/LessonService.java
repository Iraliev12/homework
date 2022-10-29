package org.example.service;

import org.example.model.Lesson;

import java.util.List;

public interface LessonService {
    void SaveLesson(Lesson lesson);

    void Updatelesson(Long id, Lesson lesson);

    Lesson getLessonById(Long id);

    List<Lesson> getLessonsByCourseId(Long id);
}
