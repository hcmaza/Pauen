package ar.pauen.modelo;
// Generated 21/02/2012 14:25:42 by Hibernate Tools 3.4.0.CR1



/**
 * Regularidad generated by hbm2java
 */
public class Regularidad  implements java.io.Serializable {


     private Integer regularidadId;
     private int inscriptoId;
     private int actaRegularidadId;
     private Double regularidadAsistencia;
     private Integer regularidadNota;
     private Character regularidadCondicion;
     private Integer regularidadDuracion;

    public Regularidad() {
    }

	
    public Regularidad(int inscriptoId, int actaRegularidadId) {
        this.inscriptoId = inscriptoId;
        this.actaRegularidadId = actaRegularidadId;
    }
    public Regularidad(int inscriptoId, int actaRegularidadId, Double regularidadAsistencia, Integer regularidadNota, Character regularidadCondicion, Integer regularidadDuracion) {
       this.inscriptoId = inscriptoId;
       this.actaRegularidadId = actaRegularidadId;
       this.regularidadAsistencia = regularidadAsistencia;
       this.regularidadNota = regularidadNota;
       this.regularidadCondicion = regularidadCondicion;
       this.regularidadDuracion = regularidadDuracion;
    }
   
    public Integer getRegularidadId() {
        return this.regularidadId;
    }
    
    public void setRegularidadId(Integer regularidadId) {
        this.regularidadId = regularidadId;
    }
    public int getInscriptoId() {
        return this.inscriptoId;
    }
    
    public void setInscriptoId(int inscriptoId) {
        this.inscriptoId = inscriptoId;
    }
    public int getActaRegularidadId() {
        return this.actaRegularidadId;
    }
    
    public void setActaRegularidadId(int actaRegularidadId) {
        this.actaRegularidadId = actaRegularidadId;
    }
    public Double getRegularidadAsistencia() {
        return this.regularidadAsistencia;
    }
    
    public void setRegularidadAsistencia(Double regularidadAsistencia) {
        this.regularidadAsistencia = regularidadAsistencia;
    }
    public Integer getRegularidadNota() {
        return this.regularidadNota;
    }
    
    public void setRegularidadNota(Integer regularidadNota) {
        this.regularidadNota = regularidadNota;
    }
    public Character getRegularidadCondicion() {
        return this.regularidadCondicion;
    }
    
    public void setRegularidadCondicion(Character regularidadCondicion) {
        this.regularidadCondicion = regularidadCondicion;
    }
    public Integer getRegularidadDuracion() {
        return this.regularidadDuracion;
    }
    
    public void setRegularidadDuracion(Integer regularidadDuracion) {
        this.regularidadDuracion = regularidadDuracion;
    }




}

