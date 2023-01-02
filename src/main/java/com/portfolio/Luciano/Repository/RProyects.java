package com.portfolio.Luciano.Repository;

import com.portfolio.Luciano.Entity.Proyects;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyects extends JpaRepository<Proyects,Integer>{
    public Optional<Proyects> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
