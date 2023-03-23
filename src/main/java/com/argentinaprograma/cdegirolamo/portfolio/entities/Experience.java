package com.argentinaprograma.cdegirolamo.portfolio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Experience {

    @Id
    @GeneratedValue
    private Integer id;

    private String companyName;

    private String title;

    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

    private String logoUrl;

    private ExperienceType experienceType;

}
