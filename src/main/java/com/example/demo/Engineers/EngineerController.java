package com.example.demo.Engineers;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/engineers")
public class EngineerController {

    private final EngineerService engineerService;

    public EngineerController(EngineerService engineerService) {
        this.engineerService = engineerService;
    }

    @GetMapping("")
    List<EngineerDTO> findAll() {
        return engineerService.getAllEngineers();
    }

    @GetMapping("/{id}")
    EngineerDTO findById(@PathVariable Long id) {
        return engineerService.getEngineerById(id);
    }

    @GetMapping("/project/{id}")
    List<EngineerDTO> findByProject(@PathVariable Long id) {
        return engineerService.getByProjectId(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void create(@Valid @RequestBody EngineerDTO engineer) {
        engineerService.addEngineer(engineer);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update(@Valid @RequestBody EngineerDTO engineer, @PathVariable Long id) {
        engineerService.updateEngineer(engineer, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) {
        engineerService.delete(id);
    }


//    @GetMapping("/project/{id}")
//    List<Engineer>  findByProject(@PathVariable Integer id) {
//        List<Engineer> engineer = engineerRepository.findByProjectId(id);
//        if(engineer.isEmpty()) {
//            throw new RuntimeException("Engineer not found :(");
//        }
//        return engineer;
//    }

//    @GetMapping("/project")
//    List<Project> findAllProjects() {return engineerRepository.findAllProjects();}

//    @GetMapping("/project/manager/{id}")
//    Project findProjectWManager(@PathVariable Integer id) {return engineerRepository.findProjectWManager(id);}




}
