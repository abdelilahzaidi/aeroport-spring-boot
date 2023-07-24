package com.example.demoJPA.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Entity
@Table(name="avion")
@Getter
@Setter
@EntityListeners(value={AuditingEntityListener.class})
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String immatriculation;
    @CreatedDate
    private LocalDate dateAchat;
}
