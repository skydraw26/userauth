package com.example.userauth.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name="project")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @OneToMany(fetch = EAGER)
    private Collection<projectservice> projectserviceslist = new ArrayList<>();

}
