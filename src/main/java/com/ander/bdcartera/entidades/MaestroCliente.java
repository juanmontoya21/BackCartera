package com.ander.bdcartera.entidades;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "maestrocliente")
public class MaestroCliente implements Serializable {


    @Column(name = "nit")
    private String nit;
    @Column(name = "nombreCliente")
    private String nombreCliente;
    @Column(name = "fechaAntiguedad")
    private Date fechaAntiguedad;
    @Column(name = "terminoGeneral")
    private String terminoGeneral;
    @Column(name = "cupoCredito")
    private Double cupoCredito;
    @Column(name = "clasificacionCliente")
    private String clasificacionCliente;
    @Column(name = "clpPerfil")
    private String clpPerfil;

    @Id
    @Column(name = "id")
    private String id;

    /*@OneToMany(mappedBy = "id")
    @JsonManagedReference
    private List<Consolidado> consolidados=new ArrayList<>();*/

    public MaestroCliente() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFechaAntiguedad() {
        return fechaAntiguedad;
    }

    public void setFechaAntiguedad(Date fechaAntiguedad) {
        this.fechaAntiguedad = fechaAntiguedad;
    }

    public String getTerminoGeneral() {
        return terminoGeneral;
    }

    public void setTerminoGeneral(String terminoGeneral) {
        this.terminoGeneral = terminoGeneral;
    }

    public Double getCupoCredito() {
        return cupoCredito;
    }

    public void setCupoCredito(Double cupoCredito) {
        this.cupoCredito = cupoCredito;
    }

    public String getClasificacionCliente() {
        return clasificacionCliente;
    }

    public void setClasificacionCliente(String clasificacionCliente) {
        this.clasificacionCliente = clasificacionCliente;
    }

    public String getClpPerfil() {
        return clpPerfil;
    }

    public void setClpPerfil(String clpPerfil) {
        this.clpPerfil = clpPerfil;
    }
}
