package com.example.demoJPA.DAL.repositories;

import com.example.demoJPA.DAL.entities.Avion;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AvionRepository extends JpaRepository<Avion,Long> {

    @Query(value="SELECT a FROM Avion a")
    List<Avion> findAll();
    Avion getById(long id);
    Avion getByAchatDate(LocalDate dateAchat);
    @Modifying
    @Transactional
    @Query(value="INSERT INTO AvionRepository"+"("+")",nativeQuery = true)
    void add(Avion avion);
    void deleteByImmatriculation(String immatriculation);
    /*
    Rq:
     @Query(value = "INSERT INTO MyEntity VALUES " +
            "( " +
                ":#{#me.id}, " +
                ":#{#me.value} "
            ")", nativeQuery = true)
    public abstract void insert(@Param("me") MyEntity me);
     */
}
