package com.spring.lesson.github;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.OffsetDateTime;

public class RepositoryEvent {

    private final Type type;

    private final OffsetDateTime creationTime;

    private final Actor actor;

    private final Issue issue;

    @JsonCreator
    public RepositoryEvent(@JsonProperty("event") String type,
                           @JsonProperty("created_at") OffsetDateTime creationTime,
                           @JsonProperty("actor") Actor actor,
                           @JsonProperty("issue") Issue issue) {
        this.type = Type.valueFrom(type);
        this.creationTime = creationTime;
        this.actor = actor;
        this.issue = issue;
    }


    public Type getType() {
        return type;
    }

    public OffsetDateTime getCreationTime() {
        return creationTime;
    }

    public Actor getActor() {
        return actor;
    }

    public Issue getIssue() {
        return issue;
    }

    public enum Type {
        CLOSED("closed"),
        REOPENED("reopened");

        private String type;

        Type(String type) {this.type = type; }

        static Type  valueFrom(String type) {
            for (Type value : values()) {
                if (type.equals(value.type)) {
                    return value;
                }
            }
            throw new IllegalStateException();
        }
    }
}
