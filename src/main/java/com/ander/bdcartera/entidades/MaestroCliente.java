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
    @Column(name = "nombrecliente")
    private String nombrecliente;
    @Column(name = "fechaantiguedad")
    private Date fechaantiguedad;
    @Column(name = "terminogeneral")
    private String terminogeneral;
    @Column(name = "cupocredito")
    private Double cupocredito;
    @Column(name = "clasificacioncliente")
    private String clasificacioncliente;
    @Column(name = "clpperfil")
    private String clpperfil;

    @Id
    @Column(name = "id")
    private String id;

    /*@OneToMany(mappedBy = "id")
    @JsonManagedReference
    private List<Consolidado> consolidados=new ArrayList<>();*/

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public Date getFechaantiguedad() {
        return fechaantiguedad;
    }

    public void setFechaantiguedad(Date fechaantiguedad) {
        this.fechaantiguedad = fechaantiguedad;
    }

    public String getTerminogeneral() {
        return terminogeneral;
    }

    public void setTerminogeneral(String terminogeneral) {
        this.terminogeneral = terminogeneral;
    }

    public Double getCupocredito() {
        return cupocredito;
    }

    public void setCupocredito(Double cupocredito) {
        this.cupocredito = cupocredito;
    }

    public String getClasificacioncliente() {
        return clasificacioncliente;
    }

    public void setClasificacioncliente(String clasificacioncliente) {
        this.clasificacioncliente = clasificacioncliente;
    }

    public String getClpperfil() {
        return clpperfil;
    }

    public void setClpperfil(String clpperfil) {
        this.clpperfil = clpperfil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
