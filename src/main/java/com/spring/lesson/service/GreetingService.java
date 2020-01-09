package com.spring.lesson.service;

import com.spring.lesson.entity.Greeting;
import com.spring.lesson.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {
    private GreetingRepo greetingRepo;

    @Autowired
    public GreetingService(GreetingRepo greetingRepo) {
        this.greetingRepo = greetingRepo;
    }

    public Optional<Greeting> findByName(String content) {
        Greeting entity = greetingRepo.findByContent(content);
        return entity != null ? Optional.of(entity)
                : Optional.empty();
    }

    public void saveGreeting(String content) {
        greetingRepo.save(new Greeting(content));
    }
}
