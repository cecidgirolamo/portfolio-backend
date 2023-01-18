package com.argentinaprograma.cdegirolamo.portfolio.service;

import com.argentinaprograma.cdegirolamo.portfolio.entities.Profile;
import com.argentinaprograma.cdegirolamo.portfolio.exception.NotFoundExeption;
import com.argentinaprograma.cdegirolamo.portfolio.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    @Autowired
    ProfileRepository profileRepository;

    public Profile getProfileById(int id){
        return profileRepository.findById(id).orElseThrow(()-> new NotFoundExeption(id));
    }

    
}
