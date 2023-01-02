package com.portfolio.Luciano.Repository;

import com.portfolio.Luciano.Entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository<Skills, Integer> {

    Optional<Skills> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
