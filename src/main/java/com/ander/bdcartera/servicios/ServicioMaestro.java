package com.ander.bdcartera.servicios;


import java.util.List;

public interface ServicioMaestro<M>  {
    //consultar maestro
    public List<M> buscarTodos() throws Exception;

    //consultar maestro por nit
    public M buscarPorNit(String nit) throws Exception;



}
