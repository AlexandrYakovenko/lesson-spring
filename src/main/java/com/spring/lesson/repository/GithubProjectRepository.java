package com.spring.lesson.repository;

import com.spring.lesson.events.GithubProject;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GithubProjectRepository extends PagingAndSortingRepository<GithubProject, Long> {

    GithubProject findByRepoName(String repoName);
}
