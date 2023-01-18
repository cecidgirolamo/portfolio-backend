package com.argentinaprograma.cdegirolamo.portfolio.controller;

import com.argentinaprograma.cdegirolamo.portfolio.entities.Profile;
import com.argentinaprograma.cdegirolamo.portfolio.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileControler {

    @Autowired
    ProfileService profileService;

    @GetMapping("profile/{userId}")
    public ResponseEntity<Profile> getProfile(@PathVariable int userId){
        var profile = profileService.getProfileById(userId);
        return new ResponseEntity<>(profile, HttpStatus.OK);

    }
}
