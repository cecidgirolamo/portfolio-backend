package com.argentinaprograma.cdegirolamo.portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Profile {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String lastName;

    private String degree;

    private String summary;

    private String bannerUrl;

    private String profilePhotoUrl;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "userId")
    private List<Experience> experiences;

    @OneToMany
    @JoinColumn(name = "userId")
    private List<Skill> skills;

    private String username;

    private String password;

}
