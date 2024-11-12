package my.resume.Spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import my.resume.Spring.model.AddressLocation;




@RestController
@RequestMapping("/api/address-location")
public class AddressLocationController extends BaseCrudController<AddressLocation, Long> {

}