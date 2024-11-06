package my.resume.Spring.controller;

import my.resume.Spring.model.AddressLocation;
import my.resume.Spring.service.AddressLocationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
public class AddressLocationController {

    @Autowired
    AddressLocationService addressLocationService;

    @GetMapping
    public List<AddressLocation> getAllAddresses() {
        return addressLocationService.getAll();
    }

    @GetMapping("/{id}")
    public AddressLocation getAddressById(@PathVariable Long id) {
        return addressLocationService.getById(id);
    }

    @PostMapping
    public AddressLocation createAddress(@RequestBody AddressLocation address) {
        return addressLocationService.createOrUpdate(address);
    }

    @PutMapping("/{id}")
    public AddressLocation updateAddress(@PathVariable Long id, @RequestBody AddressLocation address) {
        address.setId(id); // Set the id so it knows which object to update
        return addressLocationService.createOrUpdate(address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id) {
        addressLocationService.deleteById(id);
    }
}
