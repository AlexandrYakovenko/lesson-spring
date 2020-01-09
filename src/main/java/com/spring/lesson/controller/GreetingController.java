package com.spring.lesson.controller;

import com.spring.lesson.entity.Greeting;
import com.spring.lesson.service.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    public static final String template = "Hello, %s!";

    public static AtomicLong counter = new AtomicLong();

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    @ResponseBody
    public ResponseEntity<Greeting> greeting(@RequestParam(defaultValue = "World") String name) {

        Optional<Greeting> greeting = greetingService.findByName(name);
        if (!greeting.isPresent()) {
            greetingService.saveGreeting(name);
            greeting = greetingService.findByName(name);
        }

        return ResponseEntity.of(greeting);
    }

}
