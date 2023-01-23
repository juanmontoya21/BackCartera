package com.ander.bdcartera.repositorios;

import com.ander.bdcartera.entidades.MaestroCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaestroRepositorio extends JpaRepository<MaestroCliente, String> {

}
