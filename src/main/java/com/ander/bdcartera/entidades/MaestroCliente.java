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

    @Id
    @Column(name = "nit")
    private String nit;
    @Column(name = "nombrecliente")
    private String nombreCliente;
    @Column(name = "fechaantiguedad")
    private Date fechaAntiguedad;
    @Column(name = "terminogeneral")
    private String terminoGeneral;
    @Column(name = "cupocredito")
    private Double cupoCredito;
    @Column(name = "clasificacioncliente")
    private String ClasificacionCliente;
    @Column(name = "clpperfil")
    private String clpPerfil;

    @OneToMany(mappedBy = "nit")
    @JsonManagedReference
    private List<Consolidado> consolidados=new ArrayList<>();

    public MaestroCliente() {
    }

    public List<Consolidado> getConsolidados() {
        return consolidados;
    }

    public void setConsolidados(List<Consolidado> consolidados) {
        this.consolidados = consolidados;
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
        return ClasificacionCliente;
    }

    public void setClasificacionCliente(String clasificacionCliente) {
        ClasificacionCliente = clasificacionCliente;
    }

    public String getClpPerfil() {
        return clpPerfil;
    }

    public void setClpPerfil(String clpPerfil) {
        this.clpPerfil = clpPerfil;
    }
}
