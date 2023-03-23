package com.argentinaprograma.cdegirolamo.portfolio.service;

import com.argentinaprograma.cdegirolamo.portfolio.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {

  @Autowired
  ExperienceRepository experienceRepository;

  public void deleteExperience(int id){
    experienceRepository.delete(id);
  }
}
