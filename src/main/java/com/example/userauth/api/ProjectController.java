package com.example.userauth.api;

import com.example.userauth.domains.project;
import com.example.userauth.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Projects")
@RequiredArgsConstructor
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping("/GetAll")
    public Iterable<project> GetAllProjects(){
        return projectService.GetAll();
    }
    @GetMapping("/GetProjectById/{id}")
    public project GetProjectById(@PathVariable Long id){
        return projectService.GetById(id);
    }
    @PostMapping("/AddProject")
    public project AddProject(@RequestBody project project){
        return projectService.Create(project);
    }
    @DeleteMapping("/DeleteProjectById/{id}")
    public Boolean DeleteProject(@PathVariable Long id){
        projectService.Delete(id);
        return true;
    }
    @PutMapping("/UpdateProjectById/{id}")
    public project UpdateProject (@RequestBody project project, @PathVariable Long id){
        var p = projectService.GetById(id);
        p.setName(project.getName());
        p.setDescription(project.getDescription());
        return projectService.Update(p);

    }

}
