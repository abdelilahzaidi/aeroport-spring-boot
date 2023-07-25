package com.example.demoJPA.DAL.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="avion")
@Getter
@Setter
@EntityListeners(value={AuditingEntityListener.class})
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String immatriculation;
    @CreatedDate
    private LocalDate dateAchat;
    @OneToMany(mappedBy = "avion")
    private List<Proprietaire> proprietaires;
    @OneToMany(mappedBy = "avion")
    private List<Type> types;
    @OneToMany(mappedBy = "avion")
    private List<Intervention>interventions;
}
