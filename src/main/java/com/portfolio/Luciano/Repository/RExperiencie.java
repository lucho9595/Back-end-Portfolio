package com.portfolio.Luciano.Repository;

import com.portfolio.Luciano.Entity.Experiencie;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencie extends JpaRepository<Experiencie, Integer> {

    public Optional<Experiencie> findByNombreE(String nombreE);

    public boolean existsByNombreE(String nombreE);
}
