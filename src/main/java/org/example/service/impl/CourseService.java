package org.example.service.impl;

import jakarta.transaction.Transactional;
import org.example.config.HibernateConfig;
import org.example.entity.Course;
import org.example.repository.GenericRepository;
import org.example.repository.impl.CourseRepository;
import org.example.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements GenericService<Course, Long> {

    private final GenericRepository genericRepository;

    @Autowired
    public CourseService(@Qualifier("courseRepository") GenericRepository genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    public Course save(Course entity) {
        return (Course) genericRepository.save(entity);
    }

    @Override
    public Course findById(Long aLong) {
        return null;
    }

    @Override
    public List<Course> getAll() {
        return null;
    }

    @Override
    public Course updateById(Long aLong, Course newEntity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
