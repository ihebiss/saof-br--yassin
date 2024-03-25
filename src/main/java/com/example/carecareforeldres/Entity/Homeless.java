package com.example.carecareforeldres.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Homeless implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHomeless;
    private Integer age;
    private String situationMedicale;
    private String situationSociale;
    private String besoinsSpecifiques;
    private String localisationActuelle;
    private  Integer user;


    @JsonIgnore
    @ManyToOne
    Shelter shelter;
}
