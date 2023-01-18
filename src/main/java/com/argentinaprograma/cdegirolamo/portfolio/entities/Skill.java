package com.argentinaprograma.cdegirolamo.portfolio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Skill {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private double percentageDominated;

}
