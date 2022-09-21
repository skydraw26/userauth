package com.example.userauth.service;
import com.example.userauth.domains.projectservice;

import java.util.Collection;

public interface IProjectServiceService {
    projectservice Create(projectservice projectservice);
    Collection<projectservice> GetAll();
    projectservice GetById(Long id);
    projectservice Update(projectservice projectservice);
    Boolean Delete (Long id);
}
