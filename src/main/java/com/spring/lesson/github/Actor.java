package com.spring.lesson.github;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Actor {

    private final String login;

    private final String avatarUrl;

    private final String htmlUrl;

    @JsonCreator
    public Actor(@JsonProperty("login") String login,
                 @JsonProperty("avatar_url") String avatarUrl,
                 @JsonProperty("html_url") String htmlUrl) {
        this.login = login;
        this.avatarUrl = avatarUrl;
        this.htmlUrl = htmlUrl;
    }

    public String getLogin() {
        return login;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(login, actor.login) &&
                Objects.equals(avatarUrl, actor.avatarUrl) &&
                Objects.equals(htmlUrl, actor.htmlUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, avatarUrl, htmlUrl);
    }
}
