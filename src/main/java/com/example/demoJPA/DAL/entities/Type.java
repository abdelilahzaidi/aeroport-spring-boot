package com.example.demoJPA.DAL.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name="type")
@Getter
@Setter
@EntityListeners(value={AuditingEntityListener.class})
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nomConstructeur;
    @Column
    private long puissance;
    @Column
    private int nbPlace;
}
