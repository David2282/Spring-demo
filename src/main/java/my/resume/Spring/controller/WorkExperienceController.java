package my.resume.Spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.resume.Spring.model.WorkExperience;

@RestController
@RequestMapping("/api/work-experience")
public class WorkExperienceController extends BaseCrudController<WorkExperience, Long> {

}
