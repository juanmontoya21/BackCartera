package com.ander.bdcartera.entidades;



import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "consolidado")
public class Consolidado implements Serializable{


    @Column(name = "nit")
    private String nit;
    @Column(name = "fechadecorte")
    private Date fechaDeCorte;
    @Column(name = "efectivoyequivalentesalefectivo")
    private Double efectivoYEquivalentesAlEfectivo;
    @Column(name = "cuentascomercialesporcobraryotrascuentasporcobrarCorrientes")
    private Double cuentasComercialesPorCobrarYOtrasCuentasPorCobrarCorrientes;
    @Column(name = "inventarioscorrientes")
    private Double inventariosCorrientes;
    @Column(name = "activosporimpuestoscorriente")
    private Double activosPorImpuestosCorrientesCorriente;
    @Column(name = "otrosactivosfinancieroscorrientes")
    private Double otrosActivosFinancierosCorrientes;
    @Column(name = "otrosactivosnofinancieroscorrientes")
    private Double otrosActivosNoFinancierosCorrientes;
    @Column(name = "activoscorrientestotales")
    private Double activosCorrientesTotales;
    @Column(name = "propiedadesplantayequipo")
    private Double propiedadesPlantaYEquipo;
    @Column(name = "activosintagiblesdistintosdelplusvalia")
    private Double activosIntagiblesDistintosDeLaPlusvalia;
    @Column(name = "cuentascomercialesporcobraryotrascuentasporcobrarnocorrientes")
    private Double cuentasComercialesPorCobrarYOtrasCuentasPorCobrarNoCorrientes;
    @Column(name = "activosporimpuestosdiferidos")
    private Double activosPorImpuestosDiferidos;
    @Column(name = "otrosactivosnofinancierosnocorrientes")
    private Double otrosActivosNoFinancierosNoCorrientes;
    @Column(name = "totaldeactivosnocorrientes")
    private Double totalDeActivosNoCorrientes;
    @Column(name = "totaldeactivos")
    private Double totalDeActivos;
    @Column(name = "cuentasporpagarcomercialesyotrascuentasporpagar")
    private Double cuentasPorPagarComercialesYOtrasCuentasPorPagar;
    @Column(name = "otrospasivosfinancieroscorrientes")
    private Double otrosPasivosFinancierosCorrientes;
    @Column(name = "otrospasivosnofinancieroscorrientes")
    private Double otrosPasivosNoFinancierosCorrientes;
    @Column(name = "pasivoscorrientestotales")
    private Double pasivosCorrientesTotales;
    @Column(name="Cuentascomercialesporpagaryotrascuentasporpagarnocorrientes")
    private Double CuentasComercialesPorPagarYOtrasCuentasPorPagarNoCorrientes;
    @Column(name = "pasivoporimpuestosdiferidos")
    private Double pasivoPorImpuestosDiferidos;
    @Column(name = "otrospasivosfinancierosnocorrientes")
    private Double otrosPasivosFinancierosNoCorrientes;
    @Column(name = "totaldepasivosnocorrientes")
    private Double totalDePasivosNoCorrientes;
    @Column(name = "totalpasivo")
    private Double totalPasivo;
    @Column(name = "capitalemitido")
    private Double capitalEmitido;
    @Column(name = "otrasparticipacionesenelpatrimonio")
    private Double otrasParticipacionesEnElPatrimonio;
    @Column(name = "otrasreservas")
    private Double otrasReservas;
    @Column(name = "gananciasacumuladas")
    private Double gananciasAcumuladas;
    @Column(name = "patrimoniototal")
    private Double patrimonioTotal;
    @Column(name = "totaldepatrimonioypasivos")
    private Double totalDePatrimonioYPasivos;
    @Column(name = "ano")
    private String ano;
    @Column(name = "tipodeempresa")
    private String tipoDeEmpresa;
    @Column(name = "ingresodeactividadesOrdinales")
    private Double ingresoDeActividadesOrdinales;
    @Column(name = "costodeventas")
    private Double costoDeVentas;
    @Column(name = "gananciabruta")
    private Double gananciaBruta;
    @Column(name = "otrosingresos")
    private Double otrosIngresos;
    @Column(name = "gastosdeadministracion")
    private Double gastosDeAdministracion;
    @Column(name = "otrosgastos")
    private Double otrosGastos;
    @Column(name = "gananciaperdidaporactividadesdeoperacion")
    private Double gananciaPerdidaPorActividadesDeOperacion;
    @Column(name = "Ingresosfinancieros")
    private Double IngresosFinancieros;
    @Column(name = "Costosfinancieros")
    private Double CostosFinancieros;
    @Column(name = "Gananciaperdidaantesdeimpuestos")
    private Double GananciaPerdidaAntesDeImpuestos;
    @Column(name = "Ingresogastoporimpuestos")
    private Double IngresoGastoPorImpuestos;
    @Column(name = "Gananciaperdidaprocedentedeoperacionescontinuadas")
    private Double GananciaPerdidaProcedentedeOperacionesContinuadas;
    @Column(name = "Gananciaperdidaprocedentedeoperacionesdiscontinuadas")
    private Double GananciaPerdidaprocedenteDeOperacionesDiscontinuadas;
    @Column(name = "Gananciaperdida")
    private Double GananciaPerdida;
    @Id
    @Column(name = "id")
    private String id;

    //@ManyToOne(optional = false)
    //@JoinColumn(name = "fk_maestroCliente", referencedColumnName = "nit")
    //private MaestroCliente maestroCliente;


    public Consolidado() {
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

    public Date getFechaDeCorte() {
        return fechaDeCorte;
    }

    public void setFechaDeCorte(Date fechaDeCorte) {
        this.fechaDeCorte = fechaDeCorte;
    }

    public Double getEfectivoYEquivalentesAlEfectivo() {
        return efectivoYEquivalentesAlEfectivo;
    }

    public void setEfectivoYEquivalentesAlEfectivo(Double efectivoYEquivalentesAlEfectivo) {
        this.efectivoYEquivalentesAlEfectivo = efectivoYEquivalentesAlEfectivo;
    }

    public Double getCuentasComercialesPorCobrarYOtrasCuentasPorCobrarCorrientes() {
        return cuentasComercialesPorCobrarYOtrasCuentasPorCobrarCorrientes;
    }

    public void setCuentasComercialesPorCobrarYOtrasCuentasPorCobrarCorrientes(Double cuentasComercialesPorCobrarYOtrasCuentasPorCobrarCorrientes) {
        this.cuentasComercialesPorCobrarYOtrasCuentasPorCobrarCorrientes = cuentasComercialesPorCobrarYOtrasCuentasPorCobrarCorrientes;
    }

    public Double getInventariosCorrientes() {
        return inventariosCorrientes;
    }

    public void setInventariosCorrientes(Double inventariosCorrientes) {
        this.inventariosCorrientes = inventariosCorrientes;
    }

    public Double getActivosPorImpuestosCorrientesCorriente() {
        return activosPorImpuestosCorrientesCorriente;
    }

    public void setActivosPorImpuestosCorrientesCorriente(Double activosPorImpuestosCorrientesCorriente) {
        this.activosPorImpuestosCorrientesCorriente = activosPorImpuestosCorrientesCorriente;
    }

    public Double getOtrosActivosFinancierosCorrientes() {
        return otrosActivosFinancierosCorrientes;
    }

    public void setOtrosActivosFinancierosCorrientes(Double otrosActivosFinancierosCorrientes) {
        this.otrosActivosFinancierosCorrientes = otrosActivosFinancierosCorrientes;
    }

    public Double getOtrosActivosNoFinancierosCorrientes() {
        return otrosActivosNoFinancierosCorrientes;
    }

    public void setOtrosActivosNoFinancierosCorrientes(Double otrosActivosNoFinancierosCorrientes) {
        this.otrosActivosNoFinancierosCorrientes = otrosActivosNoFinancierosCorrientes;
    }

    public Double getActivosCorrientesTotales() {
        return activosCorrientesTotales;
    }

    public void setActivosCorrientesTotales(Double activosCorrientesTotales) {
        this.activosCorrientesTotales = activosCorrientesTotales;
    }

    public Double getPropiedadesPlantaYEquipo() {
        return propiedadesPlantaYEquipo;
    }

    public void setPropiedadesPlantaYEquipo(Double propiedadesPlantaYEquipo) {
        this.propiedadesPlantaYEquipo = propiedadesPlantaYEquipo;
    }

    public Double getActivosIntagiblesDistintosDeLaPlusvalia() {
        return activosIntagiblesDistintosDeLaPlusvalia;
    }

    public void setActivosIntagiblesDistintosDeLaPlusvalia(Double activosIntagiblesDistintosDeLaPlusvalia) {
        this.activosIntagiblesDistintosDeLaPlusvalia = activosIntagiblesDistintosDeLaPlusvalia;
    }

    public Double getCuentasComercialesPorCobrarYOtrasCuentasPorCobrarNoCorrientes() {
        return cuentasComercialesPorCobrarYOtrasCuentasPorCobrarNoCorrientes;
    }

    public void setCuentasComercialesPorCobrarYOtrasCuentasPorCobrarNoCorrientes(Double cuentasComercialesPorCobrarYOtrasCuentasPorCobrarNoCorrientes) {
        this.cuentasComercialesPorCobrarYOtrasCuentasPorCobrarNoCorrientes = cuentasComercialesPorCobrarYOtrasCuentasPorCobrarNoCorrientes;
    }

    public Double getActivosPorImpuestosDiferidos() {
        return activosPorImpuestosDiferidos;
    }

    public void setActivosPorImpuestosDiferidos(Double activosPorImpuestosDiferidos) {
        this.activosPorImpuestosDiferidos = activosPorImpuestosDiferidos;
    }

    public Double getOtrosActivosNoFinancierosNoCorrientes() {
        return otrosActivosNoFinancierosNoCorrientes;
    }

    public void setOtrosActivosNoFinancierosNoCorrientes(Double otrosActivosNoFinancierosNoCorrientes) {
        this.otrosActivosNoFinancierosNoCorrientes = otrosActivosNoFinancierosNoCorrientes;
    }

    public Double getTotalDeActivosNoCorrientes() {
        return totalDeActivosNoCorrientes;
    }

    public void setTotalDeActivosNoCorrientes(Double totalDeActivosNoCorrientes) {
        this.totalDeActivosNoCorrientes = totalDeActivosNoCorrientes;
    }

    public Double getTotalDeActivos() {
        return totalDeActivos;
    }

    public void setTotalDeActivos(Double totalDeActivos) {
        this.totalDeActivos = totalDeActivos;
    }

    public Double getCuentasPorPagarComercialesYOtrasCuentasPorPagar() {
        return cuentasPorPagarComercialesYOtrasCuentasPorPagar;
    }

    public void setCuentasPorPagarComercialesYOtrasCuentasPorPagar(Double cuentasPorPagarComercialesYOtrasCuentasPorPagar) {
        this.cuentasPorPagarComercialesYOtrasCuentasPorPagar = cuentasPorPagarComercialesYOtrasCuentasPorPagar;
    }

    public Double getOtrosPasivosFinancierosCorrientes() {
        return otrosPasivosFinancierosCorrientes;
    }

    public void setOtrosPasivosFinancierosCorrientes(Double otrosPasivosFinancierosCorrientes) {
        this.otrosPasivosFinancierosCorrientes = otrosPasivosFinancierosCorrientes;
    }

    public Double getOtrosPasivosNoFinancierosCorrientes() {
        return otrosPasivosNoFinancierosCorrientes;
    }

    public void setOtrosPasivosNoFinancierosCorrientes(Double otrosPasivosNoFinancierosCorrientes) {
        this.otrosPasivosNoFinancierosCorrientes = otrosPasivosNoFinancierosCorrientes;
    }

    public Double getPasivosCorrientesTotales() {
        return pasivosCorrientesTotales;
    }

    public void setPasivosCorrientesTotales(Double pasivosCorrientesTotales) {
        this.pasivosCorrientesTotales = pasivosCorrientesTotales;
    }

    public Double getCuentasComercialesPorPagarYOtrasCuentasPorPagarNoCorrientes() {
        return CuentasComercialesPorPagarYOtrasCuentasPorPagarNoCorrientes;
    }

    public void setCuentasComercialesPorPagarYOtrasCuentasPorPagarNoCorrientes(Double cuentasComercialesPorPagarYOtrasCuentasPorPagarNoCorrientes) {
        CuentasComercialesPorPagarYOtrasCuentasPorPagarNoCorrientes = cuentasComercialesPorPagarYOtrasCuentasPorPagarNoCorrientes;
    }

    public Double getPasivoPorImpuestosDiferidos() {
        return pasivoPorImpuestosDiferidos;
    }

    public void setPasivoPorImpuestosDiferidos(Double pasivoPorImpuestosDiferidos) {
        this.pasivoPorImpuestosDiferidos = pasivoPorImpuestosDiferidos;
    }

    public Double getOtrosPasivosFinancierosNoCorrientes() {
        return otrosPasivosFinancierosNoCorrientes;
    }

    public void setOtrosPasivosFinancierosNoCorrientes(Double otrosPasivosFinancierosNoCorrientes) {
        this.otrosPasivosFinancierosNoCorrientes = otrosPasivosFinancierosNoCorrientes;
    }

    public Double getTotalDePasivosNoCorrientes() {
        return totalDePasivosNoCorrientes;
    }

    public void setTotalDePasivosNoCorrientes(Double totalDePasivosNoCorrientes) {
        this.totalDePasivosNoCorrientes = totalDePasivosNoCorrientes;
    }

    public Double getTotalPasivo() {
        return totalPasivo;
    }

    public void setTotalPasivo(Double totalPasivo) {
        this.totalPasivo = totalPasivo;
    }

    public Double getCapitalEmitido() {
        return capitalEmitido;
    }

    public void setCapitalEmitido(Double capitalEmitido) {
        this.capitalEmitido = capitalEmitido;
    }

    public Double getOtrasParticipacionesEnElPatrimonio() {
        return otrasParticipacionesEnElPatrimonio;
    }

    public void setOtrasParticipacionesEnElPatrimonio(Double otrasParticipacionesEnElPatrimonio) {
        this.otrasParticipacionesEnElPatrimonio = otrasParticipacionesEnElPatrimonio;
    }

    public Double getOtrasReservas() {
        return otrasReservas;
    }

    public void setOtrasReservas(Double otrasReservas) {
        this.otrasReservas = otrasReservas;
    }

    public Double getGananciasAcumuladas() {
        return gananciasAcumuladas;
    }

    public void setGananciasAcumuladas(Double gananciasAcumuladas) {
        this.gananciasAcumuladas = gananciasAcumuladas;
    }

    public Double getPatrimonioTotal() {
        return patrimonioTotal;
    }

    public void setPatrimonioTotal(Double patrimonioTotal) {
        this.patrimonioTotal = patrimonioTotal;
    }

    public Double getTotalDePatrimonioYPasivos() {
        return totalDePatrimonioYPasivos;
    }

    public void setTotalDePatrimonioYPasivos(Double totalDePatrimonioYPasivos) {
        this.totalDePatrimonioYPasivos = totalDePatrimonioYPasivos;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTipoDeEmpresa() {
        return tipoDeEmpresa;
    }

    public void setTipoDeEmpresa(String tipoDeEmpresa) {
        this.tipoDeEmpresa = tipoDeEmpresa;
    }

    public Double getIngresoDeActividadesOrdinales() {
        return ingresoDeActividadesOrdinales;
    }

    public void setIngresoDeActividadesOrdinales(Double ingresoDeActividadesOrdinales) {
        this.ingresoDeActividadesOrdinales = ingresoDeActividadesOrdinales;
    }

    public Double getCostoDeVentas() {
        return costoDeVentas;
    }

    public void setCostoDeVentas(Double costoDeVentas) {
        this.costoDeVentas = costoDeVentas;
    }

    public Double getGananciaBruta() {
        return gananciaBruta;
    }

    public void setGananciaBruta(Double gananciaBruta) {
        this.gananciaBruta = gananciaBruta;
    }

    public Double getOtrosIngresos() {
        return otrosIngresos;
    }

    public void setOtrosIngresos(Double otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }

    public Double getGastosDeAdministracion() {
        return gastosDeAdministracion;
    }

    public void setGastosDeAdministracion(Double gastosDeAdministracion) {
        this.gastosDeAdministracion = gastosDeAdministracion;
    }

    public Double getOtrosGastos() {
        return otrosGastos;
    }

    public void setOtrosGastos(Double otrosGastos) {
        this.otrosGastos = otrosGastos;
    }

    public Double getGananciaPerdidaPorActividadesDeOperacion() {
        return gananciaPerdidaPorActividadesDeOperacion;
    }

    public void setGananciaPerdidaPorActividadesDeOperacion(Double gananciaPerdidaPorActividadesDeOperacion) {
        this.gananciaPerdidaPorActividadesDeOperacion = gananciaPerdidaPorActividadesDeOperacion;
    }

    public Double getIngresosFinancieros() {
        return IngresosFinancieros;
    }

    public void setIngresosFinancieros(Double ingresosFinancieros) {
        IngresosFinancieros = ingresosFinancieros;
    }

    public Double getCostosFinancieros() {
        return CostosFinancieros;
    }

    public void setCostosFinancieros(Double costosFinancieros) {
        CostosFinancieros = costosFinancieros;
    }

    public Double getGananciaPerdidaAntesDeImpuestos() {
        return GananciaPerdidaAntesDeImpuestos;
    }

    public void setGananciaPerdidaAntesDeImpuestos(Double gananciaPerdidaAntesDeImpuestos) {
        GananciaPerdidaAntesDeImpuestos = gananciaPerdidaAntesDeImpuestos;
    }

    public Double getIngresoGastoPorImpuestos() {
        return IngresoGastoPorImpuestos;
    }

    public void setIngresoGastoPorImpuestos(Double ingresoGastoPorImpuestos) {
        IngresoGastoPorImpuestos = ingresoGastoPorImpuestos;
    }

    public Double getGananciaPerdidaProcedentedeOperacionesContinuadas() {
        return GananciaPerdidaProcedentedeOperacionesContinuadas;
    }

    public void setGananciaPerdidaProcedentedeOperacionesContinuadas(Double gananciaPerdidaProcedentedeOperacionesContinuadas) {
        GananciaPerdidaProcedentedeOperacionesContinuadas = gananciaPerdidaProcedentedeOperacionesContinuadas;
    }

    public Double getGananciaPerdidaprocedenteDeOperacionesDiscontinuadas() {
        return GananciaPerdidaprocedenteDeOperacionesDiscontinuadas;
    }

    public void setGananciaPerdidaprocedenteDeOperacionesDiscontinuadas(Double gananciaPerdidaprocedenteDeOperacionesDiscontinuadas) {
        GananciaPerdidaprocedenteDeOperacionesDiscontinuadas = gananciaPerdidaprocedenteDeOperacionesDiscontinuadas;
    }

    public Double getGananciaPerdida() {
        return GananciaPerdida;
    }

    public void setGananciaPerdida(Double gananciaPerdida) {
        GananciaPerdida = gananciaPerdida;
    }
}
