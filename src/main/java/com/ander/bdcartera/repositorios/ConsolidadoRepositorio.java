package com.ander.bdcartera.repositorios;

import com.ander.bdcartera.entidades.Consolidado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsolidadoRepositorio extends JpaRepository<Consolidado,String> {
}
