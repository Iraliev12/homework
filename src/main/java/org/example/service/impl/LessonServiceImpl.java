package org.example.service.impl;

import org.example.dao.LessonDao;
import org.example.dao.impl.LessonDaoImpl;
import org.example.model.Lesson;
import org.example.service.LessonService;

import java.util.List;

public class LessonServiceImpl implements LessonService {

    LessonDao lessonDao = new LessonDaoImpl();

    @Override
    public void SaveLesson(Lesson lesson) {
        lessonDao.SaveLesson(lesson);
    }
    @Override
    public void Updatelesson(Long id, Lesson lesson) {
        lessonDao.Updatelesson(id, lesson);
    }
    @Override
    public Lesson getLessonById(Long id) {
        return lessonDao.getLessonById(id);
    }
    @Override
    public List<Lesson> getLessonsByCourseId(Long id) {
        return lessonDao.getLessonsByCourseId(id);
    }
}
