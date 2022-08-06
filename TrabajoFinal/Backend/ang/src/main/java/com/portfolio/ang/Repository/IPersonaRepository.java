package com.portfolio.ang.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.ang.Entity.Persona;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
