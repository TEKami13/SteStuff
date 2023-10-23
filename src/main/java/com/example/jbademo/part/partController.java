package com.example.jbademo.part;

import com.example.jbademo.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/part")
public class partController {

    private final PartService partService;

    @Autowired
    public partController(PartService partService) {
        this.partService = partService;
    }

    @GetMapping
    public List<Part> getPart() {
        return partService.getPart();
    }

    @GetMapping("/{id}")
    public Part getOPartById(@PathVariable Long id) {
        return partService.getPartById(id);
    }

    @PostMapping
    public Part createPart(@RequestBody Part part) {
        return partService.createPart(part);
    }

    @DeleteMapping("/{id}")
    public void deletePartById(@PathVariable Long id) {
        partService.deletePartById(id);
    }

    @PutMapping
    public Part updatePart(Part part) {
        return partService.updatePart(part);
    }

    @PutMapping("/name")
    public Part updatePartById(@RequestBody Part part){
        return partService.updatePartName(part);
    }
}
