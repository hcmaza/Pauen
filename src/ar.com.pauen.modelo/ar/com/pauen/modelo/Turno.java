package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:36 by Hibernate Tools 3.4.0.CR1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Turno generated by hbm2java
 */
@Entity
@Table(name="turno"
    ,catalog="sgaundec"
)
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
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="turnoId", unique=true, nullable=false)
    public Integer getTurnoId() {
        return this.turnoId;
    }
    
    public void setTurnoId(Integer turnoId) {
        this.turnoId = turnoId;
    }

    
    @Column(name="cicloAno", nullable=false)
    public int getCicloAno() {
        return this.cicloAno;
    }
    
    public void setCicloAno(int cicloAno) {
        this.cicloAno = cicloAno;
    }

    
    @Column(name="turnoNombreId", nullable=false)
    public int getTurnoNombreId() {
        return this.turnoNombreId;
    }
    
    public void setTurnoNombreId(int turnoNombreId) {
        this.turnoNombreId = turnoNombreId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="turnoDesde", length=10)
    public Date getTurnoDesde() {
        return this.turnoDesde;
    }
    
    public void setTurnoDesde(Date turnoDesde) {
        this.turnoDesde = turnoDesde;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="turnoHasta", length=10)
    public Date getTurnoHasta() {
        return this.turnoHasta;
    }
    
    public void setTurnoHasta(Date turnoHasta) {
        this.turnoHasta = turnoHasta;
    }




}


