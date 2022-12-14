package com.ander.bdcartera.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "indicadores")
public class Indicadores {


    @Column(name = "nit")
    private String nit;
    @Column(name = "ano")
    private String Ano;
    @Column(name = "kDeWVentas")
    private Double kDeWVentas;
    @Column(name = "capitalDeTrabajo")
    private Double capitalDeTrabajo;
    @Column(name = "razonCorriente")
    private Double razonCorriente;
    @Column(name = "pruebaAcida")
    private Double pruebaAcida;
    @Column(name = "diasInventario")
    private Double diasInventario;
    @Column(name = "diasCartera")
    private Double diasCartera;
    @Column(name = "diasProveedores")
    private Double diasProveedores;
    @Column(name = "endeudamientoTotal")
    private Double endeudamientoTotal;
    @Column(name = "endeudamientoFinanciero")
    private Double endeudamientoFinanciero;
    @Column(name = "margenBruto")
    private Double margenBruto;
    @Column(name = "margenOperacional")
    private Double margenOperacional;
    @Column(name = "margenNeto")
    private Double margenNeto;

    @Id
    @Column(name = "id")
    private String id;



    public Indicadores() {
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

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    public Double getkDeWVentas() {
        return kDeWVentas;
    }

    public void setkDeWVentas(Double kDeWVentas) {
        this.kDeWVentas = kDeWVentas;
    }

    public Double getCapitalDeTrabajo() {
        return capitalDeTrabajo;
    }

    public void setCapitalDeTrabajo(Double capitalDeTrabajo) {
        this.capitalDeTrabajo = capitalDeTrabajo;
    }

    public Double getRazonCorriente() {
        return razonCorriente;
    }

    public void setRazonCorriente(Double razonCorriente) {
        this.razonCorriente = razonCorriente;
    }

    public Double getPruebaAcida() {
        return pruebaAcida;
    }

    public void setPruebaAcida(Double pruebaAcida) {
        this.pruebaAcida = pruebaAcida;
    }

    public Double getDiasInventario() {
        return diasInventario;
    }

    public void setDiasInventario(Double diasInventario) {
        this.diasInventario = diasInventario;
    }

    public Double getDiasCartera() {
        return diasCartera;
    }

    public void setDiasCartera(Double diasCartera) {
        this.diasCartera = diasCartera;
    }

    public Double getDiasProveedores() {
        return diasProveedores;
    }

    public void setDiasProveedores(Double diasProveedores) {
        this.diasProveedores = diasProveedores;
    }

    public Double getEndeudamientoTotal() {
        return endeudamientoTotal;
    }

    public void setEndeudamientoTotal(Double endeudamientoTotal) {
        this.endeudamientoTotal = endeudamientoTotal;
    }

    public Double getEndeudamientoFinanciero() {
        return endeudamientoFinanciero;
    }

    public void setEndeudamientoFinanciero(Double endeudamientoFinanciero) {
        this.endeudamientoFinanciero = endeudamientoFinanciero;
    }

    public Double getMargenBruto() {
        return margenBruto;
    }

    public void setMargenBruto(Double margenBruto) {
        this.margenBruto = margenBruto;
    }

    public Double getMargenOperacional() {
        return margenOperacional;
    }

    public void setMargenOperacional(Double margenOperacional) {
        this.margenOperacional = margenOperacional;
    }

    public Double getMargenNeto() {
        return margenNeto;
    }

    public void setMargenNeto(Double margenNeto) {
        this.margenNeto = margenNeto;
    }
}
