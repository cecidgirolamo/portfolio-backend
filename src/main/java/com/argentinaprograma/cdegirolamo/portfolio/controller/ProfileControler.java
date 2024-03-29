package com.argentinaprograma.cdegirolamo.portfolio.controller;

import com.argentinaprograma.cdegirolamo.portfolio.DTO.ExperienceDTO;
import com.argentinaprograma.cdegirolamo.portfolio.DTO.FullProfileDTO;
import com.argentinaprograma.cdegirolamo.portfolio.entities.Profile;
import com.argentinaprograma.cdegirolamo.portfolio.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "Requestor-Type", exposedHeaders = "X-Get-Header")
@RestController
public class ProfileControler {

    @Autowired
    ProfileService profileService;

    @GetMapping("profile/{userId}")
    public ResponseEntity<FullProfileDTO> getProfile(@PathVariable int userId){
        var profile = profileService.getProfileById(userId);
        return new ResponseEntity<>(profile, HttpStatus.OK);

    }

    @PostMapping("profile/{userId}/experiences")
    public ResponseEntity<?> addExperience(@PathVariable int userId, @RequestBody ExperienceDTO experience){
        profileService.addExperience(userId,experience);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
