package com.example.userauth.service;
import com.example.userauth.domains.project;


import java.util.Collection;

public interface IProjectService {
    project Create(project project);
    Collection<project> GetAll();
    project GetById(Long id);
    project Update(project project);
    Boolean Delete (Long id);
}
