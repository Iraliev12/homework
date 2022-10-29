package org.example;

import org.example.dao.InstructorDao;
import org.example.dao.impl.CourseDaoImpl;
import org.example.dao.impl.InstructorDaoimpl;
import org.example.dao.impl.TaskDaoImpl;
import org.example.model.Course;
import org.example.model.Instructor;
import org.example.model.Lesson;
import org.example.model.Task;
import org.example.service.impl.LessonServiceImpl;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


 Course course = new Course("peaksoft",2020,"peaksoft.com","Курс по IT");

 Course course1 = new Course("makers",2019,"makers.com","IT academy");


        Instructor instructor = new Instructor("Mukhamed",
                "Allanov","allanov21@gmail.com",0755050505);


        Instructor instructor1 = new Instructor("aisalbek",
                "aisalbekov","aisal221@gmail.com",0222022212);


        Lesson lesson = new Lesson("hibarnate","www.yuotubepeaksoft.com");

        Lesson lesson1 = new Lesson("Relatonship","www.yuotubepeaksoft.com");


        Task task = new Task("hibarnate","mounday","peaksoft.talentlms.com");

        Task task1 = new Task("relationship","tuesday","peaksoft.talentlms.com");

        CourseDaoImpl courseDao = new CourseDaoImpl();
        InstructorDaoimpl instructorDaoimpl = new InstructorDaoimpl();
        LessonServiceImpl lessonService=new LessonServiceImpl();
        TaskDaoImpl taskDao= new TaskDaoImpl();


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Select Number :");
            String SelectNumber = scanner.nextLine();

            System.out.println();

            switch (SelectNumber) {
                case "1" -> courseDao.saveCourse(course);
                case "2" -> courseDao.getCourseById(1L);
                case "3" -> courseDao.getAllCourse();
                case "4" -> courseDao.UpdateCourse(2L, course);
                case "5" -> courseDao.deleteCourseById(1L);
                case "6" -> courseDao.getCourseByName("Курс по IT");
                case "7" -> instructorDaoimpl.SaveInstructor(instructor);
                case "8" -> instructorDaoimpl.UpdateInstructor(1L, instructor);
                case "9" -> instructorDaoimpl.getInstructorById(1L);
                case "10" -> instructorDaoimpl.getInstructorByCourseId(1L);
                case "11" -> instructorDaoimpl.DeleteInstructorById(1L);
                case "12" -> instructorDaoimpl.assignInstructorToCourse(course.getId(), instructor.getId());
                case "13" -> lessonService.SaveLesson(lesson);
                case "14" -> lessonService.Updatelesson(1L, lesson);
                case "15" -> lessonService.getLessonById(1L);
                case "16" -> lessonService.getLessonsByCourseId(1L);
                case "17" -> taskDao.SaveTack(task);
                case "18" -> taskDao.getAllTackByLessonId(1L);
                case "19" -> taskDao.deleteTackById(2L);
                default -> System.out.println("Goood");
            }


        }


    }
}
