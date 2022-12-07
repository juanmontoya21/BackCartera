package com.ander.bdcartera.controladores;

import com.ander.bdcartera.servicios.implementaciones.MaestroClienteServicoImplementacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/ander/MaestroCliente")
public class MaestroClienteControlador {

    @Autowired
    MaestroClienteServicoImplementacion maestroClienteServicio;

    @GetMapping
    public ResponseEntity<?> buscarTodos(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(maestroClienteServicio.buscarTodos());

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: Datos no encontardos}");
        }
    }

    @GetMapping("{/nit}")
    public ResponseEntity<?> buscarPorNit(@PathVariable String nit){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(maestroClienteServicio.buscarPorNit(nit));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: datos no encontrados}");
        }
    }
}
