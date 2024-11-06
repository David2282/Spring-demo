package my.resume.Spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.resume.Spring.model.MissionStatement;

@RestController
@RequestMapping("/api/misison-statement")
public class MissionStatementController extends BaseCrudController<MissionStatement, Long> {

}
