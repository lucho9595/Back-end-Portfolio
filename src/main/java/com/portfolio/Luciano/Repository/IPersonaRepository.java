package com.portfolio.Luciano.Repository;

import com.portfolio.Luciano.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 
@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
    
}
