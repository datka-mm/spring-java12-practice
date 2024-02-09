package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import org.example.entity.Course;
import org.example.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseRepository implements GenericRepository<Course, Long> {

    @PersistenceContext
    private EntityManagerFactory entityManagerFactory;

//    @Autowired
//    public CourseRepository(EntityManagerFactory entityManagerFactory) {
//        this.entityManagerFactory = entityManagerFactory;
//    }

    @Override
    public Course save(Course entity) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return entity;
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
