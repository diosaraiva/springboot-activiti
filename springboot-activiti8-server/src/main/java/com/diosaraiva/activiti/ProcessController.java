package com.diosaraiva.activiti;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProcessController {

    private final RepositoryService repositoryService;

    public ProcessController(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }

    @GetMapping("/process-definitions")
    public List<ProcessDefinition> listDefinitions() {
        return repositoryService.createProcessDefinitionQuery().list();
    }
}