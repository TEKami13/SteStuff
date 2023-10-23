package com.example.jbademo.part;

import com.example.jbademo.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartService {

    private final PartRepo partRepo;

    @Autowired
    public PartService(PartRepo partRepo) {
        this.partRepo = partRepo;
    }

    public List<Part> getPart() {
        return partRepo.findAll();
    }

    public Part getPartById(Long id) {
        return partRepo.findById(id).orElse(null);
    }

    public Part createPart(Part part) {
        return partRepo.save(part);
    }

    public Part updatePart(Part part) {
        return partRepo.save(part);
    }

    public void deletePartById(Long id) {
        partRepo.deleteById(id);
    }

    public Part updatePartName(Part part) {
        Part partToUpdate = partRepo.findById(part.getPartId()).orElse(null);

        if (partToUpdate != null) {
            partToUpdate.setPartName(part.getPartName());
        }
        return null;
    }

    public Part updatePartQuantity(Part part) {
        Part partToUpdate = partRepo.findById(part.getPartId()).orElse(null);

        if (partToUpdate != null) {
            partToUpdate.setPartQuantity(part.getPartQuantity());
        }
        return null;
    }

    public Part updatePartSize(Part part) {
        Part partToUpdate = partRepo.findById(part.getPartId()).orElse(null);

        if (partToUpdate != null) {
            partToUpdate.setPartSize(part.getPartSize());
        }
        return null;
    }

    public Part updatePartInStock(Part part) {
        Part partToUpdate = partRepo.findById(part.getPartId()).orElse(null);

        if (partToUpdate != null) {
            partToUpdate.setPartInStock(part.getPartInStock());
        }
        return null;
    }

    public Part updatePartColor(Part part) {
        Part partToUpdate = partRepo.findById(part.getPartId()).orElse(null);

        if (partToUpdate != null) {
            partToUpdate.setPartColor(part.getPartColor());
        }
        return null;
    }
}
