package com.example.userauth.repository;

import com.example.userauth.domains.project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<project, Long> {
}
