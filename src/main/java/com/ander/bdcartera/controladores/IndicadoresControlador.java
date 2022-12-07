package com.ander.bdcartera.controladores;

import com.ander.bdcartera.entidades.Consolidado;
import com.ander.bdcartera.entidades.Indicadores;
import com.ander.bdcartera.servicios.implementaciones.IndicadoresServicioImplementacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "api/ander/Indicadores")
public class IndicadoresControlador {
    @Autowired
    IndicadoresServicioImplementacion indicadoresServicio;

    @PostMapping
    public ResponseEntity<?> registrar(@RequestBody Indicadores indicadores) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(indicadoresServicio.registar(indicadores));

        } catch (Exception error) {
            String mensaje = "{\"error\":\"Error revise: " + error + "\"}";
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(mensaje);
        }
    }

    @GetMapping
    public ResponseEntity<?> buscarTodos() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(indicadoresServicio.buscarTodos());

        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: Datos no encontardos}");
        }
    }

    @DeleteMapping("/{nit}")
    public ResponseEntity<?> eliminar(@PathVariable String nit) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(indicadoresServicio.Borrar(nit));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: no se pudo actualizar");
        }
    }

    @GetMapping("/{nit}")
    public ResponseEntity<?> buscarPorNit(@PathVariable String nit) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(indicadoresServicio.buscarPorNit(nit));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: datos no encontrados}");
        }
    }
}

