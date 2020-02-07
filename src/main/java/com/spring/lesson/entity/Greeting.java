package com.spring.lesson.entity;

import org.springframework.context.annotation.Scope;

import javax.persistence.*;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Scope("prototype")
@Entity
@Table(name = "greeting")
public class Greeting {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "content")
    private String content;

    @Version
    @Column(name="version")
    public long version;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }


}
