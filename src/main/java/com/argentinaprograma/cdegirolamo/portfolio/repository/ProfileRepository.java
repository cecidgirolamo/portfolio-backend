package com.argentinaprograma.cdegirolamo.portfolio.repository;

import com.argentinaprograma.cdegirolamo.portfolio.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
}
