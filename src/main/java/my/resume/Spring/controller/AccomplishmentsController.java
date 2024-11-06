package my.resume.Spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.resume.Spring.model.Accomplishments;

@RestController
@RequestMapping("/api/accomplishments")
public class AccomplishmentsController extends BaseCrudController<Accomplishments, Long> {

    
}
