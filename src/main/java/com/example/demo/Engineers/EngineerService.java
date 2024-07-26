package com.example.demo.Engineers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@Component
@Service
@Transactional
@CrossOrigin
@RequiredArgsConstructor
public class EngineerService {
    private final EngineerRepository engineerRepository;

    public EngineerDTO getEngineerById(Long id) {
        Optional<Engineer> engineer = engineerRepository.getEngineerById(id);

        if(engineer.isEmpty()) {
            return null;
        } else {
            Engineer eng = engineer.get();

            return EngineerDTO.builder()
                    .id(eng.getId())
                    .firstName(eng.getFirstName())
                    .lastName(eng.getLastName())
                    .email(eng.getEmail())
                    .title(eng.getTitle())
                    .experience(eng.getExperience())
                    .projectId(eng.getProjectId()).build();
        }

    }

    public List<EngineerDTO> getByProjectId(Long id) {
        List<EngineerDTO> engineer = engineerRepository.getEngineerByProjectId(id).stream().map(eng -> EngineerDTO.builder()
                .id(eng.getId())
                .firstName(eng.getFirstName())
                .lastName(eng.getLastName())
                .email(eng.getEmail())
                .title(eng.getTitle())
                .experience(eng.getExperience())
                .projectId(eng.getProjectId()).build()).toList();
        return engineer;
    }

    public List<EngineerDTO> getAllEngineers() {
        List<EngineerDTO> engs = engineerRepository.findAll().stream().map(eng -> EngineerDTO.builder()
                .id(eng.getId())
                .firstName(eng.getFirstName())
                .lastName(eng.getLastName())
                .email(eng.getEmail())
                .title(eng.getTitle())
                .experience(eng.getExperience())
                .projectId(eng.getProjectId()).build()).toList();

        return engs;

    }

    public Integer count() {
        return this.getAllEngineers().size();
    }

    public void addEngineer(EngineerDTO engineer) {
        Engineer eng = new Engineer();
        eng.setFirstName(engineer.firstName);
        eng.setLastName(engineer.lastName);
        eng.setEmail(engineer.email);
        eng.setTitle(engineer.title);
        eng.setExperience(engineer.experience);
        eng.setProjectId(9L);
        engineerRepository.save(eng);
    }

    public void delete(Long id) {
        Engineer engineer = engineerRepository.getDeleteById(id);

        if(engineer != null) engineerRepository.delete(engineer);
    }

    public void updateEngineer(EngineerDTO engineer, Long id) {
        Engineer eng = new Engineer();
        eng.setId(id);
        eng.setFirstName(engineer.firstName);
        eng.setLastName(engineer.lastName);
        eng.setEmail(engineer.email);
        eng.setTitle(engineer.title);
        eng.setExperience(engineer.experience);
        eng.setProjectId(engineer.projectId);

        engineerRepository.save(eng);
    }


    // public void saveAllEngineers(List<EngineerDTO> engineers) {engineers.stream().forEach(this::addEngineer);}





}
