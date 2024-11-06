package my.resume.Spring.controller;

import my.resume.Spring.model.Accomplishments;
import my.resume.Spring.service.AccomplishmentsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/accomplishments")
public class AccomplishmentsController {

    @Autowired
    AccomplishmentsService accomplishmentsService;

    @GetMapping
    public List<Accomplishments> getAllAccomplishments() {
        return accomplishmentsService.getAll();
    }

    @GetMapping("/{id}")
    public Accomplishments getAccomplishmentsById(@PathVariable Long id) {
        return accomplishmentsService.getById(id);
    }

    @PostMapping
    public Accomplishments saveAccomplishments(@RequestBody Accomplishments accomplishments) {
        return accomplishmentsService.createOrUpdate(accomplishments);
    }

    @PutMapping("/{id}")
    public Accomplishments updateAccomplishments(@PathVariable Long id, @RequestBody Accomplishments accomplishments) {
        accomplishments.setId(id); // Set the id so it knows which object to update
        return accomplishmentsService.createOrUpdate(accomplishments);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccomplishments(@PathVariable Long id) {
        accomplishmentsService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
