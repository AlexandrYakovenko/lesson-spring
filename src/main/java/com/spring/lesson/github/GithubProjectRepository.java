package com.spring.lesson.github;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GithubProjectRepository extends JpaRepository<GithubProject, Long> {

    GithubProject findByRepoName(String repoName);
}
