package com.example.userauth.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "projectservice")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class projectservice {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String label;
private String description;

}
