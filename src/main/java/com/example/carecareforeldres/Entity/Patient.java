package com.example.carecareforeldres.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpatient;
    @Enumerated(EnumType.STRING)
    private TypePatient typePatient;
    private Boolean archiver;
    private Float poid;
    private Float longueur;
    private Integer user;
    private LocalDate dateDeNaissance;
    @Enumerated(EnumType.STRING)
    private Sexe sexe;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "patient")
    @JsonIgnore
    List<Repas> repas;


    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "patients")
    @JsonIgnore
    List<Maladie> maladies=new ArrayList<>();



}
