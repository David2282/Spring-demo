package my.resume.Spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.resume.Spring.model.Skills;

@RestController
@RequestMapping("/api/skills")
public class SkillsController extends BaseCrudController<Skills, Long> {

}
