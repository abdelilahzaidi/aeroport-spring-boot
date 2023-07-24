package com.example.demoJPA.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name="propriotaire")
@Getter
@Setter
@EntityListeners(value={AuditingEntityListener.class})
public class Proprietaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nom;
    @Column
    private String adresse;
    @Column
    private String numeroTel;
    @Column
    private String categorie;
    @Column
    private Avion avion;

}
