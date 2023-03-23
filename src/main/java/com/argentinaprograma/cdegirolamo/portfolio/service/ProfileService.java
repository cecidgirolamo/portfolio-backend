package com.argentinaprograma.cdegirolamo.portfolio.service;

import com.argentinaprograma.cdegirolamo.portfolio.DTO.ExperienceDTO;
import com.argentinaprograma.cdegirolamo.portfolio.DTO.FullProfileDTO;
import com.argentinaprograma.cdegirolamo.portfolio.entities.Experience;
import com.argentinaprograma.cdegirolamo.portfolio.entities.Profile;
import com.argentinaprograma.cdegirolamo.portfolio.exception.NotFoundExeption;
import com.argentinaprograma.cdegirolamo.portfolio.repository.ProfileRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    @Autowired
    ProfileRepository profileRepository;

    ModelMapper mapper = new ModelMapper();

    public FullProfileDTO getProfileById(int id){
        return mapper.map(getValidatedProfile(id), FullProfileDTO.class);
    }

    public void addExperience(int profileId, ExperienceDTO experience){
        var profile = getValidatedProfile(profileId);
        var newExperience = mapper.map(experience, Experience.class);
        profile.getExperiences().add(newExperience);
        profileRepository.save(profile);
    }

    private Profile getValidatedProfile(int id){
        return profileRepository.findById(id).orElseThrow(()-> new NotFoundExeption(id));
    }
}
