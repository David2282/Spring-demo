package my.resume.Spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.resume.Spring.model.ContactInfo;

@RestController
@RequestMapping("/api/contact-info")
public class ContactInfoController extends BaseCrudController<ContactInfo, Long> {

}
