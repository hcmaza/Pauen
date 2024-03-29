package ar.pauen.modelo;
// Generated 21/02/2012 14:25:42 by Hibernate Tools 3.4.0.CR1


import java.util.Date;

/**
 * Turno generated by hbm2java
 */
public class Turno  implements java.io.Serializable {


     private Integer turnoId;
     private int cicloAno;
     private int turnoNombreId;
     private Date turnoDesde;
     private Date turnoHasta;

    public Turno() {
    }

	
    public Turno(int cicloAno, int turnoNombreId) {
        this.cicloAno = cicloAno;
        this.turnoNombreId = turnoNombreId;
    }
    public Turno(int cicloAno, int turnoNombreId, Date turnoDesde, Date turnoHasta) {
       this.cicloAno = cicloAno;
       this.turnoNombreId = turnoNombreId;
       this.turnoDesde = turnoDesde;
       this.turnoHasta = turnoHasta;
    }
   
    public Integer getTurnoId() {
        return this.turnoId;
    }
    
    public void setTurnoId(Integer turnoId) {
        this.turnoId = turnoId;
    }
    public int getCicloAno() {
        return this.cicloAno;
    }
    
    public void setCicloAno(int cicloAno) {
        this.cicloAno = cicloAno;
    }
    public int getTurnoNombreId() {
        return this.turnoNombreId;
    }
    
    public void setTurnoNombreId(int turnoNombreId) {
        this.turnoNombreId = turnoNombreId;
    }
    public Date getTurnoDesde() {
        return this.turnoDesde;
    }
    
    public void setTurnoDesde(Date turnoDesde) {
        this.turnoDesde = turnoDesde;
    }
    public Date getTurnoHasta() {
        return this.turnoHasta;
    }
    
    public void setTurnoHasta(Date turnoHasta) {
        this.turnoHasta = turnoHasta;
    }




}


