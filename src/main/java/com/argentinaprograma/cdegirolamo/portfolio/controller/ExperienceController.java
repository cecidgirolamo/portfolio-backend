package com.argentinaprograma.cdegirolamo.portfolio.controller;

import com.argentinaprograma.cdegirolamo.portfolio.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "Requestor-Type", exposedHeaders = "X-Get-Header")
@RestController
public class ExperienceController {

  @Autowired
  ExperienceService experienceService;

  @PutMapping("experience/{experienceId}")
  public ResponseEntity<?> modifyExperience(@PathVariable int experienceId){
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);

  }
  @DeleteMapping  ("experience/{experienceId}")
  public ResponseEntity<?> deleteExperience( @PathVariable int experienceId){
    experienceService.deleteExperience(experienceId);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);

  }
}
