package ar.pauen.modelo;
// Generated 21/02/2012 14:25:42 by Hibernate Tools 3.4.0.CR1



/**
 * Equivalencia generated by hbm2java
 */
public class Equivalencia  implements java.io.Serializable {


     private Integer equivalenciaId;
     private int materiaId;
     private Integer equivalenciaTipo;
     private Integer expedienteId;
     private Integer equivalenciaNota;

    public Equivalencia() {
    }

	
    public Equivalencia(int materiaId) {
        this.materiaId = materiaId;
    }
    public Equivalencia(int materiaId, Integer equivalenciaTipo, Integer expedienteId, Integer equivalenciaNota) {
       this.materiaId = materiaId;
       this.equivalenciaTipo = equivalenciaTipo;
       this.expedienteId = expedienteId;
       this.equivalenciaNota = equivalenciaNota;
    }
   
    public Integer getEquivalenciaId() {
        return this.equivalenciaId;
    }
    
    public void setEquivalenciaId(Integer equivalenciaId) {
        this.equivalenciaId = equivalenciaId;
    }
    public int getMateriaId() {
        return this.materiaId;
    }
    
    public void setMateriaId(int materiaId) {
        this.materiaId = materiaId;
    }
    public Integer getEquivalenciaTipo() {
        return this.equivalenciaTipo;
    }
    
    public void setEquivalenciaTipo(Integer equivalenciaTipo) {
        this.equivalenciaTipo = equivalenciaTipo;
    }
    public Integer getExpedienteId() {
        return this.expedienteId;
    }
    
    public void setExpedienteId(Integer expedienteId) {
        this.expedienteId = expedienteId;
    }
    public Integer getEquivalenciaNota() {
        return this.equivalenciaNota;
    }
    
    public void setEquivalenciaNota(Integer equivalenciaNota) {
        this.equivalenciaNota = equivalenciaNota;
    }




}


