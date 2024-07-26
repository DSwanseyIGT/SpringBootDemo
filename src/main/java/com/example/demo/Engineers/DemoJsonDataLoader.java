//package com.example.demo.Engineers;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.asm.TypeReference;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//@Component
//public class DemoJsonDataLoader implements CommandLineRunner {
//
//    private static final Logger log = LoggerFactory.getLogger(DemoJsonDataLoader.class);
//    private final EngineerService engineerService;
//    private final ObjectMapper objectMapper;
//
//    public DemoJsonDataLoader(EngineerService engineerService, ObjectMapper objectMapper) {
//        this.EngineerService = engineerService;
//        this.objectMapper = objectMapper;
//    }
//
//    @Override public void run(String... args) throws Exception {
////        if(engineerService.count() == 0) {
////            try (InputStream inputStream = TypeReference.class.getResourceAsStream("/data/projects.json")) {
////                Projects allProjects = objectMapper.readValue(inputStream, Projects.class);
////                log.info("Reading {} Projects from JSON data and saving to database.", allProjects.projects().size());
////                engineerService.saveAllProjects(allProjects.projects());
////            } catch (IOException e) {
////                throw new RuntimeException("Failed to read JSON data ", e);
////            }
////            try (InputStream inputStream = TypeReference.class.getResourceAsStream("/data/engineers.json")) {
////                EngineerDTO allEngineers = objectMapper.readValue(inputStream, EngineerDTO.class);
////                log.info("Reading {} Engineers from JSON data and saving to database.", allEngineers.engineers().size());
////                engineerService.saveAllEngineers(allEngineers.Engineers());
////            } catch (IOException e) {
////                throw new RuntimeException("Failed to read JSON data ", e);
////            }
////        } else {
////                log.info("Not loading Projects from JSON data because collection contains data");
////        }
//    }
//
//
//}
