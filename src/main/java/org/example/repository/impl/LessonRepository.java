package org.example.repository.impl;

import org.example.entity.Lesson;
import org.example.repository.GenericRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LessonRepository implements GenericRepository<Lesson, Long> {
    @Override
    public Lesson save(Lesson entity) {
        return null;
    }

    @Override
    public Lesson findById(Long aLong) {
        return null;
    }

    @Override
    public List<Lesson> getAll() {
        return null;
    }

    @Override
    public Lesson updateById(Long aLong, Lesson newEntity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
