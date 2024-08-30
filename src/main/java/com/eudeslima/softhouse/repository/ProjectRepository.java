package com.eudeslima.softhouse.repository;

import com.eudeslima.softhouse.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
