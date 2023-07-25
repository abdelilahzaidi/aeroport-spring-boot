package com.example.demoJPA.DAL.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name="intervention")
@Getter
@Setter
@EntityListeners(value={AuditingEntityListener.class})
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String numero;
    @CreatedDate
    private LocalDate dateIntervention;
    @Column
    private LocalDate duree;
    @OneToMany(mappedBy = "intervention")
    private List<Mecanicien> mecanicien;
    @OneToMany(mappedBy = "intervention")
    private List<Avion> avions;
}
