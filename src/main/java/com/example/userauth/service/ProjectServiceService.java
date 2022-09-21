package com.example.userauth.service;

import com.example.userauth.domains.projectservice;
import com.example.userauth.repository.ProjectServiceRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ProjectServiceService implements IProjectServiceService {

private final ProjectServiceRepo projectServiceRepo;

    @Override
    public projectservice Create (projectservice projectservice) {
        log.info("Creating Service..");
        return projectServiceRepo.save(projectservice);
    }


    @Override
    public Collection<projectservice> GetAll() {
        log.info("Getting all services");
        return projectServiceRepo.findAll();
    }

    @Override
    public projectservice GetById(Long id) {
        log.info("Getting Service..");
        return projectServiceRepo.findById(id).get();
    }

    @Override
    public projectservice Update(projectservice projectservice) {
        log.info("Updating Service..");
        return projectServiceRepo.save(projectservice);
    }

    @Override
    public Boolean Delete(Long id) {
        log.info("Deleting Service..");
        projectServiceRepo.deleteById(id);
        return true;
    }




}
