package com.example.jbademo.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<Address> getAddress() {
        return addressService.getAddress();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddressById(@RequestBody Long id) {
        addressService.deleteAddressById(id);
    }

    @PutMapping
    public Address updateAddress(Address address) {
        return addressService.updateAddress(address);
    }

    @PutMapping("/streetName")
    public Address updateAddressStreetNameById(@RequestBody Address address) {
        return addressService.updateAddressStreetName(address);
    }

    @PutMapping("/city")
    public Address updateAddressCityById(@RequestBody Address address) {
        return addressService.updateAddressCity(address);
    }

    @PutMapping("/country")
    public Address updateAddressCountryById(@RequestBody Address address) {
        return addressService.updateAddressCountry(address);
    }

    @PutMapping("/zipCode")
    public Address updateAddressZipCodeById(@RequestBody Address address) {
        return addressService.updateAddressZipCode(address);
    }

    @PutMapping("/state")
    public Address updateAddressStateById(@RequestBody Address address) {
        return addressService.updateAddressState(address);
    }

    @PutMapping("/county")
    public Address updateAddressCountyById(@RequestBody Address address) {
        return addressService.updateAddressCounty(address);
    }
}
