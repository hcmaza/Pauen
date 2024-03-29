package ar.pauen.modelo;
// Generated 21/02/2012 14:25:42 by Hibernate Tools 3.4.0.CR1


import java.util.Date;

/**
 * Actaingreso generated by hbm2java
 */
public class Actaingreso  implements java.io.Serializable {


     private Integer actaIngresoId;
     private int periodoId;
     private int materiaId;
     private Date actaIngresoLimitePresentacion;
     private Date actaIngresoFecha;
     private String actaIngresoEstado;
     private String actaIngresoObservaciones;

    public Actaingreso() {
    }

	
    public Actaingreso(int periodoId, int materiaId) {
        this.periodoId = periodoId;
        this.materiaId = materiaId;
    }
    public Actaingreso(int periodoId, int materiaId, Date actaIngresoLimitePresentacion, Date actaIngresoFecha, String actaIngresoEstado, String actaIngresoObservaciones) {
       this.periodoId = periodoId;
       this.materiaId = materiaId;
       this.actaIngresoLimitePresentacion = actaIngresoLimitePresentacion;
       this.actaIngresoFecha = actaIngresoFecha;
       this.actaIngresoEstado = actaIngresoEstado;
       this.actaIngresoObservaciones = actaIngresoObservaciones;
    }
   
    public Integer getActaIngresoId() {
        return this.actaIngresoId;
    }
    
    public void setActaIngresoId(Integer actaIngresoId) {
        this.actaIngresoId = actaIngresoId;
    }
    public int getPeriodoId() {
        return this.periodoId;
    }
    
    public void setPeriodoId(int periodoId) {
        this.periodoId = periodoId;
    }
    public int getMateriaId() {
        return this.materiaId;
    }
    
    public void setMateriaId(int materiaId) {
        this.materiaId = materiaId;
    }
    public Date getActaIngresoLimitePresentacion() {
        return this.actaIngresoLimitePresentacion;
    }
    
    public void setActaIngresoLimitePresentacion(Date actaIngresoLimitePresentacion) {
        this.actaIngresoLimitePresentacion = actaIngresoLimitePresentacion;
    }
    public Date getActaIngresoFecha() {
        return this.actaIngresoFecha;
    }
    
    public void setActaIngresoFecha(Date actaIngresoFecha) {
        this.actaIngresoFecha = actaIngresoFecha;
    }
    public String getActaIngresoEstado() {
        return this.actaIngresoEstado;
    }
    
    public void setActaIngresoEstado(String actaIngresoEstado) {
        this.actaIngresoEstado = actaIngresoEstado;
    }
    public String getActaIngresoObservaciones() {
        return this.actaIngresoObservaciones;
    }
    
    public void setActaIngresoObservaciones(String actaIngresoObservaciones) {
        this.actaIngresoObservaciones = actaIngresoObservaciones;
    }




}


