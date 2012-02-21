package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:36 by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tipoinscripcion generated by hbm2java
 */
@Entity
@Table(name="tipoinscripcion"
    ,catalog="sgaundec"
)
public class Tipoinscripcion  implements java.io.Serializable {


     private Integer tipoInscripcionId;
     private String tipoInscripcionDescripcion;
     private Integer tipoInscripcionUnoEnCiclo;

    public Tipoinscripcion() {
    }

    public Tipoinscripcion(String tipoInscripcionDescripcion, Integer tipoInscripcionUnoEnCiclo) {
       this.tipoInscripcionDescripcion = tipoInscripcionDescripcion;
       this.tipoInscripcionUnoEnCiclo = tipoInscripcionUnoEnCiclo;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="tipoInscripcionId", unique=true, nullable=false)
    public Integer getTipoInscripcionId() {
        return this.tipoInscripcionId;
    }
    
    public void setTipoInscripcionId(Integer tipoInscripcionId) {
        this.tipoInscripcionId = tipoInscripcionId;
    }

    
    @Column(name="tipoInscripcionDescripcion", length=60)
    public String getTipoInscripcionDescripcion() {
        return this.tipoInscripcionDescripcion;
    }
    
    public void setTipoInscripcionDescripcion(String tipoInscripcionDescripcion) {
        this.tipoInscripcionDescripcion = tipoInscripcionDescripcion;
    }

    
    @Column(name="tipoInscripcionUnoEnCiclo")
    public Integer getTipoInscripcionUnoEnCiclo() {
        return this.tipoInscripcionUnoEnCiclo;
    }
    
    public void setTipoInscripcionUnoEnCiclo(Integer tipoInscripcionUnoEnCiclo) {
        this.tipoInscripcionUnoEnCiclo = tipoInscripcionUnoEnCiclo;
    }




}

