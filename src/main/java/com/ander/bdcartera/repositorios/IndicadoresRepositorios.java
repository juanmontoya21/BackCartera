package com.ander.bdcartera.repositorios;

import com.ander.bdcartera.entidades.Indicadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndicadoresRepositorios extends JpaRepository<Indicadores,String>{

}
