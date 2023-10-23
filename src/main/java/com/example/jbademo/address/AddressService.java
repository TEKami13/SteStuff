package com.example.jbademo.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepo addressRepo;

    @Autowired
    public AddressService(AddressRepo addressRepo) { this.addressRepo = addressRepo; }

    public List<Address> getAddress() {
        return addressRepo.findAll();
    }

    public Address getAddressById(Long id) {
        return addressRepo.findById(id).orElse(null);
    }

    public Address createAddress(Address address) {
        return addressRepo.save(address);
    }

    public Address updateAddress(Address address) {
        return addressRepo.save(address);
    }

    public void deleteAddressById(Long id) {
        addressRepo.deleteById(id);
    }

    public Address updateAddressStreetName(Address address) {
        Address addressToUpdate = addressRepo.findById(address.getAddressId()).orElse(null);

        if (addressToUpdate != null) {
            addressToUpdate.setAddressStreetName(address.getAddressStreetName());
            return addressRepo.save(addressToUpdate);
        }
        return null;
    }

    public Address updateAddressCity(Address address) {
        Address addressToUpdate = addressRepo.findById(address.getAddressId()).orElse(null);

        if (addressToUpdate != null) {
            addressToUpdate.setAddressCity(address.getAddressCity());
            return addressRepo.save(addressToUpdate);
        }
        return null;
    }

    public Address updateAddressCountry(Address address) {
        Address addressToUpdate = addressRepo.findById(address.getAddressId()).orElse(null);

        if (addressToUpdate != null) {
            addressToUpdate.setAddressCountry(address.getAddressCountry());
            return addressRepo.save(addressToUpdate);
        }
        return null;
    }

    public Address updateAddressZipCode(Address address) {
        Address addressToUpdate = addressRepo.findById(address.getAddressId()).orElse(null);

        if (addressToUpdate != null) {
            addressToUpdate.setAddressZipCode(address.getAddressZipCode());
            return addressRepo.save(addressToUpdate);
        }
        return null;
    }

    public Address updateAddressState(Address address) {
        Address addressToUpdate = addressRepo.findById(address.getAddressId()).orElse(null);

        if (addressToUpdate != null) {
            addressToUpdate.setAddressState(address.getAddressState());
            return addressRepo.save(addressToUpdate);
        }
        return null;
    }

    public Address updateAddressCounty(Address address) {
        Address addressToUpdate = addressRepo.findById(address.getAddressId()).orElse(null);

        if (addressToUpdate != null) {
            addressToUpdate.setAddressCounty(address.getAddressCounty());
            return addressRepo.save(addressToUpdate);
        }
        return null;
    }
}
