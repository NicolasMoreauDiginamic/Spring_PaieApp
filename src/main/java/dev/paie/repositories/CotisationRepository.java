package dev.paie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.paie.entites.Cotisation;

public interface CotisationRepository extends JpaRepository<Cotisation, Integer> {

}
