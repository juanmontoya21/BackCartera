package com.ander.bdcartera.controladores;

import com.ander.bdcartera.entidades.Consolidado;
import com.ander.bdcartera.servicios.implementaciones.ConsolidaoServicioImplementacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/ander/consolidado")
public class ConsolidadosControlador {
    @Autowired
    ConsolidaoServicioImplementacion consolidaoServicio;

    @PostMapping
    public ResponseEntity<?> registrar(@RequestBody Consolidado consolidado){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(consolidaoServicio.registar(consolidado));

        }catch (Exception error){
            String mensaje="{\"error\":\"Error revise: "+error+"\"}";
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(mensaje);
        }
    }

    @GetMapping
    public ResponseEntity<?> buscarTodos(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(consolidaoServicio.buscarTodos());

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: Datos no encontardos}");
        }
    }

    @DeleteMapping("/{nit}")
    public  ResponseEntity<?> eliminar(@PathVariable String nit){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(consolidaoServicio.Borrar(nit));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: no se pudo actualizar");
        }
    }

    @GetMapping("/{nit}")
    public ResponseEntity<?> buscarPorNit(@PathVariable String nit){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(consolidaoServicio.buscarPorNit(nit));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: datos no encontrados}");
        }
    }

    @PutMapping("/{nit}")
    public ResponseEntity<?> actualizar(@PathVariable String nit,@RequestBody Consolidado consolidado ){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(consolidaoServicio.actualizar(nit,consolidado));
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: No se pudo actualizar }");
        }
    }
}
