package ar.pauen.modelo;
// Generated 21/02/2012 14:25:42 by Hibernate Tools 3.4.0.CR1


import java.util.Date;

/**
 * Expediente generated by hbm2java
 */
public class Expediente  implements java.io.Serializable {


     private Integer expedienteId;
     private int inscriptoId;
     private int expedienteTipoId;
     private Integer expedienteDenominacionId;
     private String expedienteNumero;
     private Date expedienteFecha;
     private String expedienteObservaciones;
     private Date expedienteFechaRegistro;
     private Date expedienteFechaEntrada;
     private Date expedienteFechaSalida;
     private String expedienteNroResolucion;
     private Date expedienteFechaResolucion;

    public Expediente() {
    }

	
    public Expediente(int inscriptoId, int expedienteTipoId, String expedienteNroResolucion) {
        this.inscriptoId = inscriptoId;
        this.expedienteTipoId = expedienteTipoId;
        this.expedienteNroResolucion = expedienteNroResolucion;
    }
    public Expediente(int inscriptoId, int expedienteTipoId, Integer expedienteDenominacionId, String expedienteNumero, Date expedienteFecha, String expedienteObservaciones, Date expedienteFechaRegistro, Date expedienteFechaEntrada, Date expedienteFechaSalida, String expedienteNroResolucion, Date expedienteFechaResolucion) {
       this.inscriptoId = inscriptoId;
       this.expedienteTipoId = expedienteTipoId;
       this.expedienteDenominacionId = expedienteDenominacionId;
       this.expedienteNumero = expedienteNumero;
       this.expedienteFecha = expedienteFecha;
       this.expedienteObservaciones = expedienteObservaciones;
       this.expedienteFechaRegistro = expedienteFechaRegistro;
       this.expedienteFechaEntrada = expedienteFechaEntrada;
       this.expedienteFechaSalida = expedienteFechaSalida;
       this.expedienteNroResolucion = expedienteNroResolucion;
       this.expedienteFechaResolucion = expedienteFechaResolucion;
    }
   
    public Integer getExpedienteId() {
        return this.expedienteId;
    }
    
    public void setExpedienteId(Integer expedienteId) {
        this.expedienteId = expedienteId;
    }
    public int getInscriptoId() {
        return this.inscriptoId;
    }
    
    public void setInscriptoId(int inscriptoId) {
        this.inscriptoId = inscriptoId;
    }
    public int getExpedienteTipoId() {
        return this.expedienteTipoId;
    }
    
    public void setExpedienteTipoId(int expedienteTipoId) {
        this.expedienteTipoId = expedienteTipoId;
    }
    public Integer getExpedienteDenominacionId() {
        return this.expedienteDenominacionId;
    }
    
    public void setExpedienteDenominacionId(Integer expedienteDenominacionId) {
        this.expedienteDenominacionId = expedienteDenominacionId;
    }
    public String getExpedienteNumero() {
        return this.expedienteNumero;
    }
    
    public void setExpedienteNumero(String expedienteNumero) {
        this.expedienteNumero = expedienteNumero;
    }
    public Date getExpedienteFecha() {
        return this.expedienteFecha;
    }
    
    public void setExpedienteFecha(Date expedienteFecha) {
        this.expedienteFecha = expedienteFecha;
    }
    public String getExpedienteObservaciones() {
        return this.expedienteObservaciones;
    }
    
    public void setExpedienteObservaciones(String expedienteObservaciones) {
        this.expedienteObservaciones = expedienteObservaciones;
    }
    public Date getExpedienteFechaRegistro() {
        return this.expedienteFechaRegistro;
    }
    
    public void setExpedienteFechaRegistro(Date expedienteFechaRegistro) {
        this.expedienteFechaRegistro = expedienteFechaRegistro;
    }
    public Date getExpedienteFechaEntrada() {
        return this.expedienteFechaEntrada;
    }
    
    public void setExpedienteFechaEntrada(Date expedienteFechaEntrada) {
        this.expedienteFechaEntrada = expedienteFechaEntrada;
    }
    public Date getExpedienteFechaSalida() {
        return this.expedienteFechaSalida;
    }
    
    public void setExpedienteFechaSalida(Date expedienteFechaSalida) {
        this.expedienteFechaSalida = expedienteFechaSalida;
    }
    public String getExpedienteNroResolucion() {
        return this.expedienteNroResolucion;
    }
    
    public void setExpedienteNroResolucion(String expedienteNroResolucion) {
        this.expedienteNroResolucion = expedienteNroResolucion;
    }
    public Date getExpedienteFechaResolucion() {
        return this.expedienteFechaResolucion;
    }
    
    public void setExpedienteFechaResolucion(Date expedienteFechaResolucion) {
        this.expedienteFechaResolucion = expedienteFechaResolucion;
    }




}


