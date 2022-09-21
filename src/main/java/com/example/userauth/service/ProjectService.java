package com.example.userauth.service;

import com.example.userauth.domains.project;
import com.example.userauth.repository.ProjectRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ProjectService implements IProjectService{

    private final ProjectRepo projectRepo;

    @Override
    public project Create(project project) {
        log.info("Creating a new project");
        System.out.println("Creating a new project");
        return projectRepo.save(project);

    }

    @Override
    public Collection<project> GetAll() {
        log.info("Getting all services");
        System.out.println("Getting all projects");
        return projectRepo.findAll();
    }
    @Override
    public project GetById (Long id) {
        log.info("Getting project by id");
        System.out.println("Getting project by id");
        return projectRepo.findById(id).get();

    }
    @Override
    public project Update (project project){
        log.info("Updating project...");
        System.out.println("Updating project...");
        return projectRepo.save(project);
    }
    @Override
    public Boolean  Delete (Long id) {
        log.info("Deleting a project");
        System.out.println("Deleting a project");
        projectRepo.deleteById(id);
        return true;
    }
}
