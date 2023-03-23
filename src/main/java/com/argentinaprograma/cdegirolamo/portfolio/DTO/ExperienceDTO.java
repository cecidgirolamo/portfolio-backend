package com.argentinaprograma.cdegirolamo.portfolio.DTO;

import com.argentinaprograma.cdegirolamo.portfolio.entities.ExperienceType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExperienceDTO {

  private Integer id;

  private String companyName;

  private String title;

  private String description;

  @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
  private LocalDate startDate;

  @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
  private LocalDate endDate;

  private String logoUrl;

  private ExperienceType experienceType;
}
