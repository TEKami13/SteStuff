package com.example.jbademo.part;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Part {

    @Id
    @GeneratedValue(generator = "part_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "part_seq_gen", sequenceName = "part_seq", allocationSize = 1)
    private long partId;

    private String partName;

    public Part(String partName) {
        this.partName = partName;
    }
}
