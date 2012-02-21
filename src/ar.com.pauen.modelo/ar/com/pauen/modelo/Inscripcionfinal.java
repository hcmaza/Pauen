package ar.com.pauen.modelo;
// Generated 21/02/2012 14:05:36 by Hibernate Tools 3.4.0.CR1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Inscripcionfinal generated by hbm2java
 */
@Entity
@Table(name="inscripcionfinal"
    ,catalog="sgaundec"
)
public class Inscripcionfinal  implements java.io.Serializable {


     private InscripcionfinalId id;

    public Inscripcionfinal() {
    }

    public Inscripcionfinal(InscripcionfinalId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="inscripcionId", column=@Column(name="inscripcionId", nullable=false) ), 
        @AttributeOverride(name="actaFinalId", column=@Column(name="actaFinalId", nullable=false) ), 
        @AttributeOverride(name="inscripcionFinalCondicion", column=@Column(name="inscripcionFinalCondicion", length=1) ), 
        @AttributeOverride(name="inscripcionFinalAnoRegularizacion", column=@Column(name="inscripcionFinalAnoRegularizacion") ) } )
    public InscripcionfinalId getId() {
        return this.id;
    }
    
    public void setId(InscripcionfinalId id) {
        this.id = id;
    }




}

