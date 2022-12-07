package com.ander.bdcartera.servicios.implementaciones;




import com.ander.bdcartera.entidades.Indicadores;
import com.ander.bdcartera.repositorios.IndicadoresRepositorios;
import com.ander.bdcartera.servicios.ServicioIndicadores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IndicadoresServicioImplementacion implements ServicioIndicadores<Indicadores> {

    @Autowired
    IndicadoresRepositorios indicadoresRepositorios;

    @Override
    public List<Indicadores> buscarTodos() throws Exception {
        try{
            List<Indicadores> indicadores =indicadoresRepositorios.findAll();
            return indicadores;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Indicadores buscarPorNit(String nit) throws Exception {
        try{
            Optional<Indicadores> indicadores = indicadoresRepositorios.findById(nit);
            return indicadores.get();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Indicadores registar(Indicadores tabla) throws Exception {
        try{
            tabla=indicadoresRepositorios.save(tabla);
            return tabla;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Indicadores actualizar(String nit, Indicadores tabla) throws Exception {
        try{
            Optional<Indicadores> indicadoresbuscadas=indicadoresRepositorios.findById(nit);
            Indicadores indicadores=indicadoresbuscadas.get();
            indicadores=indicadoresRepositorios.save(tabla);

            return indicadores;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Boolean Borrar(String nit) throws Exception {
        try{
            if(indicadoresRepositorios.existsById(nit)){
                indicadoresRepositorios.deleteById(nit);
                return true;
            }else {
                throw new Exception("hola");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }


}
