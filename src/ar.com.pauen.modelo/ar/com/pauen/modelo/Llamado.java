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
 * Llamado generated by hbm2java
 */
@Entity
@Table(name="llamado"
    ,catalog="sgaundec"
)
public class Llamado  implements java.io.Serializable {


     private Integer llamadoId;
     private int turnoId;
     private Integer llamadoNumero;
     private Date llamadoDesde;
     private Date llamadoHasta;

    public Llamado() {
    }

	
    public Llamado(int turnoId) {
        this.turnoId = turnoId;
    }
    public Llamado(int turnoId, Integer llamadoNumero, Date llamadoDesde, Date llamadoHasta) {
       this.turnoId = turnoId;
       this.llamadoNumero = llamadoNumero;
       this.llamadoDesde = llamadoDesde;
       this.llamadoHasta = llamadoHasta;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="llamadoId", unique=true, nullable=false)
    public Integer getLlamadoId() {
        return this.llamadoId;
    }
    
    public void setLlamadoId(Integer llamadoId) {
        this.llamadoId = llamadoId;
    }

    
    @Column(name="turnoId", nullable=false)
    public int getTurnoId() {
        return this.turnoId;
    }
    
    public void setTurnoId(int turnoId) {
        this.turnoId = turnoId;
    }

    
    @Column(name="llamadoNumero")
    public Integer getLlamadoNumero() {
        return this.llamadoNumero;
    }
    
    public void setLlamadoNumero(Integer llamadoNumero) {
        this.llamadoNumero = llamadoNumero;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="llamadoDesde", length=10)
    public Date getLlamadoDesde() {
        return this.llamadoDesde;
    }
    
    public void setLlamadoDesde(Date llamadoDesde) {
        this.llamadoDesde = llamadoDesde;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="llamadoHasta", length=10)
    public Date getLlamadoHasta() {
        return this.llamadoHasta;
    }
    
    public void setLlamadoHasta(Date llamadoHasta) {
        this.llamadoHasta = llamadoHasta;
    }




}

