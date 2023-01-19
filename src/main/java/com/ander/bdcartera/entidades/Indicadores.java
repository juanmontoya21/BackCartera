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
    private String ano;
    @Column(name = "kwdeventas")
    private Double kwdeventas;
    @Column(name = "capitaldetrabajo")
    private Double capitaldetrabajo;
    @Column(name = "razoncorriente")
    private Double razoncorriente;
    @Column(name = "pruebaacida")
    private Double pruebaacida;
    @Column(name = "diasinventario")
    private Double diasinventario;
    @Column(name = "diascartera")
    private Double diascartera;
    @Column(name = "diasproveedores")
    private Double diasproveedores;
    @Column(name = "endeudamientototal")
    private Double endeudamientototal;
    @Column(name = "endeudamientotinanciero")
    private Double endeudamientofinanciero;
    @Column(name = "margenbruto")
    private Double margenbruto;
    @Column(name = "margenoperacional")
    private Double margenoperacional;
    @Column(name = "margenneto")
    private Double margenneto;

    @Id
    @Column(name = "id")
    private String id;



    public Indicadores() {
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Double getKwdeventas() {
        return kwdeventas;
    }

    public void setKwdeventas(Double kwdeventas) {
        this.kwdeventas = kwdeventas;
    }

    public Double getCapitaldetrabajo() {
        return capitaldetrabajo;
    }

    public void setCapitaldetrabajo(Double capitaldetrabajo) {
        this.capitaldetrabajo = capitaldetrabajo;
    }

    public Double getRazoncorriente() {
        return razoncorriente;
    }

    public void setRazoncorriente(Double razoncorriente) {
        this.razoncorriente = razoncorriente;
    }

    public Double getPruebaacida() {
        return pruebaacida;
    }

    public void setPruebaacida(Double pruebaacida) {
        this.pruebaacida = pruebaacida;
    }

    public Double getDiasinventario() {
        return diasinventario;
    }

    public void setDiasinventario(Double diasinventario) {
        this.diasinventario = diasinventario;
    }

    public Double getDiascartera() {
        return diascartera;
    }

    public void setDiascartera(Double diascartera) {
        this.diascartera = diascartera;
    }

    public Double getDiasproveedores() {
        return diasproveedores;
    }

    public void setDiasproveedores(Double diasproveedores) {
        this.diasproveedores = diasproveedores;
    }

    public Double getEndeudamientototal() {
        return endeudamientototal;
    }

    public void setEndeudamientototal(Double endeudamientototal) {
        this.endeudamientototal = endeudamientototal;
    }

    public Double getEndeudamientofinanciero() {
        return endeudamientofinanciero;
    }

    public void setEndeudamientofinanciero(Double endeudamientofinanciero) {
        this.endeudamientofinanciero = endeudamientofinanciero;
    }

    public Double getMargenbruto() {
        return margenbruto;
    }

    public void setMargenbruto(Double margenbruto) {
        this.margenbruto = margenbruto;
    }

    public Double getMargenoperacional() {
        return margenoperacional;
    }

    public void setMargenoperacional(Double margenoperacional) {
        this.margenoperacional = margenoperacional;
    }

    public Double getMargenneto() {
        return margenneto;
    }

    public void setMargenneto(Double margenneto) {
        this.margenneto = margenneto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
