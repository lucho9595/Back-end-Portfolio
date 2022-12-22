package com.portfolio.Luciano.Repository;


import com.portfolio.Luciano.Entity.Education;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducation extends JpaRepository<Education, Integer> {

    public Optional<Education> findByNombreE(String nombreE);

    public boolean existsByNombreE(String nombreE);
}
