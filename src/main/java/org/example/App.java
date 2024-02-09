package org.example;

import org.example.config.HibernateConfig;
import org.example.entity.Course;
import org.example.service.GenericService;
import org.example.service.impl.CourseService;

import java.time.LocalDate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        GenericService<Course, Long> courseService = new CourseService();
        System.out.println(courseService.save(new Course("Java", 14000, LocalDate.of(2023, 10, 1))));
    }
}
