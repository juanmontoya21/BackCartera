package com.ander.bdcartera.repositorios;

import com.ander.bdcartera.entidades.MaestroCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaestroRepositorio extends JpaRepository<MaestroCliente, String> {

}
