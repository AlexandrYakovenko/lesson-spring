package com.spring.lesson.repository;

import com.spring.lesson.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepo extends JpaRepository<Greeting, Long> {
    Greeting findByContent(String content);
}
