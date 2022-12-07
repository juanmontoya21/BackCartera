package com.ander.bdcartera.servicios;

import java.util.List;

public interface ServicioIndicadores<I> {
    //consultarconsolidados
    public List<I> buscarTodos() throws Exception;

    //consultar consolidados por nit
    public I buscarPorNit(String nit) throws Exception;

    //Guardar cosnsolidados
    public I registar(I tabla) throws Exception;

    //Actualizar Consolidados
    public I actualizar(String nit, I tabla) throws Exception;

    //Eliminar Consolidados
    public Boolean Borrar(String nit) throws Exception;
}
