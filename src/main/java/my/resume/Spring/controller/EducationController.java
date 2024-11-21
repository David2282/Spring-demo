package my.resume.Spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.resume.Spring.model.Education;

@RestController
@RequestMapping("/api/education")
public class EducationController extends BaseCrudController<Education> {

}
