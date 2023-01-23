package com.ander.bdcartera.entidades;



import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "consolidado")
public class Consolidado implements Serializable{

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "nit")
    private String nit;
    @Column(name = "fechadecorte")
    private String fechadecorte;
    @Column(name = "ano")
    private String ano;
    @Column(name = "ingresosoperacionales")
    private Double ingresosoperacionales;
    @Column(name = "costosdeventasydeprestaciondeservicios")
    private Double costosdeventasydeprestaciondeservicios;
    @Column(name = "gananciabruta")
    private Double gananciabruta;
    @Column(name = "otrosingresos")
    private Double otrosingresos;
    @Column(name = "gastosoperacionalesdeventa")
    private Double gastosoperacionalesdeventa;
    @Column(name = "gastosoperacionalesdeadmon")
    private Double gastosoperacionalesdeadmon;
    @Column(name = "otrosgastos")
    private Double otrosgastos;
    @Column(name = "otrasganacias")
    private Double otrasganacias;
    @Column(name = "utilidadoperacional")
    private Double utilidadoperacional;
    @Column(name = "ingresosfinancieros")
    private Double  ingresosfinancieros ;
    @Column(name = "costosfinancieros")
    private Double costosfinancieros;
    @Column(name = "otrosingresosoegresos")
    private Double otrosingresosoegresos;
    @Column(name = "utilidadantesdeimpuesto")
    private Double utilidadantesdeimpuesto;
    @Column(name = "inpuestoderentaycomplementarias")
    private Double inpuestoderentaycomplementarias;
    @Column(name = "gananciasyperdidas")
    private Double gananciasyperdidas;
    @Column(name = "efectivosyequivalentealefectivo")
    private Double efectivosyequivalentealefectivo;
    @Column(name = "clientescp")
    private Double clientescp;
    @Column(name = "inventarioscp")
    private Double inventarioscp;
    @Column(name="otrosactivosfinancieros")
    private Double otrosactivosfinancieros;
    @Column(name = "otrosactivoscorrientes")
    private Double otrosactivoscorrientes;
    @Column(name = "totalactivocorriente")
    private Double totalactivocorriente;
    @Column(name = "deudoreslp")
    private Double deudoreslp;
    @Column(name = "otrosactivosnocorriente")
    private Double otrosactivosnocorriente;
    @Column(name = "propiedadesplantayequipo")
    private Double propiedadesplantayequipo;
    @Column(name = "totalactivonocorriente")
    private Double totalactivonocorriente;
    @Column(name = "totalactivo")
    private Double totalactivo;
    @Column(name = "obligacionescp")
    private Double obligacionescp;
    @Column(name = "proveedorescp")
    private Double proveedorescp;
    @Column(name = "otrospasivoscorriente")
    private Double otrospasivoscorriente;

    @Column(name = "totalpasivocorriente")
    private Double totalpasivocorriente;
    @Column(name = "obligacionesfinancieraslp")
    private Double obligacionesfinancieraslp;
    @Column(name = "proveedoreslp")
    private Double proveedoreslp;
    @Column(name = "otrospasivosnocorriente")
    private Double otrospasivosnocorriente;
    @Column(name = "totalpasivonocorriente")
    private Double totalpasivonocorriente;

    @Column(name = "totalpasivo")
    private Double totalpasivo;
    @Column(name = "capitalsocial")
    private Double capitalsocial;
    @Column(name = "primadeemision")
    private Double primadeemision;
    @Column(name = "reservas")
    private Double reservas;
    @Column(name = "gananciasacumuladas")
    private Double gananciasacumuladas;
    @Column(name = "otrospatrimonios")
    private Double otrospatrimonios;
    @Column(name = "totalpatrimonio")
    private Double totalpatrimonio;
    @Column(name = "totalpasivomaspatrimonio")
    private Double totalpasivomaspatrimonio;

    @Column(name = "tipodeempresa")
    private String tipodeempresa;

    public Consolidado() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getTotalpasivocorriente() {
        return totalpasivocorriente;
    }

    public void setTotalpasivocorriente(Double totalpasivocorriente) {
        this.totalpasivocorriente = totalpasivocorriente;
    }

    public String getTipodeempresa() {
        return tipodeempresa;
    }

    public void setTipodeempresa(String tipodeempresa) {
        this.tipodeempresa = tipodeempresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getFechadecorte() {
        return fechadecorte;
    }

    public void setFechadecorte(String fechadecorte) {
        this.fechadecorte = fechadecorte;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Double getIngresosoperacionales() {
        return ingresosoperacionales;
    }

    public void setIngresosoperacionales(Double ingresosoperacionales) {
        this.ingresosoperacionales = ingresosoperacionales;
    }

    public Double getCostosdeventasydeprestaciondeservicios() {
        return costosdeventasydeprestaciondeservicios;
    }

    public void setCostosdeventasydeprestaciondeservicios(Double costosdeventasydeprestaciondeservicios) {
        this.costosdeventasydeprestaciondeservicios = costosdeventasydeprestaciondeservicios;
    }

    public Double getGananciabruta() {
        return gananciabruta;
    }

    public void setGananciabruta(Double gananciabruta) {
        this.gananciabruta = gananciabruta;
    }

    public Double getOtrosingresos() {
        return otrosingresos;
    }

    public void setOtrosingresos(Double otrosingresos) {
        this.otrosingresos = otrosingresos;
    }

    public Double getGastosoperacionalesdeventa() {
        return gastosoperacionalesdeventa;
    }

    public void setGastosoperacionalesdeventa(Double gastosoperacionalesdeventa) {
        this.gastosoperacionalesdeventa = gastosoperacionalesdeventa;
    }

    public Double getGastosoperacionalesdeadmon() {
        return gastosoperacionalesdeadmon;
    }

    public void setGastosoperacionalesdeadmon(Double gastosoperacionalesdeadmon) {
        this.gastosoperacionalesdeadmon = gastosoperacionalesdeadmon;
    }

    public Double getOtrosgastos() {
        return otrosgastos;
    }

    public void setOtrosgastos(Double otrosgastos) {
        this.otrosgastos = otrosgastos;
    }

    public Double getOtrasganacias() {
        return otrasganacias;
    }

    public void setOtrasganacias(Double otrasganacias) {
        this.otrasganacias = otrasganacias;
    }

    public Double getUtilidadoperacional() {
        return utilidadoperacional;
    }

    public void setUtilidadoperacional(Double utilidadoperacional) {
        this.utilidadoperacional = utilidadoperacional;
    }

    public Double getIngresosfinancieros() {
        return ingresosfinancieros;
    }

    public void setIngresosfinancieros(Double ingresosfinancieros) {
        this.ingresosfinancieros = ingresosfinancieros;
    }

    public Double getCostosfinancieros() {
        return costosfinancieros;
    }

    public void setCostosfinancieros(Double costosfinancieros) {
        this.costosfinancieros = costosfinancieros;
    }

    public Double getOtrosingresosoegresos() {
        return otrosingresosoegresos;
    }

    public void setOtrosingresosoegresos(Double otrosingresosoegresos) {
        this.otrosingresosoegresos = otrosingresosoegresos;
    }

    public Double getUtilidadantesdeimpuesto() {
        return utilidadantesdeimpuesto;
    }

    public void setUtilidadantesdeimpuesto(Double utilidadantesdeimpuesto) {
        this.utilidadantesdeimpuesto = utilidadantesdeimpuesto;
    }

    public Double getInpuestoderentaycomplementarias() {
        return inpuestoderentaycomplementarias;
    }

    public void setInpuestoderentaycomplementarias(Double inpuestoderentaycomplementarias) {
        this.inpuestoderentaycomplementarias = inpuestoderentaycomplementarias;
    }

    public Double getGananciasyperdidas() {
        return gananciasyperdidas;
    }

    public void setGananciasyperdidas(Double gananciasyperdidas) {
        this.gananciasyperdidas = gananciasyperdidas;
    }

    public Double getEfectivosyequivalentealefectivo() {
        return efectivosyequivalentealefectivo;
    }

    public void setEfectivosyequivalentealefectivo(Double efectivosyequivalentealefectivo) {
        this.efectivosyequivalentealefectivo = efectivosyequivalentealefectivo;
    }

    public Double getClientescp() {
        return clientescp;
    }

    public void setClientescp(Double clientescp) {
        this.clientescp = clientescp;
    }

    public Double getInventarioscp() {
        return inventarioscp;
    }

    public void setInventarioscp(Double inventarioscp) {
        this.inventarioscp = inventarioscp;
    }

    public Double getOtrosactivosfinancieros() {
        return otrosactivosfinancieros;
    }

    public void setOtrosactivosfinancieros(Double otrosactivosfinancieros) {
        this.otrosactivosfinancieros = otrosactivosfinancieros;
    }

    public Double getOtrosactivoscorrientes() {
        return otrosactivoscorrientes;
    }

    public void setOtrosactivoscorrientes(Double otrosactivoscorrientes) {
        this.otrosactivoscorrientes = otrosactivoscorrientes;
    }

    public Double getTotalactivocorriente() {
        return totalactivocorriente;
    }

    public void setTotalactivocorriente(Double totalactivocorriente) {
        this.totalactivocorriente = totalactivocorriente;
    }

    public Double getDeudoreslp() {
        return deudoreslp;
    }

    public void setDeudoreslp(Double deudoreslp) {
        this.deudoreslp = deudoreslp;
    }

    public Double getOtrosactivosnocorriente() {
        return otrosactivosnocorriente;
    }

    public void setOtrosactivosnocorriente(Double otrosactivosnocorriente) {
        this.otrosactivosnocorriente = otrosactivosnocorriente;
    }

    public Double getPropiedadesplantayequipo() {
        return propiedadesplantayequipo;
    }

    public void setPropiedadesplantayequipo(Double propiedadesplantayequipo) {
        this.propiedadesplantayequipo = propiedadesplantayequipo;
    }

    public Double getTotalactivonocorriente() {
        return totalactivonocorriente;
    }

    public void setTotalactivonocorriente(Double totalactivonocorriente) {
        this.totalactivonocorriente = totalactivonocorriente;
    }

    public Double getTotalactivo() {
        return totalactivo;
    }

    public void setTotalactivo(Double totalactivo) {
        this.totalactivo = totalactivo;
    }

    public Double getObligacionescp() {
        return obligacionescp;
    }

    public void setObligacionescp(Double obligacionescp) {
        this.obligacionescp = obligacionescp;
    }

    public Double getProveedorescp() {
        return proveedorescp;
    }

    public void setProveedorescp(Double proveedorescp) {
        this.proveedorescp = proveedorescp;
    }

    public Double getOtrospasivoscorriente() {
        return otrospasivoscorriente;
    }

    public void setOtrospasivoscorriente(Double otrospasivoscorriente) {
        this.otrospasivoscorriente = otrospasivoscorriente;
    }



    public Double getObligacionesfinancieraslp() {
        return obligacionesfinancieraslp;
    }

    public void setObligacionesfinancieraslp(Double obligacionesfinancieraslp) {
        this.obligacionesfinancieraslp = obligacionesfinancieraslp;
    }

    public Double getProveedoreslp() {
        return proveedoreslp;
    }

    public void setProveedoreslp(Double proveedoreslp) {
        this.proveedoreslp = proveedoreslp;
    }

    public Double getOtrospasivosnocorriente() {
        return otrospasivosnocorriente;
    }

    public void setOtrospasivosnocorriente(Double otrospasivosnocorriente) {
        this.otrospasivosnocorriente = otrospasivosnocorriente;
    }

    public Double getTotalpasivonocorriente() {
        return totalpasivonocorriente;
    }

    public void setTotalpasivonocorriente(Double totalpasivonocorriente) {
        this.totalpasivonocorriente = totalpasivonocorriente;
    }

    public Double getTotalpasivo() {
        return totalpasivo;
    }

    public void setTotalpasivo(Double totalpasivo) {
        this.totalpasivo = totalpasivo;
    }

    public Double getCapitalsocial() {
        return capitalsocial;
    }

    public void setCapitalsocial(Double capitalsocial) {
        this.capitalsocial = capitalsocial;
    }

    public Double getPrimadeemision() {
        return primadeemision;
    }

    public void setPrimadeemision(Double primadeemision) {
        this.primadeemision = primadeemision;
    }

    public Double getReservas() {
        return reservas;
    }

    public void setReservas(Double reservas) {
        this.reservas = reservas;
    }

    public Double getGananciasacumuladas() {
        return gananciasacumuladas;
    }

    public void setGananciasacumuladas(Double gananciasacumuladas) {
        this.gananciasacumuladas = gananciasacumuladas;
    }

    public Double getOtrospatrimonios() {
        return otrospatrimonios;
    }

    public void setOtrospatrimonios(Double otrospatrimonios) {
        this.otrospatrimonios = otrospatrimonios;
    }

    public Double getTotalpatrimonio() {
        return totalpatrimonio;
    }

    public void setTotalpatrimonio(Double totalpatrimonio) {
        this.totalpatrimonio = totalpatrimonio;
    }

    public Double getTotalpasivomaspatrimonio() {
        return totalpasivomaspatrimonio;
    }

    public void setTotalpasivomaspatrimonio(Double totalpasivomaspatrimonio) {
        this.totalpasivomaspatrimonio = totalpasivomaspatrimonio;
    }
}
