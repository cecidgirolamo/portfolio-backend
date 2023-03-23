package com.argentinaprograma.cdegirolamo.portfolio.DTO;

import com.argentinaprograma.cdegirolamo.portfolio.entities.Skill;
import com.argentinaprograma.cdegirolamo.portfolio.entities.Experience;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FullProfileDTO {
  private Integer id;

  private String name;

  private String lastName;

  private String degree;

  private String summary;

  private String bannerUrl;

  private String profilePhotoUrl;

  private List<Experience> experiences;

  private List<Skill> skills;
}
