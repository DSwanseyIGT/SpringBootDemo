package com.example.demo.Engineers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Repository
public class JdbcClientDemoRepository {

        // private List<Run> runs = new ArrayList<>();

    private static final Logger log = LoggerFactory.getLogger(JdbcClientDemoRepository.class);
    private final JdbcClient jdbcClient;

    public JdbcClientDemoRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }
//
//    public List<Engineer> findAll() {
//        return jdbcClient.sql("select * from engineers")
//                .query(Engineer.class)
//                .list();
//    }
//
//    public Optional<Engineer> findById(Integer id) {
//        return jdbcClient.sql("SELECT * FROM engineers WHERE id = :id")
//                .param("id", id)
//                .query(Engineer.class)
//                .optional();
//    }
//
//    public void create(Engineer engineers) {
//        var updated = jdbcClient.sql("INSERT INTO Engineers(id, firstName, lastName, email, title, experience, project) values(?,?,?,?,?,?, ?)")
//                .params(List.of(engineers.id(), engineers.firstName(), engineers.lastName(), engineers.email(), engineers.title(), engineers.experience(), engineers.project()))
//                .update();
//
//        Assert.state(updated == 1, "Failed to Create Run " + engineers.title());
//    }
//
//    public void update(Engineer engineers, Integer id) {
//        var updated = jdbcClient.sql("update Engineers set firstName = ?, lastName = ?, email = ?, title = ?, experience = ?, project = ? where id = ?")
//                .params(List.of(engineers.id(), engineers.firstName(), engineers.lastName(), engineers.email(), engineers.title(), engineers.experience()))
//                .update();
//
//        Assert.state(updated == 1, "Failed to update run " + engineers.title());
//    }
//
//    public void delete(Integer id) {
//        var updated = jdbcClient.sql("delete from engineers where id = :id")
//                .param("id", id)
//                .update();
//
//        Assert.state(updated == 1, "Failed to delete run "+ id);
//    }
//
//    public int count() { return jdbcClient.sql("SELECT * FROM engineers").query().listOfRows().size();}
//
//    public void saveAll(List<Engineer> engineers) {engineers.stream().forEach(this::create);}
//
//    public List<Engineer> findByProjectId(Integer id) {
//        return jdbcClient.sql("select * from engineers where project = :id")
//                .param("id", id)
//                .query(Engineer.class)
//                .list();
//    }
//
//
//    public List<Project> findAllProjects() {
//        return jdbcClient.sql("select * from projects")
//                .query(Project.class)
//                .list();
//    }
//
//    public void saveAllProjects(List<Project> projects) {projects.stream().forEach(this::createProject);}
//
//    public void createProject(Project project) {
//        var updated = jdbcClient.sql("INSERT INTO projects(id, site, projectmanagerid) values(?,?,?)")
//                .params(List.of(project.id(), project.site(), project.projectManagerId()))
//                .update();
//
//        Assert.state(updated == 1, "Failed to Create Run " + project.site());
//    }
//
////    public Object[] findProjectWManager(Integer id) {
////        return jdbcClient.sql("select * from projects INNER JOIN Engineers projects.projectmanagerid = Engineers.id")
////                .query(Project.class)
////                .list();
////    }




}
