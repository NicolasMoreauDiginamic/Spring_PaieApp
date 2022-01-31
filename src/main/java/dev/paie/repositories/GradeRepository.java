package dev.paie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.paie.entites.Grade;

public interface GradeRepository extends JpaRepository<Grade, Integer> {

}
