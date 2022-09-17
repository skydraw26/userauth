package com.example.userauth.Repo;

import com.example.userauth.domains.role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo  extends JpaRepository<role, Long> {
    role findByName(String name);
}
