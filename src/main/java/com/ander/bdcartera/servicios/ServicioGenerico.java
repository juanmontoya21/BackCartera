package com.ander.bdcartera.servicios;

import java.util.List;

public interface ServicioGenerico<C> {
    //consultarconsolidados
    public List<C> buscarTodos() throws Exception;

    //consultar consolidados por nit
    public C buscarPorNit(String nit) throws Exception;

    //Guardar cosnsolidados
    public C registar(C tabla) throws Exception;

    //Actualizar Consolidados
    public C actualizar(String nit, C tabla) throws Exception;

    //Eliminar Consolidados
    public Boolean Borrar(String nit) throws Exception;
}
