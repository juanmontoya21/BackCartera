package com.ander.bdcartera.servicios.implementaciones;

import com.ander.bdcartera.entidades.Consolidado;
import com.ander.bdcartera.entidades.MaestroCliente;
import com.ander.bdcartera.repositorios.MaestroRepositorio;
import com.ander.bdcartera.servicios.ServicioMaestro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaestroClienteServicoImplementacion implements ServicioMaestro<MaestroCliente> {

    @Autowired
    MaestroRepositorio maestroRepositorio;

    @Override
    public List<MaestroCliente> buscarTodos() throws Exception {
        try{
            List<MaestroCliente> maestroCliente = maestroRepositorio.findAll();
            return maestroCliente;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public MaestroCliente buscarPorNit(String nit) throws Exception {
        try{
            Optional<MaestroCliente> maestroCliente = maestroRepositorio.findById(nit);
            return maestroCliente.get();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
