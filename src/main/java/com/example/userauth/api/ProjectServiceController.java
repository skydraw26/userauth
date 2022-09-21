package com.example.userauth.api;

import com.example.userauth.domains.projectservice;
import com.example.userauth.service.ProjectServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ProjectServices")
@RequiredArgsConstructor
public class ProjectServiceController {

        private final ProjectServiceService projectServiceService;

        @GetMapping("/GetAll")
        public Iterable<projectservice> getProjectServices(){
            return projectServiceService.GetAll();
        }

        @GetMapping(value = "/GetServiceById/{id}")
        public projectservice GetProjectServiceById(@PathVariable Long id){
        return projectServiceService.GetById(id);
        }

        @PostMapping(value="/AddService")
        public projectservice AddProjectService(@RequestBody projectservice projectservice){
            return projectServiceService.Create(projectservice);
        }


        @DeleteMapping("/DeleteById/{id}")
        public Boolean DeleteProjectService(@PathVariable Long id){
        projectServiceService.Delete(id);
        return true;
        }


        @PutMapping("/UpdateServiceById/{id}")
        public projectservice UpdateProjectService(@RequestBody projectservice projectservice, @PathVariable Long id){
            var ps= projectServiceService.GetById(id);
            ps.setLabel(projectservice.getLabel());
            ps.setDescription(projectservice.getDescription());
            return projectServiceService.Update(ps);
        }

}
