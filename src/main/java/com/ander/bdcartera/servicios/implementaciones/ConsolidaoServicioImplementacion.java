package com.ander.bdcartera.servicios.implementaciones;

import com.ander.bdcartera.entidades.Consolidado;
import com.ander.bdcartera.repositorios.ConsolidadoRepositorio;
import com.ander.bdcartera.servicios.ServicioGenerico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class ConsolidaoServicioImplementacion implements ServicioGenerico<Consolidado> {

    @Autowired
    ConsolidadoRepositorio consolidadoRepositorio;

    @Override
    public List<Consolidado> buscarTodos() throws Exception {
        try{
            List<Consolidado> consolidados = consolidadoRepositorio.findAll();
            return consolidados;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Consolidado buscarPorNit(String nit) throws Exception {
        try{
            Optional<Consolidado> consolidado = consolidadoRepositorio.findById(nit);
            return consolidado.get();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Consolidado registar(Consolidado tabla) throws Exception {
        try{
            tabla=consolidadoRepositorio.save(tabla);
            return tabla;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Consolidado actualizar(String nit, Consolidado tabla) throws Exception {
        try{
            Optional<Consolidado> consolidadobuscada=consolidadoRepositorio.findById(nit);
            Consolidado consolidado=consolidadobuscada.get();
            consolidado=consolidadoRepositorio.save(tabla);

            return consolidado;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Boolean Borrar(String nit) throws Exception {
        try{
            if(consolidadoRepositorio.existsById(nit)){
                consolidadoRepositorio.deleteById(nit);
                return true;
            }else {
                throw new Exception("hola");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
