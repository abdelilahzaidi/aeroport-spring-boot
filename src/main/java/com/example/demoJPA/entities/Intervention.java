package com.example.demoJPA.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.security.Timestamp;
import java.time.LocalDate;


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
    @Column
    private Mecanicien mecanicien;
}
