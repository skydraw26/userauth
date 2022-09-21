package com.example.userauth.repository;

import com.example.userauth.domains.projectservice;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectServiceRepo extends JpaRepository<projectservice,Long> {

}
