package com.example.userauth.repository;

import com.example.userauth.domains.appuser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<appuser , Long> {
    appuser findByUsername(String username);
}
