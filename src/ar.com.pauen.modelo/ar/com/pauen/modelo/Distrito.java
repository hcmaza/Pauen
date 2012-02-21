package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:36 by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Distrito generated by hbm2java
 */
@Entity
@Table(name="distrito"
    ,catalog="sgaundec"
)
public class Distrito  implements java.io.Serializable {


     private Integer distritoId;
     private String distritoNombre;
     private int departamentoId;

    public Distrito() {
    }

	
    public Distrito(int departamentoId) {
        this.departamentoId = departamentoId;
    }
    public Distrito(String distritoNombre, int departamentoId) {
       this.distritoNombre = distritoNombre;
       this.departamentoId = departamentoId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="distritoId", unique=true, nullable=false)
    public Integer getDistritoId() {
        return this.distritoId;
    }
    
    public void setDistritoId(Integer distritoId) {
        this.distritoId = distritoId;
    }

    
    @Column(name="distritoNombre", length=60)
    public String getDistritoNombre() {
        return this.distritoNombre;
    }
    
    public void setDistritoNombre(String distritoNombre) {
        this.distritoNombre = distritoNombre;
    }

    
    @Column(name="departamentoId", nullable=false)
    public int getDepartamentoId() {
        return this.departamentoId;
    }
    
    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }




}


