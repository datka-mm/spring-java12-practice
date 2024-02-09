package org.example.repository.impl;

import org.example.entity.Student;
import org.example.repository.GenericRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository implements GenericRepository<Student, Long> {

    @Override
    public Student save(Student entity) {
        return null;
    }

    @Override
    public Student findById(Long aLong) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public Student updateById(Long aLong, Student newEntity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
