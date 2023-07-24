package com.example.demoJPA.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name="pilote")
@Getter
@Setter
@EntityListeners(value={AuditingEntityListener.class})
public class Pilote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String SSN;
    @Column
    private String numeroBrevet;
    @Column
    private String nom;
    @Column
    private String adresse;
    @Column
    private String numeroTel;
}
