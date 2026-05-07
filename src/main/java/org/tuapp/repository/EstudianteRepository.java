package org.tuapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tuapp.model.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {
}
