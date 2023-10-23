package com.example.jbademo.part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/part")
public class PartController {

    private final PartService partService;

    @Autowired
    public PartController(PartService partService) {
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
    public Part updatePartNameById(@RequestBody Part part){
        return partService.updatePartName(part);
    }

    @PutMapping("/quantity")
    public Part updatePartQuantityById(@RequestBody Part part){
        return partService.updatePartQuantity(part);
    }

    @PutMapping("/size")
    public Part updatePartSizeById(@RequestBody Part part){
        return partService.updatePartSize(part);
    }

    @PutMapping("/quantity")
    public Part updatePartInStockById(@RequestBody Part part){
        return partService.updatePartInStock(part);
    }

    @PutMapping("/quantity")
    public Part updatePartColorById(@RequestBody Part part){
        return partService.updatePartColor(part);
    }
}
