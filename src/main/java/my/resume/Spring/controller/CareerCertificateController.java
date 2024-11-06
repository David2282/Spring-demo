package my.resume.Spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.resume.Spring.model.CareerCertificate;

@RestController
@RequestMapping("/api/career-certificate")
public class CareerCertificateController extends BaseCrudController<CareerCertificate, Long> {

}
